<%@ page contentType="text/html; charset=utf-8"%>
<%@ include file="../../base.jsp"%><html>
<head>
	<title>Insert title here</title>
	<link rel="stylesheet" type="text/css" href="css/common.css">
<style type="text/css">
.box {
	margin-left: 10px;
}
</style>
</head>
<body>
	<div class="box">
		<form action="addGoods" method="post" accept-charset="utf-8" onsubmit="return check1()">
			<fieldset>
				<div align="center">
					<h4>————新增商品————</h4>
				</div>
				<label>商品名</label> <input type="text" name="goodsName"/><br> 
				<label>储量&#12288;</label> <input type="text" name="goodsNumber"/><br> 
				<label>单价&#12288;</label> <input type="text" name="unitPrice"/><br> 
				<span class="help-block">若存在同名商品将更新该商品信息。(不能为空)</span>
				<button type="submit" class="btn">提交</button>
			</fieldset>
		</form>
	</div>

	<div class="box">
		<div align="center">
			<h4>———— 客户订单查询 ————</h4>
		</div>
		<form action="findProjectByClient" method="post" accept-charset="utf-8"  onsubmit="return check2()">
			<label>客户名</label> <input class="input-medium search-query" type="text" name="clientName"/>
			<button type="submit" class="btn">查询</button>
		</form>
	</div>
	<table align='center' width="90%" class="table">
		<tr>
			<td style="display:none;">项目ID</td>
			<td>项目名</td>
			<td>负责人</td>
			<td>客户</td>
			<td>货物</td>
			<td>货物数量</td>
			<td>订单状态</td>
			<td>开始时间</td>
			<td>结束时间</td>
			<td>下一步计划</td>
		</tr>
		<c:forEach items="${list}" var="c" varStatus="st">
			<tr>
				<td style="display:none;">${c.id}</td>
				<td>${c.name}</td>
				<td>${c.staffName}</td>
				<td>${c.clientName}</td>
				<td>${c.goodsName}</td>
				<td>${c.goodsNumber}</td>
				<td>${c.state}</td>
				<td>${c.startDate}</td>
				<td>${c.endDate}</td>
				<td>${c.plan}</td>
			</tr>
		</c:forEach>
	</table>
</body>

<script type="text/javascript">
	function check1() {
		var goodsName = document.getElementsByName("goodsName")[0].value;
		var goodsNumber = document.getElementsByName("goodsNumber")[0].value;
		var unitPrice = document.getElementsByName("unitPrice")[0].value;
		if (goodsName == "") {
			alert("商品名不能为空！");
			return false;
		} else if (goodsNumber == "") {
			alert("储量不能为空！");
			return false;
		} else if (unitPrice == "") {
			alert("单价不能为空！");
			return false;
		}
	}

	function check2() {
		var clientName = document.getElementsByName("clientName")[0].value;
		if (clientName == "") {
			alert("客户姓名不能为空！");
			return false;
		}
	}
</script>

</html>