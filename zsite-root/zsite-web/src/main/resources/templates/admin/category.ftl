 <div>
	    <!-- Content Header (Page header) -->
	    <section class="content-header">
	      <h1>
	        	分类
	        <small>分类</small>
	      </h1>
	    </section>
	
	    <!-- Main content -->
	    <section class="content">
			<div class="row">
				<div class="col-md-4">
					<form action="/admin/category_save" method="POST" id="myForm">
						<input name="content_module" value="article" type="hidden"> <input name="type" value="category" type="hidden"> <input name="id" value="" type="hidden"> <input name="ucode" value="bd670f118c026a60f5f15b648b18a1f4" type="hidden">
						<h4 class="jp-common-pad">新分类</h4>
						<div class="form-group jp-input-item">
							<label for="tag-name" class="input-title">名称</label> <input id="tag-name" class="form-control" name="title" value="" type="text">
							<p>这将是它在站点上显示的名字。</p>
						</div>
		
						<div class="form-group jp-input-item">
							<label for="taxonomy_slug" class="input-title">别名</label> <input id="taxonomy_slug" class="form-control" name="slug" value="" type="text">
							<p>别名是在URL中使用的别称，它可以令URL更美观，更加有利于SEO。通常使用小写，只能包含字母，数字和连字符“-”（中划线），不能全是数字。</p>
						</div>
						<div class="form-group jp-input-item">
							<div class="col-xs-5 jp-common-pad">
								<label class="input-title">父节点</label> <select class="form-control input-sm" name="parent_id">
									<option value="0">无</option> 
								</select>
							</div>
							<div class="clr"></div>
						</div>
						<div class="form-group jp-input-item">
							<label class="input-title">描述</label>
							<textarea class="form-control" name="text" rows="3"></textarea>
							<p>分类的描述内容，是否显示决定于模板。</p>
						</div>
						<div class="form-group jp-input-item">
							<label for="tag-slug" class="input-title">是否添加到导航菜单</label>
							<div class="checkbox">
								<label><input id="tag-slug" name="addToMenu" value="true" type="checkbox"> 添加到导航菜单 </label>
							</div>
						</div>
		
						<button type="button" onclick="doSubmit()" class="btn btn-primary">保 存</button>
		
					</form>
					<!-- /.box -->
				</div>
				<!-- /.col -->
				<div class="col-md-8 ">
					<div class="col-xs-12 jp-common-pad ">
						<div class="jp-left ">
							<select style="width: 120px" class="form-control input-sm">
								<option value="10">批量操作</option>
								<option value="25">删除</option>
							</select>
						</div>
						<div class="jp-left  ">
							<button class="btn  btn-sm btn-default" type="button">应用</button>
						</div>
					</div>
					<div class="clr"></div>
					<div class="box ">
		
						<!-- /.box-header -->
						<div class="box-body jp-common-pad">
							<table class="table table-striped">
								<thead>
									<tr>
										<th style="width: 20px"><label class="jp-common-pad "><input class="jp-common-pad " id="allid" onclick="checkAll(this)" title="全选" type="checkbox"></label></th>
		
										<th style="width: 30%">名称</th>
										<th>描述</th>
										<th style="width: 20%">别名</th>
										<th style="width: 10%">总数</th>
		
									</tr>
								</thead>
								<tbody>
		
									  
								</tbody>
		
							</table>
						</div>
						<!-- /.box-body -->
		
						<!-- /.box-footer -->
					</div>
					<!-- /. box -->
				</div>
				<!-- /.col -->
			</div>
		
			<!-- /.row -->
		</section>
    	<!-- /.content -->
	  </div>

<script type="text/javascript">
      	function doSubmit(){
      		var myData = $('#myForm').serializeArray();
      		var url = $('#myForm').attr('action');

      		// 提交数据
      		com.AjaxPost(url, myData, "json", function(result) {
      			if (typeof (result) == 'string') {
      				result = JSON.parse(result);
      			}
      			if (result.code == '200') {
      				$("#Button_AddAll").attr("disabled", "disabled");
      				toast('操作成功！');
      				window.location.href = "ui_reg_success.jsp";
      			} else {
      				var msginfo = com.errorCode(result.code);
      				toast('操作失败,' + msginfo);
      			}
      		});
      	}
      </script>