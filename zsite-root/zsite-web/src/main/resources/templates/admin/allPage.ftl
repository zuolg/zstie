 <div>
	    <!-- Content Header (Page header) -->
	    <section class="content-header">
	      <h1>
	        	 		所有内容 	
	        <small> 		所有内容 	</small>
	      </h1>
	    </section>
	
	    <!-- Main content -->
	     <section class="content">

			<div class="row content-row">
				<ul class="list-inline" style="float: left">
					<li class="all">
						<a class="current" href="/jpress/admin/content?m=page&amp;p=page&amp;c=list">
							全部 <span class="count">(0)</span>
						</a>
						|
					</li>
					<li class="publish">
						<a href="/jpress/admin/content?m=page&amp;p=page&amp;c=list&amp;s=normal">
							已发布 <span class="count">(0)</span>
						</a>
						|
					</li>
					<li class="publish">
						<a href="/jpress/admin/content?m=page&amp;p=page&amp;c=list&amp;s=draft">
							草稿 <span class="count">(0)</span>
						</a>
						|
					</li>
					<li class="trash">
						<a href="/jpress/admin/content?m=page&amp;p=page&amp;c=list&amp;s=delete">
							垃圾箱 <span class="count">(0)</span>
						</a>
					</li>
				</ul>
		
		
				<form class="form-horizontal" method="POST" style="float: right" action="/jpress/admin/content?m=page&amp;p=page&amp;c=list&amp;s=&amp;tids=">
					<div class="input-group input-group-sm">
						<input id="post-search-input" class="form-control" value="" name="k" placeholder="请输入关键词" type="search">&nbsp;&nbsp;
						<input id="search-submit" class="btn btn-default btn-sm" value="搜索" type="submit">
					</div>
				</form>
			</div>
		
			<div class="row content-row">
				<div class="jp-left">
					<select class="form-control input-sm jp-width120" name="action">
						<option value="">==批量操作==</option>
						<option value="delete">删除</option>
					</select>
				</div>
				<div class="jp-left  ">
					<button class="btn btn-block btn-sm btn-default" type="button" onclick="batchAction()">应用</button>
				</div>
				
				
			</div>
		
			<div class="box">
				<!-- /.box-header -->
				<div class="box-body">
					<form action="" method="POST" id="form">
						<input name="ucode" value="bd670f118c026a60f5f15b648b18a1f4" type="hidden">
						<table class="table table-striped" style="word-break:break-all">
							<thead>
								<tr>
									<th style="width:20px;"><input name="dataItem" onclick="checkAll(this)" value="0" type="checkbox"></th>
									<th>标题</th>
									<th style="width:10%">作者</th> 
									<th style="width:5%"><i class="fa fa-commenting"></i></th>
									<th style="width:90px;">发布日期</th>
								</tr>
							</thead>
							<tbody>
								 					</tbody>
							<tfoot>
								<tr>
									<th style="width:20px;"><input name="dataItem" onclick="checkAll(this)" value="0" type="checkbox"></th>
									<th>标题</th>
									<th style="width:10%">作者</th> 
									<th style="width:5%"><i class="fa fa-commenting"></i></th>
									<th style="width:90px;">发布日期</th>
								</tr>
							</tfoot>
						</table>
						</form>
				</div>
				<!-- /.box-body -->
			</div>
			
			<div class="cf">
				<div class="pull-right ">
					
		
				</div>
			</div>
				
			<!-- /.row -->
		</section>
    	<!-- /.content -->
	  </div>