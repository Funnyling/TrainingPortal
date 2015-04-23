<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
    <title></title>
</head>
<body>
  <button onclick="sendAjax()">CLICK ME</button>
  <button onclick="getFile()">CLICK ME</button>
  <script type="application/javascript" src="<c:url value='/resources/js/jquery-1.11.2.js'/>"></script>
  <script type="application/javascript" src="<c:url value='/resources/js/jquery.cookie.js'/>"></script>
  <script type="application/javascript" src="<c:url value='/resources/js/bootstrap.min.js'/>"></script>
  <script type="application/javascript" src="<c:url value='/resources/js/training-portal.js'/>"></script>
</body>
</html>
