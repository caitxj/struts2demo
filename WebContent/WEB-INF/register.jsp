<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<h4><s:text name="homepage.greeting"/></h4>
<hr>
<h5><s:text name="site.entrance.text"/></h5>
<h5><a href="<s:url action='VisitorHomePage'/>">
<s:text name="visitor"/>
</a></h5>
<h5><a href="<s:url action='ArtistHomePage'/>"><s:text name="user"/></a>
</h5>
<hr>

<h4>
<s:fielderror/>
</h4>
<form action="doform.action" method="post">
username:<input name="username"><br/>
password:<input name="password"><br/>
<input type="submit" value="register">
<a href="<s:url value='forwardHello.action'/>">Link to Hello</a>
</form>
</body>
</html>