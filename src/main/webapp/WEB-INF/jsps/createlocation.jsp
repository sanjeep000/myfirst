<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<pre>
 <form action="saveLoc" method="post">
 Id:<input type="text" name="id"/>
 Code:<input type="text" name="code"/>
 Name:<input type="text"name="name"/>
 Designation:<input type="text" name="designation"/>
  <input type="submit" name="save"/>
 </pre>
 </form>
 ${msg}
</body>
</html>