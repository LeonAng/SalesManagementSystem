<%@ page language="java" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<title>商务综合管理平台：主页</title>
<script type="text/javascript">
	if (self.location != top.location) {
		top.location = self.location;
	}
</script>
</head>
<frameset rows="55,*"border="0">
	<frame name="topFrame" scrolling="no" src="homeTitle">
	<frameset cols="202,*" frameborder="no" border="0" framespacing="0">
		<frame name="leftFrame" class="leftFrame"scrolling="no"
			src="homeLeft" />
		<frame name="mainFrame" class="rightFrame"
			src="homeMain" />
	</frameset>
</frameset>

<noframes>
	<body>
		<p>此网页使用了框架，但您的浏览器不支持框架。</p>
	</body>
</noframes>

</html>