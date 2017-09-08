<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="s" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form"%>
<html>
<head>
<style>
@import url(https://fonts.googleapis.com/css?family=Open+Sans);

body {
	background: #f2f2f2;
	font-family: 'Open Sans', sans-serif;
}

.register {
	margin: 0 auto;
	width: 300px;
	margin-top: 200px;
}

input {
	margin-bottom: 3px;
	padding: 10px;
	width: 100%;
	border: 1px solid #CCC
}

button {
	padding: 10px
}

label {
	cursor: pointer
}

#form-switch {
	display: none
}

#register-form {
	display: none
}

#form-switch:checked ~#register-form {
	display: block
}

#form-switch:checked ~#login-form {
	display: none
}

ul {
	list-style-type: none;
	margin: 0;
	padding: 0;
	overflow: hidden;
	background-color: #333;
}

li {
	float: left;
}

li a {
	display: block;
	color: white;
	text-align: center;
	padding: 14px 16px;
	text-decoration: none;
}

li a:hover {
	background-color: #111; . wrapper { border : 1px solid #000;
	display: inline-block;
}

input, button {
	background-color: transparent;
	border: 0;
}
}
</style>
</head>
<body>

	
<div class = "register">
		<input type="text" placeholder="Username" required> 
		<input type="text" placeholder="First Name" required>
		<input type="text" placeholder="Last Name" required>
		<input	type="password" placeholder="Password" required>
		<button type='submit'>Register</button>
		<form><button  formaction="http://localhost:8080/twitter/">Login</button></form>
</div>
</body>
</html>
