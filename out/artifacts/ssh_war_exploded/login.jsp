<%--
  Created by IntelliJ IDEA.
  User: sloth
  Date: 2019/6/11
  Time: 12:19
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
    <title>login page</title>
</head>
<body>
<h3>登录</h3>
<span style="color:red"><s:actionerror/></span>
<form method="post" action="action/LoginAction.action">
    <span>用户名：</span><input type="text" name="name" value="${name}"/><br/>
    <span>密码&nbsp：</span><input type="text" name="password" value="${password}"/><br/>
    <input type="submit" style="height:25px;width:237px" value="登录" />
</form>
<a href="/register.jsp">注册页面</a>
</body>
</html>
