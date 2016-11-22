<!doctype html>
<html>
<head>
<meta charset="utf-8">
<title>网站-开发调试</title>
<link href="http://cdn.bootcss.com/bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
	<div class="container">
		<div class="well">模拟用户登录页面</div>
		<div class="panel panel-default">
			<div class="panel-heading">模拟用户1</div>
			<div class="panel-body">
				<form class="form-inline" action="/" method="post">
					<div class="form-group">
						<label>Id:</label> <input type="text" name="id"
							class="form-control" placeholder="Jane Doe" value="1">
					</div>
					<div class="form-group">&nbsp;</div>
					<div class="form-group">
						<label>username</label> <input type="text" name="username"
							class="form-control" placeholder="请输入用户名" value="用户1">
					</div>
					<input type="submit" name="clientBtn" class="btn btn-primary"
						value="登录客户端" /> <input type="submit" name="devBtn"
						class="btn btn-info" value="登录调试界面" />
				</form>
			</div>
		</div>
		<div>
			<p>
			<a href="${jmxUrl}" target="_blank">JMX控制台</a>
			</p>
		</div>
	</div>
</body>
</html>
