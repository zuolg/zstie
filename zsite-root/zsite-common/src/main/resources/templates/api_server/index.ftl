<!doctype html>
<html>
<head>
<meta charset="utf-8">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta http-equiv="Pragma" content="no-cache" />
<meta http-equiv="Cache-Control" content="no-cache" />
<meta http-equiv="Expires" content="0" />
<meta http-equiv="Cache-Control" content="must-revalidate" />
<title>${pageTitle} - API测试</title>
<link href="http://cdn.bootcss.com/bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet">

<link href="http://cdn.bootcss.com/Dropify/0.2.1/css/dropify.min.css" rel="stylesheet">
<script src="http://cdn.bootcss.com/Dropify/0.2.1/js/dropify.min.js"></script>
<script src="http://cdn.bootcss.com/jquery/3.1.1/jquery.min.js"></script>
<script src="http://cdn.bootcss.com/jquery.form/3.51/jquery.form.min.js"></script>

</head>
<style>
.msgWin {
	width: 200px;
}

#testFrame {
	margin: 0xp;
	padding: 0px;
	border: 0px;
	width: 100%;
	height: 100%;
	overflow: scroll;
}

#testDiv {
	position: absolute;
	top: 55px;
	left: 835px;
	bottom: 10px;
	margin: 10px;
	right: 5px;
	min-width: 200px;
	overflow: auto;
}

#leftDiv {
	position: absolute;
	top: 55px;
	left: 5px;
	bottom: 10px;
	margin: 5px;
	width: 320px;
	overflow: auto;
}

#descDiv {
	position: absolute;
	top: 55px;
	left: 330px;
	bottom: 10px;
	margin: 5px;
	width: 500px;
	overflow: auto;
}

div.myFrom {
	margin: 5px;
}

td {
	padding-top: 2px;
}

.w-m100 {
	min-width: 100px;
}

.high {
 	color:#0000ff;
}
pre {
	overflow: auto;
	white-space: pre-wrap;
	white-space: -moz-pre-wrap;
	white-space: -pre-wrap;
	white-space: -o-pre-wrap;
	word-wrap: break-word;
}
</style>
<script>
var lastObj = null;
function show(id) {
	var obj = document.getElementById(id);

	if (obj != null) {
		if (lastObj != null) {
			lastObj.style.display = "none";
		}

		if (obj.style.display == "none") {
			obj.style.display = "block";
			lastObj = obj;
		} else {
			obj.style.display = "none";
		}
	}
};

$(document).ready(function() {
	$(".js_form").submit(function() {
		var that = $(this);
		var url = $(this).attr("action")
		console.log("post to " + url);

		that.ajaxSubmit({  
			type : "post",  //提交方式  
			dataType:"html", //如果是要上传文件,只能用html
			url : url, //请求url  
			success:function(data){ //提交成功的回调函数
				var res = eval("(" + data + ")");
				if (!res.success) {
					console.log("错误信息:" + res.message);
				}
				$("#testResult").text(data);
			},
			error : function (xhr, status, error) {
				$("#testResult").text("错误码:" + xhr.status + "\n" + xhr.responseText);
			},
		});  
		return false;
	});
	
	$(".js_dropify").dropify({
		messages : {
			'default' : '点击或拖拽文件到这里',
			'replace' : '点击或拖拽文件到这里来替换文件',
			'remove' : '移除文件',
			'error' : '对不起，你上传的文件太大了'
		}
	});
});

</script>
</head>
<body>
	<nav class="navbar navbar-default" role="navigation">
		<div class="navbar-header">
			<a class="navbar-brand">API测试 ${apiServerUrl}</a>
		</div>
	</nav>
	<div id="testDiv">
		测试结果
		<pre id="testResult" ></pre>
	</div>
	<div id="leftDiv">
		<div class="list-group">
<#list vo.methods as m>
				<a href="#" onclick="show('${m.key}Div');return false"
					class="list-group-item"> ${m.url}
					<#if !m.needLogin><span class="label label-danger">open</span></#if>
				</a>
</#list>
		</div>
	</div>
	<div id="descDiv">
<#list vo.methods as m>
			<div id="${m.key}Div" style="display: none"
				class="panel panel-default">
				<div class="panel-heading">${m.memo} ${m.url}</div>
				<div class="panel-body">
					<h4>URL : <span class="text-info">${apiServerUrl}${vo.apiUrlPrefix}/${m.url}</span></h4>
					<p>
					<#if m.needLogin>
						登录用户 : <span class="label label-success"> ${m.webUserClasses}</span> ${m.optId}
					<#else>
						<span class="label label-danger">无需登录</span>
					</#if>
					</p>
					<form method="post" action="${apiServerUrl}${vo.apiUrlPrefix}/${m.url}"
						<#if m.uploadFile>enctype="multipart/form-data"</#if>
						class="js_form">
						<input name="linzi_ri_token" type="hidden" value="${token}"/>
						<table width="100%" class="table">
<#list m.paramVoList as pp>
								<tr>
									<td width="120" valign="top">${pp.name}:</td>
									<td>
									<#if pp.uploadFile>
										<input name="${pp.name}" type="file" class="js_dropify" data-show-remove="false"/>
									<#else>
										<#if pp.className == "boolean">
											<input name="${pp.name}" type="checkbox" value="true" />
										<#else>
											<input name="${pp.name}" type="text" value="${pp.value}" />
										</#if>
									</#if>
										<div class="text-muted">${pp.memo}</div></td>
								</tr>
</#list>
							<tr>
								<td>&nbsp;</td>
								<td>
									<button class="btn btn-primary w-m100" type="submit">测试</button>
								</td>
							</tr>
						</table>
					</form>

					<hr />
					<h4>返回的结果</h4>
					<span class="text-info">${m.returnClass.name}</span>
					<pre>
${m.defaultMockData}
		  </pre>

				</div>
			</div>
</#list>
	</div>
</body>
</html>