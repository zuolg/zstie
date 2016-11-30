 <div>
	    <!-- Content Header (Page header) -->
	    <section class="content-header">
	      <h1> 个人资料
	        <small>个人资料</small>
	      </h1>
	    </section>
	
	    <!-- Main content -->
	    <section class="content">
			<form action="/jpress/admin/user/save" method="post" id="form" enctype="multipart/form-data">
			<input name="user.id" value="" type="hidden">
			<div class="col-xs-12 ">
				<div class="row">
					<h4 class="jp-set-pad jp-set-title">姓名</h4>
					<ul class="list-unstyled">
						<li class="jp-set-pad">
							<div class="col-sm-3 jp-common-pad  jp-set-info">用户名 (必填)</div>
							<div class="col-sm-9 jp-common-pad ">
								<div class="col-sm-6  ">
									<input class="form-control input-md" name="user.username" value="" type="text">
								</div>
							</div>
							<div class="clr"></div>
						</li>
		
						<li class="jp-set-pad">
							<div class="col-sm-3 jp-common-pad  jp-set-info">昵称 (必填)</div>
							<div class="col-sm-9 jp-common-pad ">
								<div class="col-sm-6  ">
									<input class="form-control input-md" name="user.nickname" value="" type="text">
								</div>
							</div>
							<div class="clr"></div>
						</li>
					</ul>
					
				</div>
				<div class="row">
					<h4 class="jp-set-pad jp-set-title">联系信息</h4>
					<ul class="list-unstyled">
		
						<li class="jp-set-pad">
							<div class="col-sm-3 jp-common-pad  jp-set-info">电子邮件 (必填)</div>
							<div class="col-sm-9 jp-common-pad ">
								<div class="col-sm-6  ">
									<input class="form-control input-md" name="user.email" value="" type="text">
								</div>
							</div>
							<div class="clr"></div>
						</li>
		
						<li class="jp-set-pad">
							<div class="col-sm-3 jp-common-pad  jp-set-info">电话</div>
							<div class="col-sm-9 jp-common-pad ">
								<div class="col-sm-6  ">
									<input class="form-control input-md" name="user.mobile" value="" type="text">
								</div>
							</div>
							<div class="clr"></div>
						</li>
		
						<li class="jp-set-pad">
							<div class="col-sm-3 jp-common-pad  jp-set-info">QQ</div>
							<div class="col-sm-9 jp-common-pad ">
								<div class="col-sm-6  ">
									<input class="form-control input-md" name="user.qq" value="" type="text">
								</div>
							</div>
							<div class="clr"></div>
						</li>
		
						<li class="jp-set-pad">
							<div class="col-sm-3 jp-common-pad  jp-set-info">微博</div>
							<div class="col-sm-9 jp-common-pad ">
								<div class="col-sm-6  ">
									<input class="form-control input-md" name="user.weibo" value="" type="text">
								</div>
							</div>
							<div class="clr"></div>
						</li>
					</ul>
					
				</div>
				<div class="row">
					<h4 class="jp-set-pad jp-set-title">签名</h4>
					<ul class="list-unstyled">
						<li class="jp-set-pad">
							<div class="col-sm-3 jp-common-pad  jp-set-info">个人签名</div>
							<div class="col-sm-9 jp-common-pad ">
								<div class="col-sm-7  ">
									<div class="form-group">
										<textarea class="form-control" rows="4" name="user.signature"></textarea>
										<p>分享关于您的一些心情和公开信息。</p>
									</div>
								</div>
							</div>
							<div class="clr"></div>
						</li>
						
						<li class="jp-set-pad">
							<div class="col-sm-3 jp-set-info">
								头像
							</div>
							<div class="col-sm-9 jp-common-pad ">
								<div class="col-sm-7 ">
									<input class="form-control input-md" name="user.avatar" value="" type="text">
									<input name="user.avatar" type="file">
								</div>
							</div>
							<div class="clr"></div>
						</li>
						
					</ul>
					
				</div>
				<div class="row">
					<h4 class="jp-set-pad jp-set-title">密码</h4>
					<ul class="list-unstyled">
						<li class="jp-set-pad">
							<div class="col-sm-3 jp-common-pad  jp-set-info">密码</div>
							<div class="col-sm-9 jp-common-pad ">
								<div class="col-sm-7  ">
									<div class="form-group">
										<input class="form-control input-md" id="password" name="user.password" autocomplete="off" spellcheck="false" type="password">
										<input style="height: 1px;width: 1px;opacity:0;" type="password"><!-- 防止密码被自动填充 -->
									</div>
								</div>
							</div>
							<div class="clr"></div>
						</li>
					</ul>
				</div>
				
			</div>
			
			<div class="row">
				<div class="col-xs-12">
					<button type="button" onclick="doSubmit()" class="btn btn-primary">保存更改</button>
				</div>
				</div>
			</form>
		</section>
    	<!-- /.content -->
	  </div>