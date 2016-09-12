<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<%-- <%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%> --%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<html>
<head>
	<title>Home</title>
</head>
<body>
    <body>
<!--     		<spring: url value="/" var="userActionUrl" /> -->
    
		    <form:form method="post" modelAttribute="PersonForm" action="${userActionUrl}">
				<label>Name: </label>
				<form:input path="name" type="text" id="name" />
				<form:errors path="name" /><br>
				
				<label>Age: </label>
				<form:input path="age" type="number" id="age" />
				<form:errors path="age" /><br>
				<button type="submit">Submit</button>
			</form:form>
    
       <%-- <form action="${PersonForm}" method="post">
            <table>
                <tr>
                	<td>Name: </td>
                    <td><input type="text" form:name path="name"/></td>
                    <td><form:errors path="name" cssClass="error"/></td>
                </tr>
                <tr>
                	<td>Age: </td>
                    <td><input type="number" form:age path="age"/></td>
                    <td><form:errors path="age" cssClass="error"/></td>
                </tr>
                <tr>
                    <button type="submit">Submit</button>
                </tr>
            </table>
        </form> --%>
    </body>
</body>
</html>
