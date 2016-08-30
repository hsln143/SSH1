<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'LoginSuccess.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

  </head>
  
  <body>
    Success<br>
    <c:out value="${name}"></c:out><br>
    <table>
    	<tr>
    		<td>编号</td>
    		<td>账号</td>
    		<td>密码</td>
    	</tr>
    <c:forEach  var="bean" items="${uas}">
    	<tr>
    		<td><c:out value="${bean.UId}"/></td>
    		<td><c:out value="${bean.UName}"/></td>
    		<td><c:out value="${bean.UPassword}"/></td>
    	</tr>
	</c:forEach>
	</table>
    <a href="/wu/index.jsp">返回</a>
  </body>
</html>
