<%--
  Created by IntelliJ IDEA.
  User: dragon
  Date: 16-07-2019
  Time: 12:32 PM
  To change this template use File | Settings | File Templates.
--%>
<%--<%@ page contentType="text/html;charset=UTF-8" language="java" %>--%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<html>
<head>
    <title>Testing OGNL</title>
</head>
<body>
    <h2> All items in list : <s:property value="linkedList"/> </h2>
    <h2> First item in list : <s:property value="linkedList[0]"/> </h2>
    <h2> List Size : <s:property value="linkedList.size()"/> </h2>

<h1>        <s:label value="i" name="i"></s:label> </h1>
<h1>      map in context :  <s:property value="one"/> </h1>
</body>
</html>
