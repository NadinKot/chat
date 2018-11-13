<%--
  Created by IntelliJ IDEA.
  User: nkotliar
  Date: 12/10/2018
  Time: 16:01
  To change this template use File | Settings | File Templates.
--%>
<!doctype html>
<html lang="en">
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="s" uri="http://www.springframework.org/tags" %>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<html>
<head>
    <title>List Users</title>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <link rel="stylesheet" href="/webjars/bootstrap/4.1.3/css/bootstrap.min.css">


</head>
<body>
<h2>${message}</h2>
<div class="container">
    <div id="header">
        <h3>All registered users</h3>
    </div>
    <div id="container">
        <div>
            <input class="form-control" id="dynamicFilter" type="text"
                   placeholder="Search the Person by name, or by surname, or by E-mail">
        </div>
        <div id="content">
            <table id="userTable" class="table table-striped table-bordered table-sm">
                <thead class="thead-light">
                <tr>
                    <th>First Name</th>
                    <th>Last Name</th>
                    <th>Email</th>
                    <th>Phone Number</th>
                </tr>
                </thead>
                <c:forEach var="tempUser" items="${users}">
                    <tr>
                        <td> ${tempUser.firstName} </td>
                        <td> ${tempUser.lastName} </td>
                        <td> ${tempUser.email} </td>
                        <td> ${tempUser.telNumber}</td>
                    </tr>
                </c:forEach>
            </table>
            <form action="searchUser" method="Get">
                <div class="input-group mb-3">
                    <input type="text" class="form-control" placeholder="Search Person">
                    <div class="input-group-append">
                        <button class="btn btn-info" type="submit">Go</button>
                    </div>
                </div>
            </form>
        </div>
    </div>
</div>

<script src="/webjars/jquery/3.3.1/jquery.min.js"></script>
<script src="/webjars/bootstrap/4.1.3/js/bootstrap.min.js"></script>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js"></script>


<script src="<c:url value="/assets/js/sendAjax.js" />"></script>
<script src="<c:url value="/assets/js/dynamicFilter.js" />"></script>
</body>
</html>