
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>图书列表</title>
</head>
<body>
<table>
    <tr>
        <th>id</th>
        <th>图书名</th>
        <th>价格</th>
        <th>作者</th>
    </tr>
    <c:forEach items="${booklist}" var="book">
        <tr>
            <td>${book.id}</td>
            <td>${book.name}</td>
            <td>${book.price}</td>
            <td>${book.author}</td>
        </tr>
    </c:forEach>

</table>
</body>
</html>
