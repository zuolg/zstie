 <div>
	    <!-- Content Header (Page header) -->
	    <section class="content-header">
	      <h1>
	        	网站基本信息
	        <small>网站基本信息</small>
	      </h1>
	    </section>
	
	    <!-- Main content -->
	    <section class="content">
			<p class="content-msg">
			 配置网站基本信息和管理员信息，通过管理员信息的配置，可以用来接收网站的相关动态。
			</p>
			<form action="/jpress/admin/option/save" method="POST" id="form">
				<input name="ucode" value="bd670f118c026a60f5f15b648b18a1f4" type="hidden"> 
				<input name="autosave" value="web_name,web_title,web_subtitle,web_domain,web_administrator_email,web_administrator_phone,web_administrator_wechat_openid,web_copyright,web_icp_number" type="hidden">
				<div class="row">
					<div class="col-xs-12">
						<h4 class="jp-set-title">常规选项</h4>
						<ul class="list-unstyled">
							<li class="jp-set-pad">
								<div class="col-sm-3 ">
									<div class="  jp-set-title-line jp-set-info ">网站名称</div>
								</div>
								<div class="col-sm-9  jp-set-title-line">
									<div class="col-sm-6 jp-table-distance-top ">
										<input class="form-control input-md" placeholder="请输入网站名称" name="web_name" value="网站标题" type="text">
									</div>
								</div>
								<div class="clr"></div>
							</li>
		
							<li class="jp-set-pad">
								<div class="col-sm-3 ">
									<div class="  jp-set-info ">网站标题</div>
								</div>
								<div class="col-sm-9  jp-set-title-line">
									<div class="col-sm-6 jp-table-distance-top ">
										<input class="form-control input-md" placeholder="请输入网站副标题" name="web_title" value="" type="text">
									</div>
								</div>
								<div class="clr"></div>
							</li>
							
							<li class="jp-set-pad">
								<div class="col-sm-3 ">
									<div class="  jp-set-info ">副标题</div>
								</div>
								<div class="col-sm-9  jp-set-title-line">
									<div class="col-sm-6 jp-table-distance-top ">
										<input class="form-control input-md" placeholder="请输入网站副标题" name="web_subtitle" value="" type="text">
									</div>
								</div>
								<div class="clr"></div>
							</li>
		
							<li class="jp-set-pad">
								<div class="col-sm-3 ">
									<div class=" jp-set-info ">网站域名</div>
								</div>
								<div class="col-sm-9  jp-set-title-line">
									<div class="col-sm-6 jp-table-distance-top ">
										<input class="form-control input-md" placeholder="请输入域名" name="web_domain" value="" type="text">
										请用http（或https）开头的域名，结尾不要包含“/”。<br>例如：http://jpress.io。
									</div>
									
								</div>
								<div class="clr"></div>
							</li>
						</ul>
					</div>
					<!-- /.box -->
				</div>
				
				<div class="row">
					<div class="col-xs-12">
						<h4 class="jp-set-title">管理员</h4>
						<ul class="list-unstyled">
							<li class="jp-set-pad">
								<div class="col-sm-3 ">
									<div class="  jp-set-title-line jp-set-info ">邮箱</div>
								</div>
								<div class="col-sm-9  jp-set-title-line">
									<div class="col-sm-6 jp-table-distance-top ">
										<input class="form-control input-md" placeholder="请输入管理员邮箱" name="web_administrator_email" value="" type="text">
									</div>
								</div>
								<div class="clr"></div>
							</li>
		
							<li class="jp-set-pad">
								<div class="col-sm-3 ">
									<div class="  jp-set-info ">手机</div>
								</div>
								<div class="col-sm-9  jp-set-title-line">
									<div class="col-sm-6 jp-table-distance-top ">
										<input class="form-control input-md" placeholder="请输入管理员手机号" name="web_administrator_phone" value="" type="text">
									</div>
								</div>
								<div class="clr"></div>
							</li>
							
							<li class="jp-set-pad">
								<div class="col-sm-3 ">
									<div class="  jp-set-info ">微信号</div>
								</div>
								<div class="col-sm-9  jp-set-title-line">
									<div class="col-sm-6 jp-table-distance-top ">
										<input class="form-control input-md" placeholder="请输入管理员微信ID" name="web_administrator_wechat_openid" value="" type="text">
									</div>
								</div>
								<div class="clr"></div>
							</li>
						</ul>
					</div>
					<!-- /.box -->
				</div>
				
				<div class="row">
					<div class="col-xs-12">
						<h4 class="jp-set-pad jp-set-title">可选</h4>
						<ul class="list-unstyled">
							<li class="jp-set-pad">
								<div class="col-sm-3  jp-set-info">版权信息</div>
								<div class="col-sm-9  jp-set-title-line">
									<div class="col-sm-6 jp-table-distance-top ">
										<textarea rows="5" class="form-control input-md" name="web_copyright"></textarea>
									</div>
								</div>
								<div class="clr"></div>
							</li>
							<li class="jp-set-pad">
								<div class="col-sm-3  jp-set-info">网站ICP备案号</div>
								<div class="col-sm-9  jp-set-title-line">
									<div class="col-sm-6 jp-table-distance-top ">
										<input class="form-control input-md" name="web_icp_number" value="" type="text">
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
				<!-- /.row -->
			</form>
		</section>
    	<!-- /.content -->
	  </div>