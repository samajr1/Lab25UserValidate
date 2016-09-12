package com.Ableson.Lab25ValidateUser;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;


/**
 * Handles requests for the application home page.
 */
@Controller
public class WebController extends WebMvcConfigurerAdapter {

    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/results").setViewName("results");
    }
    
    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String showPersonForm(Model model) {
    	
    	PersonForm personForm = new PersonForm();
    	model.addAttribute("PersonForm", personForm);
        return "form";
    }

    @RequestMapping(value = "/", method = RequestMethod.POST)
    public String checkPersonInfo(@ModelAttribute("PersonForm") @Valid PersonForm personForm, BindingResult bindingResult, Model model) {

        if (bindingResult.hasErrors()) {
            return "form";
        }

        return "results";
    }
}

//@Controller
//@RequestMapping(value = "/", method = RequestMethod.POST)
//	public String saveOrUpdateUser(@ModelAttribute("userForm") @Valid PersonForm person, BindingResult result, Model model) {
//	
//		if (result.hasErrors()) {
//			//...
//		} else {
//			//...
//		}
//}