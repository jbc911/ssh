<%@ page language="java" import="java.util.*" pageEncoding="Utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<%@taglib uri="/struts-tags" prefix="s"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'MyJsp.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

  </head>
  <script type="text/javascript">
  </script>

  <body>
  <a href="${pageContext.request.contextPath}/province!toAdd.action">添加</a>
  <table border="1">
    <s:iterator var="p" value="#request.plist">
    	<tr>
    		<td><s:property value="%{#p.pid}"/></td>
    		<td><a href="${pageContext.request.contextPath}/cities!findById.action?pid=${pid}"><s:property value="pname"/></a></td>
    		<td><a href="${pageContext.request.contextPath}/province!delete.action?pid=${p.pid}" onclick="javascript:return confirm('确定删除?')">删除</a></td>
    		<td><a href="${pageContext.request.contextPath}/province!toUpdate.action?pid=${p.pid}">修改</a></td>
    	</tr>
    </s:iterator>
   
    </table>
 
  </body>
</html>
