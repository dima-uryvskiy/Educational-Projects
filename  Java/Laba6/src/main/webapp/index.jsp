<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>LabWork6</title>
</head>
<body>
<form action="/Servlet" method="GET">
    <p>Имя изображения: <input type="text" name="image"/></p>
    <input type="submit" value="Ввести имя"/></br>
    <p>${error}</p>
</form>
<img src="data:image/jpg;base64,${byteString}" />
</body>
</html>