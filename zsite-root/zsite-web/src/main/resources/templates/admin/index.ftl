<!DOCTYPE html>
<html>
<head>
  <meta charset="utf-8">
  <meta http-equiv="X-UA-Compatible" content="IE=edge">
  <title>用户登录</title>
  <meta name="viewport" content="width=device-width, initial-scale=1">
  
  <#include "/inc/_style.ftl"/>
  
</head>
<body class="hold-transition skin-blue sidebar-mini">
<div class="wrapper">

  <!-- Main Header -->
  <header class="main-header">

    <!-- Logo -->
    <a href="#" class="logo">
      <!-- mini logo for sidebar mini 50x50 pixels -->
      <span class="logo-mini"><b>A</b>LT</span>
      <!-- logo for regular state and mobile devices -->
      <span class="logo-lg"><b>后台管理</b></span>
    </a>

    <!-- Header Navbar -->
    <nav class="navbar navbar-static-top" role="navigation">
      <!-- Sidebar toggle button-->
      <a href="#" class="sidebar-toggle" data-toggle="offcanvas" role="button">
        <span class="sr-only">Toggle navigation</span>
      </a>
      <!-- Navbar Right Menu -->
      <div class="navbar-custom-menu">
        <ul class="nav navbar-nav">
           

          <!-- Notifications Menu -->
          <li class="dropdown notifications-menu">
            <!-- Menu toggle button -->
            <a href="#" class="dropdown-toggle" data-toggle="dropdown">
              <i class="fa fa-bell-o"></i>
              <span class="label label-warning">10</span>
            </a>
            <ul class="dropdown-menu">
              <li class="header">您有10调通知</li>
              <li>
                <!-- Inner Menu: contains the notifications -->
                <ul class="menu">
                  <li><!-- start notification -->
                    <a href="#">
                      <i class="fa fa-users text-aqua"></i> 5条最新通知
                    </a>
                  </li>
                  <!-- end notification -->
                </ul>
              </li>
              <li class="footer"><a href="#">查看所有</a></li>
            </ul>
          </li>
          <!-- Tasks Menu -->
          <li class="dropdown tasks-menu">
            <!-- Menu Toggle Button -->
            <a href="#" class="dropdown-toggle" data-toggle="dropdown">
              <i class="fa fa-flag-o"></i>
              <span class="label label-danger">2</span>
            </a>
            <ul class="dropdown-menu">
              <li class="header">你有2条任务</li>
              <li>
                <!-- Inner menu: contains the tasks -->
                <ul class="menu">
                  <li><!-- Task item -->
                    <a href="#">
                      <!-- Task title and progress text -->
                      <h3>
                        	任务情况
                        <small class="pull-right">20%</small>
                      </h3>
                      <!-- The progress bar -->
                      <div class="progress xs">
                        <!-- Change the css width attribute to simulate progress -->
                        <div class="progress-bar progress-bar-aqua" style="width: 20%" role="progressbar" aria-valuenow="20" aria-valuemin="0" aria-valuemax="100">
                          <span class="sr-only">20% Complete</span>
                        </div>
                      </div>
                    </a>
                  </li>
                  <!-- end task item -->
                </ul>
              </li>
              <li class="footer">
                <a href="#">查看所有任务</a>
              </li>
            </ul>
          </li>
          
          <!-- Control Sidebar Toggle Button -->
          <li>
            <a href="#" data-toggle="control-sidebar"><i class="fa fa-gears"></i></a>
          </li>
        </ul>
      </div>
    </nav>
  </header>
  <!-- Left side column. contains the logo and sidebar -->
  <aside class="main-sidebar">

    <!-- sidebar: style can be found in sidebar.less -->
    <section class="sidebar">

      <!-- Sidebar user panel (optional) -->
      <div class="user-panel">
        <div class="pull-left image">
          <img src="/pc/images/avatar5.png" class="img-circle" alt="User Image">
        </div>
        <div class="pull-left info">
          <p>系统管理员</p>
          <!-- Status -->
          <a href="#"><i class="fa fa-circle text-success"></i> Online</a>
        </div>
      </div>

      <!-- search form (Optional) -->
      <form action="#" method="get" class="sidebar-form">
        <div class="input-group">
          <input type="text" name="q" class="form-control" placeholder="搜索...">
              <span class="input-group-btn">
                <button type="submit" name="search" id="search-btn" class="btn btn-flat"><i class="fa fa-search"></i>
                </button>
              </span>
        </div>
      </form>
      <!-- /.search form -->

      <!-- Sidebar Menu -->
      <ul class="sidebar-menu">
        <li class="header">菜单</li>
        <!-- Optionally, you can add icons to the links -->
        <!-- 文章 -->
        <li class="treeview">
          <a href="#"><i class="fa fa-file-text-o"></i> <span>文章</span>
            <span class="pull-right-container">
              <i class="fa fa-angle-left pull-right"></i>
            </span>
          </a>
          <ul class="treeview-menu">
             <li id="list">
                <a href="#" onclick="go(this);" goUrl="/admin/allArticle?m=article&amp;p=article&amp;c=list">所有文章</a>
            </li>
            <li id="edit">
                <a href="#" onclick="go(this);" goUrl="/admin/editArticle?m=article&amp;p=article&amp;c=edit">撰写文章</a>
            </li>
            <li id="category">
                <a href="#" onclick="go(this);" goUrl="/admin/category?m=article&amp;t=category&amp;p=article&amp;c=category">分类</a>
            </li>
            <li id="feature">
                <a href="#" onclick="go(this);" goUrl="/admin/feature?m=article&amp;t=feature&amp;p=article&amp;c=feature">专题</a>
            </li>
            <li id="tag">
                <a href="#" onclick="go(this);" goUrl="/admin/tag?m=article&amp;t=tag&amp;p=article&amp;c=tag">标签</a>
            </li>
            <li id="comment">
                <a href="#" onclick="go(this);" goUrl="/admin/comment?t=comment&amp;m=article&amp;p=article&amp;c=comment">评论</a>
            </li>
          </ul>
        </li>
        <!-- ./文章 -->
        
        <!-- 页面 -->
        <li class="treeview">
          <a href="#"><i class="fa fa-sticky-note"></i> <span>页面</span>
            <span class="pull-right-container">
              <i class="fa fa-angle-left pull-right"></i>
            </span>
          </a>
          <ul class="treeview-menu">
            <li id="list">
                <a href="#" onclick="go(this);" goUrl="/admin/allPage?m=page&amp;p=page&amp;c=list">所有页面</a>
            </li>
            <li id="edit">
                <a href="#" onclick="go(this);" goUrl="/admin/newPage?m=page&amp;p=page&amp;c=edit">新建页面</a>
            </li>
           
          </ul>
        </li>
        <!-- ./页面 -->
        
        <!-- 附件 -->
        <li class="treeview">
          <a href="#"><i class="fa fa-file-image-o"></i><span>附件</span>
            <span class="pull-right-container">
              <i class="fa fa-angle-left pull-right"></i>
            </span>
          </a>
          <ul class="treeview-menu">
            <li id="list">
                <a href="#" onclick="go(this);" goUrl="/admin/allAttachment?p=attachment&amp;c=list">所有附件</a>
            </li>
            <li id="upload">
                <a href="#" onclick="go(this);" goUrl="/admin/upload?p=attachment&amp;c=upload">上传</a>
            </li>
          </ul>
        </li>
        <!-- ./附件 -->
        
        <!-- 用户 -->
        <li class="treeview">
          <a href="#"><i class="fa fa-user"></i><span>用户</span>
            <span class="pull-right-container">
              <i class="fa fa-angle-left pull-right"></i>
            </span>
          </a>
          <ul class="treeview-menu">
            <li id="list">
                <a href="#" onclick="go(this);" goUrl="/admin/allUser?p=user&amp;c=list">所有用户</a>
            </li>
            <li id="edit">
                <a href="#" onclick="go(this);" goUrl="/admin/addUser?p=user&amp;c=edit">添加</a>
            </li>
            <li id="info">
                <a href="#" onclick="go(this);" goUrl="/admin/userInfo?p=user&amp;c=info">我的资料</a>
            </li>
          </ul>
        </li>
        <!-- ./用户 -->
        
        <!-- 模版 -->
        <li class="treeview">
          <a href="#"><i class="fa fa-magic"></i><span>模版</span>
            <span class="pull-right-container">
              <i class="fa fa-angle-left pull-right"></i>
            </span>
          </a>
          <ul class="treeview-menu">
            <li id="list">
                <a href="#" onclick="go(this);" goUrl="/admin/welcome?p=template&amp;c=list">所有模板</a>
            </li>
            <li id="install">
                <a href="#" onclick="go(this);" goUrl="/admin/welcome?p=template&amp;c=install">模板安装</a>
            </li>
            <li id="menu">
                <a href="#" onclick="go(this);" goUrl="/admin/welcome?p=template&amp;c=menu">菜单</a>
            </li>
            <li id="setting">
                <a href="#" onclick="go(this);" goUrl="/admin/welcome?p=template&amp;c=setting">设置</a>
            </li>
            <li id="edit">
                <a href="#" onclick="go(this);" goUrl="/admin/welcome?p=template&amp;c=edit">编辑</a>
            </li>
        </ul>
        </li>
        <!-- ./模版 -->
        
        <!-- 设置 -->
        <li class="treeview">
          <a href="#"><i class="fa fa-cog"></i> <span>设置</span>
            <span class="pull-right-container">
              <i class="fa fa-angle-left pull-right"></i>
            </span>
          </a>
          <ul class="treeview-menu">
            <li id="list">
                <a href="#" onclick="go(this);" goUrl="/admin/option?p=option&amp;c=list">常规</a>
            </li>
            <li id="edit">
                <a href="#" onclick="go(this);" goUrl="/admin/welcome?p=option&amp;c=edit">评论</a>
            </li>
            <li id="n">
                <a href="#" onclick="go(this);" goUrl="/admin/welcome?p=option&amp;c=n">通知</a>
            </li>
            <li id="seo">
                <a href="#" onclick="go(this);" goUrl="/admin/welcome?p=option&amp;c=seo">SEO</a>
            </li>
            <li id="watermark">
                <a href="#" onclick="go(this);" goUrl="/admin/welcome?p=option&amp;c=watermark">水印</a>
            </li>
            <li id="url">
                <a href="#" onclick="go(this);" goUrl="/admin/welcome?p=option&amp;c=url">连接形式</a>
            </li>
            <li id="reg">
                <a href="#" onclick="go(this);" goUrl="/admin/welcome?p=option&amp;c=reg">登录注册</a>
            </li>
            <li id="cdn">
                <a href="#" onclick="go(this);" goUrl="/admin/welcome?p=option&amp;c=cdn">CDN加速</a>
            </li>
            <li id="api">
                <a href="#" onclick="go(this);" goUrl="/admin/welcome?p=option&amp;c=api">API应用</a>
            </li>
          </ul>
        </li>
        <!-- ./设置 --> 
      </ul>
      <!-- /.sidebar-menu -->
    </section>
    <!-- /.sidebar -->
  </aside>

  <!-- Content Wrapper. Contains page content --> 
  <div class="content-wrapper"  id="pageContent">
	<#include "/admin/welcome.ftl"/>
  </div>
  <!-- /.content-wrapper -->

  <!-- Main Footer -->
  <#include "/inc/_footer.ftl"/>

  <!-- Control Sidebar -->
  <aside class="control-sidebar control-sidebar-dark">
    <!-- Create the tabs -->
    <ul class="nav nav-tabs nav-justified control-sidebar-tabs">
      <li class="active"><a href="#control-sidebar-home-tab" data-toggle="tab"><i class="fa fa-home"></i></a></li>
      <li><a href="#control-sidebar-settings-tab" data-toggle="tab"><i class="fa fa-gears"></i></a></li>
    </ul>
    <!-- Tab panes -->
    <div class="tab-content">
      <!-- Home tab content -->
      <div class="tab-pane active" id="control-sidebar-home-tab">
        <h3 class="control-sidebar-heading">说明</h3>
        
        <!-- /.control-sidebar-menu -->

        
        <!-- /.control-sidebar-menu -->

      </div>
      <!-- /.tab-pane -->
      <!-- Stats tab content -->
      <div class="tab-pane" id="control-sidebar-stats-tab">Stats Tab Content</div>
      <!-- /.tab-pane -->
      <!-- Settings tab content -->
      <div class="tab-pane" id="control-sidebar-settings-tab">
        <form method="post">
          <h3 class="control-sidebar-heading">全局配置</h3>

          <div class="form-group">
            <label class="control-sidebar-subheading">
             	用户配置项
              <input type="checkbox" class="pull-right" checked>
            </label>

            <p>
              	配置说明
            </p>
          </div>
          <!-- /.form-group -->
        </form>
      </div>
      <!-- /.tab-pane -->
    </div>
  </aside>
  <div class="control-sidebar-bg"></div>
</div>
<!-- ./wrapper -->
   
  
  <!-- _script -->
  <#include "/inc/_script.ftl"/>
  <!-- / _script -->
  

</body>
</html>