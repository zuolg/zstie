<!DOCTYPE html>
<html>
<head>
  <meta charset="utf-8">
  <meta http-equiv="X-UA-Compatible" content="IE=edge">
  <title>用户登录</title>
  <meta name="viewport" content="width=device-width, initial-scale=1">
  
  <#include "/inc/_style.ftl"/>
  <!-- iCheck -->
  <link rel="stylesheet" href="/pc/plugins/iCheck/square/blue.css">
  
</head>
<body class="hold-transition login-page">
	<div class="login-box">
	  <div class="login-logo">
	    <a href="/dev"><b>后台登录</b></a>
	  </div>
	  <!-- /.login-logo -->
	  <div class="login-box-body">
	    <p class="login-box-msg">后台用户登录</p>
	
	    <form action="/admin_login" method="post">
	      <div class="form-group has-feedback">
	      <input type="text" name="userName" class="form-control"  placeholder="请输入用户名" value="admin">
	        <span class="glyphicon glyphicon-envelope form-control-feedback"></span>
	      </div>
	      <div class="form-group has-feedback">
	        <input type="password" name="pwd" class="form-control" placeholder="请输入用户名" value="123456">
	        <span class="glyphicon glyphicon-lock form-control-feedback"></span>
	      </div>
	      <div class="row">
	        <div class="col-xs-12">
	          <div class="checkbox icheck">
	            <label>
	              <input type="checkbox"> 记住密码
	            </label>
	          </div>
	        </div>
	      </div>
	
	    <div class="social-auth-links text-center"> 
	    	<button type="submit" class="btn btn-block btn-primary btn-lg">登录</button>
	    </div>
	    <!-- /.social-auth-links --> 
	
	    </form>
	  </div>
	  <!-- /.login-box-body -->
	</div>
	<!-- /.login-box -->
   
  
  <!-- _script -->
  <#include "/inc/_script.ftl"/>
  <!-- / _script -->
  
  <!-- iCheck -->
	<script src="/pc/plugins/iCheck/icheck.min.js"></script>
	<script>
	  $(function () {
	    $('input').iCheck({
	      checkboxClass: 'icheckbox_square-blue',
	      radioClass: 'iradio_square-blue',
	      increaseArea: '20%' // optional
	    });
	  });
	</script>

</body>
</html>