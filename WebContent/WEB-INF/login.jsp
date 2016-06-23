<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
  <%@ taglib prefix ="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<!-- <ul> -->
<%-- 	<li><s:textfield name="user.name"/></li> --%>
<!-- </ul> -->
<!-- <form method="post" action="formAction.action"> -->
<!-- 	name:<input type="text" name="user.name"/> -->
<!-- 	pwd:<input type="text" name="user.pwd"/> -->
<!-- 	<input type="submit" value="提交"> -->
<!-- </form> -->

<!-- <form action="uploadFile.action" method="post" enctype="multipart/form-data"> -->
<!-- file:<input type="file" name="upImage" /> -->
<!-- <input type="submit" value="upload" /> -->
<!-- </form> -->

<h1>login Page</h1>
<h3>MSG:<s:property value="msg"/></h3>
<h1>WWE</h1>
<a href="#"><s:property value="user.name"/></a>

<script src="jquery-1.12.4.js"></script>
<script>
	function a1(){
		alert("a1");
	}
	function a2(){
		alert("a2");
	}
	
	$(function(){
			var defer=$.ajax("ajaxOut.action").done([a1,a2]);
	});

</script>
</body>
</html>