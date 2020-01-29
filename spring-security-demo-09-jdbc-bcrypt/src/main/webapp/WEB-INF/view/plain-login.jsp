<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>

<head>
	<title>Custom Login Page</title>
</head>

<body>
	<h3>My Custom Login Page</h3>
	
	<form:form action="${pageContext.request.contextPath}/authenticateTheUser" method="POST">
	
	<!-- Check for login error -->
	
	<c:if test="${param.error != null}">
		<i>Sorry! You entered invalid username/password</i> <br><br>
	</c:if>
	
		<label>User name:</label>
		<input type="text" name="username" /> <br><br>
		
		<label>Password:</label>
		<input type="password" name="password" /> <br><br>
		
		<input type="submit" value="Login" />
	
	</form:form>
</body>

</html>