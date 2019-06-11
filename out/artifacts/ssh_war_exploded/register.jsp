<%--
  Created by IntelliJ IDEA.
  User: sloth
  Date: 2019/6/11
  Time: 12:20
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>register page</title>
</head>
<body>
<h3>注册</h3>
<s:actionmessage/>
<span style="color:red"><s:actionerror/></span>
<form method="post" action="action/RegisterAction.action">
    <span>用户名：</span><input type="text" name="name" value="${name}"/><br/>
    <span>密码&nbsp：</span><input type="text" name="password" value="${password}"/><br/>
    <input type="submit" style="height:25px;width:237px" value="注册" />
</form>
<a href="/login.jsp">登录页面</a>
</body>

</html>
