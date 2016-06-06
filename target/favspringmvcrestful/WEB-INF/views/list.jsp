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
    <script type="text/javascript" src="js/jquery-1.7.1.js"></script>
    <title>书单</title>
    
	<script type="text/javascript">
	function del(id){
		$.get("<%=basePath%>user/delUser?id=" + id,function(data){
			if("success" == data.result){
				alert("删除成功");
				window.location.reload();
			}else{
				alert("删除失败");
			}
		});
	}
</script>
  </head>
  
  <body>
    <h6><a href="<%=basePath%>book/toinsert">添加书本</a></h6>
	<table border="1">
		<tbody>
			<tr>
				<th>书名</th>
				<th>页数</th>
				<th>操作</th>
			</tr>
			<c:if test="${!empty list }">
				<c:forEach items="${list}" var="book">
					<tr>
						<td>${book.name }</td>
						<td>${book.page }</td>
						<td>
							<a href="<%=basePath%>book/toedit?id=${book.id}">编辑</a>
							<a href="<%=basePath%>book/delete?id=${book.id}">删除</a>
	<!-- 					
							<a href="javascript:del('${book.id }')">删除</a>
							 -->	
						</td>
					</tr>				
				</c:forEach>
			</c:if>
		</tbody>
	</table>
  </body>
</html>
