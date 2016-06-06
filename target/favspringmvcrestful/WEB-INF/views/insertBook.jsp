<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>  
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>添加用户</title>
    
	<script type="text/javascript">
	function insertBook(){
		var form = document.forms[0];
		form.action = "<%=basePath%>book/insert";
		form.method="post";
		form.submit();
	}
</script>

  </head>
  
  <body>
    <h1>添加书本</h1>
	<form action="" name="userForm">
		书名：<input type="text" name="name">
		书页：<input type="text" name="page">
		<input type="button" value="添加" onclick="insertBook()">
	</form>
  </body>
</html>
