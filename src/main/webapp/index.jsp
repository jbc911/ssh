<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>
<%@taglib uri="/struts-tags" prefix="s"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
</head>

<body>
	<a href="${pageContext.request.contextPath}/province!findByCriteria.action">省份列表</a>
	<s:iterator var="pc" value="#request.pclist">
		<s:property value="cname" />
	</s:iterator>
</body>
</html>
