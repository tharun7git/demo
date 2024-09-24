<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>User List</title>
</head>
<body>
    <h1>User List</h1>
    <table>
        <thead>
            <tr>
                <th>ID</th>
                <th>Name</th>
                <th>Phone</th>
            </tr>
        </thead>
        <tbody>
            <c:forEach var="user" items="${user}">
                <tr>
                    <td>${user.id}</td>
                    <td>${user.name}</td>
                    <td>${user.phn}</td>
                </tr>
            </c:forEach>
        </tbody>
    </table>
</body>
</html>
