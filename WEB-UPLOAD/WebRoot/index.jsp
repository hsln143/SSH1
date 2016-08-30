<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<base href="<%=basePath%>">

<title>My JSP 'index.jsp' starting page</title>
<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">
<style>
body {
	text-align: center;
}
</style>
<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
</head>

<body>
	登陆
	<br>
	<form name="loginform" method="post" action="login.action">
		<table>
			<tr>
				<td>用户名：</td>
				<td><input name="name" type="text" value="12"></input></td>
			</tr>
			<tr>
				<td>密码：</td>
				<td><input name="password" type="text" value="12"></input></td>
			</tr>
		</table>
		<div>
			<button type="submit">登陆</button>
			<button type="reset">重置</button>
		</div>
	</form>
</body>
</html>
