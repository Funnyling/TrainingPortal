<%@include file="../include.jsp"%>
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
    <div class="container">
        <div class="row">
            <div class="col-lg-12">
                <form:form cssClass="form-signin" id="registration" method="post" modelAttribute="user">
                    <div class="form-group">
                        <form:label path="login">Логин</form:label>
                        <form:input path="login" cssClass="form-control" maxlength="50"/>
                        <form:errors cssClass="error" path="login"/>
                    </div>
                    <div class="form-group">
                        <form:label path="email">Почтовый адрес</form:label>
                        <form:input path="email" cssClass="form-control" maxlength="200"/>
                        <form:errors cssClass="error" path="email"/>
                    </div>
                    <div class="form-group">
                        <form:label path="password">Пароль</form:label>
                        <form:input path="password" cssClass="form-control"/>
                        <form:errors cssClass="error" path="password"/>
                    </div>
                    <div class="form-group">
                        <form:label path="name">Имя</form:label>
                        <form:input path="name" cssClass="form-control" maxlength="200"/>
                        <form:errors cssClass="error" path="name"/>
                    </div>
                    <div class="btn-toolbar">
                        <button class="btn btn-primary" type="submit">Создать</button>
                        <a class="btn btn-danger" href="main.html"><span class="btn-back">Отмена</a>
                    </div>
                </form:form>
            </div>
        </div>
    </div>

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
