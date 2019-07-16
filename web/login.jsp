<%--
  Created by IntelliJ IDEA.
  User: dragon
  Date: 15-07-2019
  Time: 12:47 PM
  To change this template use File | Settings | File Templates.
--%>
<%--<%@ page contentType="text/html;charset=UTF-8" language="java" %>--%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<html>
    <head>
        <title>Struts Login Page</title>
    </head>
    <body>
        <h3> Login </h3>
        <s:property value="message"/>
        <br>
        <s:form action="log in">
            <s:textfield name="userName" label="User Name"/>
            <s:textfield name="password" label="Password"/>
            <s:submit value="login" align="center"/>
        </s:form>



        <s:form action="list">
            <s:submit value="List Info"/>
        </s:form>
    </body>
</html>
