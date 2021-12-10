
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>添加图书</title>
</head>
<body>
<form name="accountForm" action="${pageContext.request.contextPath}/book/save" method="post">
    图书名:<input type="text" name="name"><br>
    价格:<input type="text" name="price"><br>
    作者:<input type="text" name="author"><br>
    <input type="submit" value="保存"><br>
</form>
</body>
</html>
