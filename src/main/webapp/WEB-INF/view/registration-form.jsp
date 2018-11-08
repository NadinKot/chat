<%--
  Created by IntelliJ IDEA.
  User: nkotliar
  Date: 12/10/2018
  Time: 17:30
  To change this template use File | Settings | File Templates.
--%>
<%@page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
    <title>New User</title>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <link rel="stylesheet" href="/webjars/bootstrap/4.1.3/css/bootstrap.min.css">
    <script src=/webjars/jquery/3.3.1/jquery.min.js"></script>
    <script src="/webjars/bootstrap/4.1.3/js/bootstrap.min.js"></script>
</head>
<body>
<div class="container" style="margin-top: 50px;">
    <h3>Create new user</h3>
    <form:form action="submitRegistrationForm" modelAttribute="user" method="post">
        <div class="form-group row">
            <label class="col-form-label col-sm-2" for="name">First name:</label>
            <div class="col-sm-10">
                <form:input path="firstName" type="text" class="form-control" id="name"/>
            </div>
        </div>
        <div class="form-group row">
            <label class="col-form-label col-sm-2" for="second_name">Last name:</label>
            <div class="col-sm-10">
                <form:input path="lastName" type="text" class="form-control" id="second_name"/>
            </div>
        </div>
        <div class="form-group row">
            <label class="col-form-label col-sm-2" for="gender">Gender:</label>
            <div class="col-sm-10">
                <form:select path="gender" class="form-control" id="gender">
                    <form:option value="male" label="male"/>
                    <form:option value="female" label="female"/>
                </form:select>
            </div>
        </div>
        <div class="form-group row">
            <label class="col-form-label col-sm-2" for="birthday">Birthday:</label>
            <div class="col-sm-10">
                <form:input path="birthday" type="date" class="form-control" id="birthday"/>
            </div>
        </div>
        <div class="form-group row">
            <label class="col-form-label col-sm-2" for="email">E-Mail:</label>
            <div class="col-sm-10">
                <form:input path="email" type="email" class="form-control" id="email"/>
            </div>
        </div>
        <div class="form-group row">
            <label class="col-form-label col-sm-2" for="phone">Mobile phone:</label>
            <div class="col-sm-10">
                <form:input path="telNumber" type="tel" class="form-control" id="phone"/>
            </div>
        </div>
        <div class="form-group row">
            <label class="col-form-label col-sm-2" for="info">Information about yourself:</label>
            <div class="col-sm-10">
                <form:textarea path="info" class="form-control" rows="5" id="info"/>
            </div>
        </div>
        <div class="form-group row">
            <label class="col-form-label col-sm-2"  for="login">Login:</label>
            <div class="col-sm-10">
                <form:input path="userAuth.login" type="text" class="form-control" id="login"/>
            </div>
        </div>
        <div class="form-group row">
            <label class="col-form-label col-sm-2"  for="pass">Password:</label>
            <div class="col-sm-10">
                <form:input path="userAuth.password" type="password" class="form-control" id="pass"/>
            </div>
        </div>
        <!--<tr>
            <td><label>Repeat password:</label></td>
            <td><form path="repeatPassword"/></td>
        </tr>-->
        <div class="btn-group row">
            <button type="submit" class="btn btn-success">Register</button>
            <button type="button" class="btn" >Cancel</button>
        </div>
    </form:form>
</div>

</body>
</html>
