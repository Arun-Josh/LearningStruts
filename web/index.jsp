<%--
  Created by IntelliJ IDEA.
  User: dragon
  Date: 12-07-2019
  Time: 05:25 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib uri="/struts-tags" prefix="s" %>
<s:form action="product">
  <s:textfield name="id" label="Product Id"></s:textfield>
  <s:textfield name="name" label="Product Name"></s:textfield>
  <s:textfield name="price" label="Product Price"></s:textfield>
  <s:submit value="save"></s:submit>
</s:form>
