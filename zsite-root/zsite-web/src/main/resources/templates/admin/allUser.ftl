 <div>
	    <!-- Content Header (Page header) -->
	    <section class="content-header">
	      <h1>
	        发布文章4
	        <small>Optional allUser</small>
	      </h1>
	    </section>
	
	    <!-- Main content -->
	   <section class="content">
			<div class="row content-row">
				<ul class="jp-common-pad list-inline" style="float: left">
					<li class="all">
						<a class="current" href="#">
							全部 <span class="count">（1）</span>
						</a>
						|
					</li>
					<li class="publish">
						<a href="#">
							管理员 <span class="count">（1）</span>
						</a>
					</li>
		
				</ul>
		
		
				<form class="form-horizontal" style="float: right">
		
					<div class="input-group input-group-sm">
						<input id="post-search-input" class="form-control" value="" name="" placeholder="搜索" type="search">&nbsp; <input id="search-submit" class="btn btn-default btn-sm" value="搜索用户" type="submit">
					</div>
		
				</form>
			</div>
			<div class="row content-row">
		
				<div class="jp-left ">
					<select style="width: 120px" class="form-control input-sm">
						<option value="10">批量操作</option>
						<option value="25">删除</option>
					</select>
				</div>
				<div class="jp-left  ">
					<button class="btn  btn-sm btn-default" type="button">应用</button>
				</div>
		
				<div class="jp-left ">
					<select style="width: 120px" class="form-control input-sm">
						<option value="10">将角色更为</option>
						<option value="25">订阅者</option>
						<option value="50">投稿者</option>
						<option value="25">作者</option>
						<option value="50">编辑</option>
						<option value="25">管理员</option>
		
					</select>
				</div>
				<div class="jp-left  ">
					<button class="btn  btn-sm btn-default" type="button">筛选</button>
				</div>
			</div>
		
		
			<div class="box ">
		
				<!-- /.box-header -->
				<div class="box-body jp-common-pad">
					<table class="table table-striped">
						<thead>
							<tr>
								<th style="width: 20px"><label class="jp-common-pad "> <input class="jp-common-pad " id="dataItem" onclick="checkAll(this)" title="全选" type="checkbox">
								</label></th>
								<th style="width: 20%">用户名</th>
								<th>昵称</th>
								<th>简介</th>
								<th>电子邮件</th>
								<th>角色</th>
								<th>文章数量</th>
							</tr>
						</thead>
						<tbody>
							 
							<tr class="jp-onmouse">
								<td><label class="jp-common-pad"> <input class="jp-common-pad" name="dataItem" type="checkbox">
								</label></td>
								<td>
								<strong><a href="/jpress/admin/user/edit?id=1&amp;c=list&amp;p=user">admin</a> </strong>
									<div class="jp-flash-comment">
										<p class="row-actions jp-cancel-pad" style="display: none;">
											<span class="approve"> <a class="vim-a" href="/jpress/admin/user/edit?id=1&amp;c=list&amp;p=user">编辑</a></span>
											<span class="spam"> | <a class="vim-s vim-destructive" href="javascript:;" onclick="frozen('1')">冻结</a></span> 
											<span class="spam"> | <a class="vim-s vim-destructive" href="javascript:;" onclick="del('1')">永久删除</a></span> 
										</p>
									</div>
								</td>
								<td></td>
								<td></td>
								<td></td>
								<td>administrator</td>
								<td>0</td>
							</tr>
							 
						</tbody>
		
					</table>
				</div>
				<!-- /.box-body -->
			</div>
			<!-- /.box -->
		
			<div class="cf">
				<div class="pull-right">	
			
			 <ul class="pagination">
					
						 <li class="paginate_button previous disabled">
		                            <a href="#" data-dt-idx="0" tabindex="0">上页</a>
		                  </li>
					
					
							<li class="paginate_button active">
		                     <a href="#" data-dt-idx="1" tabindex="0">1</a>
		                 	</li>
					
					
						 <li class="paginate_button next disabled">
		                     <a href="#" data-dt-idx="2" tabindex="0">下页</a>
		                 </li>
			</ul>
		</div>
			</div>
			<!-- /.row -->
		</section>
    	<!-- /.content -->
	  </div>