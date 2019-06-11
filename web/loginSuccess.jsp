<%--
  Created by IntelliJ IDEA.
  User: sloth
  Date: 2019/6/11
  Time: 11:41
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
  <title>login success page</title>
</head>
<body>
<h1>登录成功！</h1>
<h3>当前登录用户为：<s:property value="#session.user.name" /></h3>
</body>
</html>
