<%@ page contentType="text/html; charset=utf-8"%>
<%@ include file="../../base.jsp"%><html>
<head>
<title>Insert title here</title>
<link rel="stylesheet" type="text/css" href="css/common.css">
</head>
<body>
	<div align="center">
		<h4>———— 经理指导意见 ————</h4>
	</div>
	
	<table align='center' width="90%" class="table">
		<tr>
			<td style="display:none;">指导意见ID</td>
			<td>员工名</td>
			<td>经理名</td>
			<td>指导意见</td>
		</tr>
		<c:forEach items="${list}" var="c" varStatus="st">
			<tr>
				<td style="display:none;">${c.id}</td>
				<td>${c.staffName}</td>
				<td>${c.managerName}</td>
				<td>${c.content}</td>
			</tr>
		</c:forEach>
	</table>
	
</body>
</html>