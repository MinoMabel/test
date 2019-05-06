<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>customer</title>
</head>
<body>
   <form:form action="add" method="post" modelAttribute="customer">
   <p>id</p>
   <p>
    <input type="text" name="custId" />
    </p>
    <p>Name</p>
    <p><input type="text" name="custName"></p>
    <p>Address</p>
    <p><input type="text" name="address" />
    </p>
    <p> <input type="submit" value="Add"/></p>
    </form:form>
</body>
</html>