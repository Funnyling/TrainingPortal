<%--
  Created by IntelliJ IDEA.
  User: user
  Date: 07.03.2015
  Time: 16:50
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Training Portal</title>
    <meta http-equiv="X-UA-COMPATIBLE" content="IE=edge"/>
    <meta name="viewport" content="width=device-width, initial-scale=1"/>
    <link href="<c:url value='/resources/css/bootstrap.css'/>" rel="stylesheet"/>
    <link href="<c:url value='/resources/css/bootstrap-theme.min.css'/>" rel="stylesheet"/>
    <link href="<c:url value='/resources/css/training-portal.css'/>" rel="stylesheet"/>
</head>
<body>
    <form class="form-signin" action="signin.html" method="post">
        <h2 class="form-signin-heading">Please sign in</h2>
        <label for="j_username" class="sr-only">Login</label>
        <input id="j_username" name="j_username" class="form-control" placeholder="Email address" required="" autofocus="" type="text">
        <label for="j_password" class="sr-only">Password</label>
        <input id="j_password" name="j_password" placeholder="Password" required="" type="password">

        <div class="checkbox">
            <label for="remember_me">
                <input id="remember_me" name="_spring_security_remember_me" type="checkbox"> Remember me
            </label>
        </div>
        <button class="btn btn-lg btn-primary btn-block" type="submit">Sign in</button>
    </form>

    <footer>
        <hr/>
        <div class="container">
            <p class="text-right">Copyright &copy; Artezio</p>
        </div>
    </footer>

    <script type="application/javascript" src="<c:url value='/resources/js/jquery-1.11.2.js'/>"></script>
    <script type="application/javascript" src="<c:url value='/resources/js/jquery.cookie.js'/>"></script>
    <script type="application/javascript" src="<c:url value='/resources/js/bootstrap.min.js'/>"></script>
    <script type="application/javascript" src="<c:url value='/resources/js/training-portal.js'/>"></script>
</body>
</html>
