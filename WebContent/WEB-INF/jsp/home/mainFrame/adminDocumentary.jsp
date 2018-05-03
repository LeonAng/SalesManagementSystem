<%@ page contentType="text/html; charset=utf-8"%>
<%@ include file="../../base.jsp"%><html>
<head>
	<title>Insert title here</title>
	<link rel="stylesheet" type="text/css" href="css/common.css">
</head>
<body>
	<div align="center">
		<h4>———— 经理跟单 ————</h4>
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
			<td>操作</td>
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
				<td><a href="#" class="btn btn-default" data-toggle="modal" data-target="#myModal">修改</a> 
					<a href="deleteProject?id=${c.id}" class="btn btn-default">删除</a>
				</td>
			</tr>
		</c:forEach>
	</table>
	
	
	<!-- 修改订单信息（Modal） -->
	<div class="modal fade" id="myModal" tabindex="-1" role="dialog"
		aria-labelledby="myModalLabel" aria-hidden="true">
		<div class="modal-dialog">
			<div class="modal-content">
				<div class="modal-header">
					<button type="button" class="close" data-dismiss="modal" aria-hidden="true">×</button>
					<h4 class="modal-title" id="myModalLabel">修改订单信息</h4>
				</div>
				
				<form action="changeProject" method="post" accept-charset="utf-8">
					<input type="hidden" name="id" value="">
					
					<label class="col-md-4 control-label" style="width:114px">项目名：</label>
					<div class="col-md-8" style="float: left">
						<input type="text" class="form-control" name="name" value=""
							placeholder="#">
					</div>

					<br><br>
					<label class="col-md-4 control-label" style="width:114px;float:left;">负责人：</label>
					<div class="col-md-8" style="float: left">
						<input type="text" class="form-control" name="staffName" value=""
							placeholder="#">
					</div>
					<br><br>
					
					<label class="col-md-4 control-label" style="width:114px;float:left;">客户：</label>
					<div class="col-md-8" style="float: left">
						<input type="text" class="form-control" name="clientName" value=""
							placeholder="#">
					</div>
					<br><br>

					<label class="col-md-4 control-label" style="width:114px;float:left;">货物：</label>
					<div class="col-md-8" style="float: left">
						<input type="text" class="form-control" name="goodsName" value=""
							placeholder="#" readonly="readonly">
					</div>
					<br><br>
					
					<label class="col-md-4 control-label" style="width:114px;float:left;">货物数量：</label>
					<div class="col-md-8" style="float: left">
						<input type="text" class="form-control" name="goodsNumber" value=""
							placeholder="#">
					</div>
					<br><br>
					
					<label class="col-md-4 control-label" style="width:114px;float:left;">订单状态：</label>
					<div class="col-md-8" style="float: left">
						<input type="text" class="form-control" name="state" value=""
							placeholder="#" list="wlmslist1">
						<datalist id="wlmslist1">
							<option value="待支付">待支付</option>
							<option value="已取消">已取消</option>
							<option value="已发货">已发货</option>
							<option value="已完成">已完成</option>
						</datalist>
					</div>
					<br><br>
					
					<label class="col-md-4 control-label" style="width:114px;float:left;">开始时间：</label>
					<div class="col-md-8" style="float: left">
						<input type="text" class="form-control" name="startDate" value=""
							placeholder="#">
					</div>
					<br><br>
					
					<label class="col-md-4 control-label" style="width:114px;float:left;">结束时间：</label>
					<div class="col-md-8" style="float: left">
						<input type="text" class="form-control" name="endDate" value=""
							placeholder="#">
					</div>
					<br><br>
					
					<label class="col-md-4 control-label" style="width:114px;float:left;">下一步计划：</label>
					<div class="col-md-8" style="float: left">
						<input type="text" class="form-control" name="plan" value=""
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
		$('#myModal').on('show.bs.modal', function(event) {
			var btnThis = $(event.relatedTarget); //触发事件的按钮  
			var modal = $(this); //当前模态框  
			var modalId = btnThis.data('id'); //解析出data-id的内容  
			var content = btnThis.closest('tr').find('td').eq(0).text();
			modal.find('input[name="id"]').val(content);
			var content = btnThis.closest('tr').find('td').eq(1).text();
			modal.find('input[name="name"]').val(content);
			var content = btnThis.closest('tr').find('td').eq(2).text();
			modal.find('input[name="staffName"]').val(content);
			var content = btnThis.closest('tr').find('td').eq(3).text();
			modal.find('input[name="clientName"]').val(content);
			var content = btnThis.closest('tr').find('td').eq(4).text();
			modal.find('input[name="goodsName"]').val(content);
			var content = btnThis.closest('tr').find('td').eq(5).text();
			modal.find('input[name="goodsNumber"]').val(content);
			var content = btnThis.closest('tr').find('td').eq(6).text();
			modal.find('input[name="state"]').val(content);
			var content = btnThis.closest('tr').find('td').eq(7).text();
			modal.find('input[name="startDate"]').val(content);
			var content = btnThis.closest('tr').find('td').eq(8).text();
			modal.find('input[name="endDate"]').val(content);
			var content = btnThis.closest('tr').find('td').eq(9).text();
			modal.find('input[name="plan"]').val(content);
			
		});
	</script>

	<a href="#" class="btn btn-default"
		style="float: right; margin-right: 60px;" data-toggle="modal"
		data-target="#myModal1">审批意见</a>
	<!-- 审批意见（Modal） -->
	<div class="modal fade" id="myModal1" tabindex="-1" role="dialog"
		aria-labelledby="myModalLabel" aria-hidden="true">
		<div class="modal-dialog">
			<div class="modal-content">
				<div class="modal-header">
					<button type="button" class="close" data-dismiss="modal" aria-hidden="true">×</button>
					<h4 class="modal-title" id="myModalLabel">编写审批意见</h4>
				</div>
				
				<form action="addInstruction" method="post" accept-charset="utf-8">
					<label class="col-md-4 control-label" style="width:114px;float:left;">审批人：</label>
					<div class="col-md-8" style="float: left">
						<input type="text" class="form-control" name="adminName" value="${sessionScope.user.name}"
							placeholder="#"  readonly="readonly">
					</div>
					<br><br>
					
					<label class="col-md-4 control-label" style="width:114px;float:left;">审批对象：</label>
					<div class="col-md-8" style="float: left">
						<input type="text" class="form-control" name="staffName" value=""
							placeholder="#">
					</div>
					<br><br>

					<label class="col-md-4 control-label" style="width:114px;float:left;">审批内容：</label>
					<div class="col-md-8" style="float: left">
						<textarea type="text" class="form-control" name="content"
							value="" placeholder="#" style="height: 200px;"></textarea>
					</div>
					<br><br><br><br><br><br><br><br><br><br>

					<div class="modal-footer">
						<button type="button" class="btn btn-default" data-dismiss="modal">关闭</button>
						<button type="submit" class="btn btn-primary">提交</button>
					</div>
				</form>
			</div>
		</div>
	</div>

	<script>
		$(function() {
			$('#myModal1').on('hide.bs.modal', function() {
				 location.reload();
			})
		});
	</script>
	
	
</body>
</html>