<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
  <title>Training Portal</title>
  <meta charset="UTF-8"/>
  <meta http-equiv="X-UA-COMPATIBLE" content="IE=edge"/>
  <meta name="viewport" content="width=device-width, initial-scale=1"/>
  <link href="<c:url value='/resources/css/bootstrap.css'/>" rel="stylesheet"/>
  <link href="<c:url value='/resources/css/bootstrap-theme.min.css'/>" rel="stylesheet"/>

</head>
<body>
<h1>Hello World!</h1>
<c:if test="${currentUser ne null}">
  <h1>Hello ${currentUser}!</h1>
</c:if>
</body>
</html>
