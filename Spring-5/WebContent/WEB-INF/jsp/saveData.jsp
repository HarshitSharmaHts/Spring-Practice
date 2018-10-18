<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>

<!DOCTYPE html>
<html>
<head>
<title>Save Product</title>
</head>
<body>
<div id="global">
    <h4>The product has been saved.</h4>
        <h5>Details:</h5>
        Product Name: ${user.name}<br/>
        Description: ${user.description}<br/>
        <p>Following files are uploaded successfully.</p>
        <ol>
        <c:forEach items="${user.images}" var="image">
            <li>${image.originalFilename}
            <img width="100" src="<c:url value="/image/"/>${image.originalFilename}"/>
            </li>
        </c:forEach>
        </ol>
</div>
</body>
</html>