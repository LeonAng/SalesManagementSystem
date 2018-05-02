<%@ page contentType="text/html; charset=utf-8"%>
<%@ include file="../../base.jsp"%><html>
<head>
	<title>Insert title here</title>
	<link rel="stylesheet" type="text/css" href="css/common.css">
</head>
<body>
	<div align="center">
		<h4>———— 销售人员跟单 ————</h4>
	</div>
	<table align='center' width="90%" class="table">
		<tr>
			<td>项目名</td>
			<td>负责人</td>
			<td>客户</td>
			<td>货物</td>
			<td>货物数量</td>
			<td>订单状态</td>
			<td>开始时间</td>
			<td>结束时间</td>
			<td>操作</td>
		</tr>
		<c:forEach items="${list}" var="c" varStatus="st">
			<tr>
				<td>${c.name}</td>
				<td>${c.staffName}</td>
				<td>${c.clientName}</td>
				<td>${c.goodsName}</td>
				<td>${c.goodsNumber}</td>
				<td>${c.state}</td>
				<td>${c.startDate}</td>
				<td>${c.endDate}</td>
				<td><a href="#" class="btn btn-default" data-toggle="modal" data-target="#myModal">修改</a></td>
			</tr>
		</c:forEach>
	</table>
	<a href="#" class="btn btn-default" style="float:right;margin-right:60px;" data-toggle="modal" data-target="#myModal1">新增订单</a>


	<!-- 修改订单信息（Modal） -->
	<div class="modal fade" id="myModal" tabindex="-1" role="dialog"
		aria-labelledby="myModalLabel" aria-hidden="true">
		<div class="modal-dialog">
			<div class="modal-content">
				<div class="modal-header">
					<button type="button" class="close" data-dismiss="modal" aria-hidden="true">×</button>
					<h4 class="modal-title" id="myModalLabel">修改订单信息</h4>
				</div>
				
				<form action="changeProject" method="post">
					<input type="hidden" name="id" value="">
					
					<label class="col-md-4 control-label" style="width:100px">项目名：</label>
					<div class="col-md-8" style="float: left">
						<input type="text" class="form-control" name="name" value=""
							placeholder="#">
					</div>

					<br><br>
					<label class="col-md-4 control-label" style="width:100px;float:left;">负责人：</label>
					<div class="col-md-8" style="float: left">
						<input type="text" class="form-control" name="staffName" value=""
							placeholder="#">
					</div>
					<br><br>
					
					<label class="col-md-4 control-label" style="width:100px;float:left;">客户：</label>
					<div class="col-md-8" style="float: left">
						<input type="text" class="form-control" name="clientName" value=""
							placeholder="#">
					</div>
					<br><br>

					<label class="col-md-4 control-label" style="width:100px;float:left;">货物：</label>
					<div class="col-md-8" style="float: left">
						<input type="text" class="form-control" name="goodsName" value=""
							placeholder="#">
					</div>
					<br><br>
					
					<label class="col-md-4 control-label" style="width:100px;float:left;">货物数量：</label>
					<div class="col-md-8" style="float: left">
						<input type="text" class="form-control" name="goodsNumber" value=""
							placeholder="#">
					</div>
					<br><br>
					
					<label class="col-md-4 control-label" style="width:100px;float:left;">订单状态：</label>
					<div class="col-md-8" style="float: left">
						<input type="text" class="form-control" name="state" value=""
							placeholder="#">
					</div>
					<br><br>
					
					<label class="col-md-4 control-label" style="width:100px;float:left;">开始时间：</label>
					<div class="col-md-8" style="float: left">
						<input type="text" class="form-control" name="startDate" value=""
							placeholder="#">
					</div>
					<br><br>
					
					<label class="col-md-4 control-label" style="width:100px;float:left;">结束时间：</label>
					<div class="col-md-8" style="float: left">
						<input type="text" class="form-control" name="endDate" value=""
							placeholder="#">
					</div>
					<br><br>

					<div class="modal-footer">
						<button type="button" class="btn btn-default" data-dismiss="modal">关闭</button>
						<button type="submit" class="btn btn-primary">提交更改</button>
					</div>
				</form>
			</div>
		</div>
	</div>
	
	<script>
		$(function() {
			$('#myModal').modal('hide')
		});
	</script>
	<script>
		$(function() {
			$('#myModal').on('hide.bs.modal', function() {
				 location.reload();
			})
		});
	</script>
	
	
	<!-- 新增订单信息（Modal） -->
	<div class="modal fade" id="myModal1" tabindex="-1" role="dialog"
		aria-labelledby="myModalLabel" aria-hidden="true">
		<div class="modal-dialog">
			<div class="modal-content">
				<div class="modal-header">
					<button type="button" class="close" data-dismiss="modal" aria-hidden="true">×</button>
					<h4 class="modal-title" id="myModalLabel">新增订单信息</h4>
				</div>
				
				<form action="addProject" method="post">
					<label class="col-md-4 control-label" style="width:100px">项目名：</label>
					<div class="col-md-8" style="float: left">
						<input type="text" class="form-control" name="name" value=""
							placeholder="#">
					</div>

					<br><br>
					<label class="col-md-4 control-label" style="width:100px;float:left;">负责人：</label>
					<div class="col-md-8" style="float: left">
						<input type="text" class="form-control" name="staffName" value=""
							placeholder="#">
					</div>
					<br><br>
					
					<label class="col-md-4 control-label" style="width:100px;float:left;">客户：</label>
					<div class="col-md-8" style="float: left">
						<input type="text" class="form-control" name="clientName" value=""
							placeholder="#">
					</div>
					<br><br>

					<label class="col-md-4 control-label" style="width:100px;float:left;">货物：</label>
					<div class="col-md-8" style="float: left">
						<input type="text" class="form-control" name="goodsName" value=""
							placeholder="#">
					</div>
					<br><br>
					
					<label class="col-md-4 control-label" style="width:100px;float:left;">货物数量：</label>
					<div class="col-md-8" style="float: left">
						<input type="text" class="form-control" name="goodsNumber" value=""
							placeholder="#">
					</div>
					<br><br>
					
					<label class="col-md-4 control-label" style="width:100px;float:left;">订单状态：</label>
					<div class="col-md-8" style="float: left">
						<input type="text" class="form-control" name="state" value=""
							placeholder="#">
					</div>
					<br><br>
					
					<label class="col-md-4 control-label" style="width:100px;float:left;">开始时间：</label>
					<div class="col-md-8" style="float: left">
						<input type="text" class="form-control" name="startDate" value=""
							placeholder="#">
					</div>
					<br><br>
					
					<label class="col-md-4 control-label" style="width:100px;float:left;">结束时间：</label>
					<div class="col-md-8" style="float: left">
						<input type="text" class="form-control" name="endDate" value=""
							placeholder="#">
					</div>
					<br><br>

					<div class="modal-footer">
						<button type="button" class="btn btn-default" data-dismiss="modal">关闭</button>
						<button type="submit" class="btn btn-primary">提交更改</button>
					</div>
				</form>
			</div>
		</div>
	</div>
	
	<script>
		$(function() {
			$('#myModal1').modal('hide')
		});
	</script>
	<script>
		$(function() {
			$('#myModal1').on('hide.bs.modal', function() {
				 location.reload();
			})
		});
	</script>
	
	
	
	
</body>
</html>