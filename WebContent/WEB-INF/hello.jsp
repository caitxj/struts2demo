<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
  <%@ taglib prefix ="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<style type="text/css">
.input{
	width:100px;
	height:50px;
}
</style>
</head>
<body>
<h1>WWWE
<s:fielderror/>
</h1>
<!-- <ul> -->
<%-- 	<li><s:textfield name="user.name"/></li> --%>
<!-- </ul> -->
<form method="post" action="firstAction.action">
<!-- 	name:<input type="text" name="user.name"/> -->
<!-- 	pwd:<input type="text" name="user.pwd"/> -->
	crile:<input type="text" name="circle" />
	<input type="submit" value="提交">
</form>
<hr>
s:pro-origin:<s:property value="user.name"/>
set value:<s:set name="msg" value="WWE11111111"/>
s:pro-after-set:<s:property value="msg"/>
<!-- <form action="uploadFile.action" method="post" enctype="multipart/form-data"> -->
<!-- file:<input type="file" name="upImage" /> -->
<!-- <input type="submit" value="upload" /> -->
<!-- </form> -->
<hr/>
<%-- <s:set name="username" scope="application" value="MJJJJJJJJ"/> --%>
<%-- Hello, <s:property value="#application['username']"/>. How are you? --%>
<s:push value="user">
This is the "<s:property value="user.name"/>" portfolio,
created by none other than <s:property value="user.pwd"/>
</s:push>
<hr/>
<s:include value="test_include.jsp"/>
s:url===><s:url namespace="/security/login" action="formAction"/>
<%-- userp:<s:property value="userp"/> --%>
sbean:
<s:bean name="com.cai.util.Counter" var="counter">
<s:param name="last" value="12"/>
</s:bean>
<s:iterator value="#counter.list.{?#this>7}">
<li><s:property/></li>
</s:iterator>
user:
<s:iterator value="users" status="it">
<li>user.name=<s:property value="name"/>|<s:property value="#it.index"/></li>
<s:if test="#it.index%2==0">
偶數。。。。。。。。。
</s:if>
</s:iterator>
<h1>UI Tags</h1>
<s:textfield name="user.name" cssClass="input" label="userName"/>
<s:form action="UpdateAccount">
<s:textfield name="username" label="Username" readonly="true"/>
<s:password name="password" label="Password"/>
<s:textfield name="portfolioName" label="Enter a name."/>
<s:submit/>
</s:form>
<s:select name="user.name" list="{'Mike','Payal','Silas'}" />
<s:select name="user.name" list="users" listValue="name"/>
<s:radio name="rd.name" list="users" listValue="name"/>

<%-- <s:doubleselect name="username" list="users" listKey="name" --%>
<%-- listValue="name" doubleName="portfolioName" --%>
<%-- doubleList="users" doubleListValue="name" /> --%>
<%-- <s:action name="formAction" executeResult="true"/> --%>
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