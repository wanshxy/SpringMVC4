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
    
    <title>编辑书本</title>
    
	<script type="text/javascript">
	function editBook(){
		var form = document.forms[0];
		form.action = "<%=basePath%>book/edit";
		form.method="post";
		form.submit();
	}
</script>

  </head>
  
  <body>
    <h1>修改书本</h1>
	<form action="" name="bookForm">
		<input type="hidden" name="id" value="${user.id }"/>
		姓名：<input type="text" name="name" value="${book.name }"/>
		页数：<input type="text" name="page" value="${book.page }"/>
		<input type="button" value="编辑" onclick="editBook()"/>
	</form>
  </body>
  
</html>
