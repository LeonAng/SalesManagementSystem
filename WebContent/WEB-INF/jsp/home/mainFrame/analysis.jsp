<%@ page contentType="text/html; charset=utf-8"%>
<%@ include file="../../base.jsp"%><html>
<head>
	<title>Insert title here</title>
	<script src="https://cdnjs.cloudflare.com/ajax/libs/Chart.js/1.0.2/Chart.min.js"></script>
	<style type="text/css">
	.box {
		width : 420px;
		display :inline-block;
		margin-left:15px;
	}
	</style>
</head>
<body>
	<div align="center">
		<h4>———— 整体统计分析 ————</h4>
	</div>
	<div style="width:100%">
		<div class="box" style="background-color:lightgreen;">
			<h3>商品储量表</h3>
			<canvas id="goods" width="400" height="400"></canvas>
		</div>
		<div class="box" style="background-color:yellow;">
			<h3>销售人员业绩表</h3>
			<canvas id="user" width="400" height="400"></canvas>
		</div>
		<div class="box" style="background-color:pink;">
			<h3>近七天每日跟单次数</h3>
			<canvas id="actionForDay" width="400" height="380"></canvas>
		</div>
	</div>
</body>

<script type="text/javascript">
	var actionForDayData = {
		labels : [],//数据的横轴座标
		datasets : [ {
			fillColor : 'rgba(0,0,0,0)',
			strokeColor : 'rgba(220,180,0,1)',//第一组数据的线颜色
			pointColor : 'rgba(220,180,0,1)',//点的颜色
			data : []
		//第一组数据的值
		} ]
	};
	<c:forEach items="${actionForDayList}" var="u">
		actionForDayData.labels.push("${u.saleDate}");
		actionForDayData.datasets[0].data.push("${u.number}");
	</c:forEach>
	
	//用ID取画布元素
	var canvas = document.getElementById('actionForDay').getContext('2d');//绘出图形
	var lineDemo = new Chart(canvas).Line(actionForDayData, {
		responsive : true,//设置是否是响应式的
		pointDotRadius : 10,
		bezierCurve : false,
		scaleShowVerticalLines : false,
		scaleGridLineColor : 'black'
	});
</script>

<script type="text/javascript">
	var userData = {
		labels : [],
		datasets : [ {
			fillColor : "#00CCFF",
			strokeColor : "rgba(220,220,220,1)",
			data : []
		} ]
	}
	<c:forEach items="${userList}" var="u">
		userData.labels.push("${u.name}");
		userData.datasets[0].data.push("${u.projectsNum}");
	</c:forEach>

	$(function() {
		var userCtx = document.getElementById('user').getContext("2d");
		var userMyNewChart = new Chart(userCtx);
		userMyNewChart.Bar(userData);
	});
</script>

<script type="text/javascript">
	var goodsData = {
		labels : [],
		datasets : [ {
			fillColor : "#FF3EFF",
			strokeColor : "rgba(220,220,220,1)",
			data : []
		} ]
	}
	<c:forEach items="${goodsList}" var="u">
		goodsData.labels.push("${u.name}(${u.unitPrice}元)");
		goodsData.datasets[0].data.push("${u.number}");
	</c:forEach>

	$(function() {
		var goodsCtx = document.getElementById('goods').getContext("2d");
		var goodsMyNewChart = new Chart(goodsCtx);
		goodsMyNewChart.Bar(goodsData);
	});
</script>



<!-- 扇形图 -->
<!-- 
<script type="text/javascript">
	var data = [ {
		value : 40,
		color : "#21F0EA",//背景色
		highlight : "#79E8E5",//高亮背景颜色
		label : 'javascript'//文字标签
	}, {
		value : 60,
		color : "#E0E4CC",
		highlight : "#EAEDD8",
		label : 'jquery'
	}, {
		value : 100,
		color : "#69D2E7",
		highlight : "#83E5F7",
		label : 'html'

	} ];
	
	var ctx = document.getElementById("null").getContext("2d");
	window.pieChart = new Chart(ctx).Pie(data, {
		//是否显示每段行程（即扇形区，不为true则无法看到后面设置的边框颜色）
		segmentShowStroke : true,
		//设置每段行程的边框颜色
		segmentStrokeColor : "red",
		//每段扇区边框的宽度
		segmentStrokeWidth : 2,
		//Boolean - 是否执行动画
		animation : true,
		//Number - 动画时间
		animationSteps : 100,
		//String - 动画的效果
		animationEasing : "easeOutBounce",
		//Boolean -是否旋转动画
		animateRotate : true,
		//Boolean - 是否动画缩放饼图中心（效果不错）
		animateScale : true,
		//Function - 动画完成时执行的函数
		//onAnimationComplete : null
	});
</script>
 -->
 
 
</html>