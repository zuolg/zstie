/**
* 模块名：共通脚本
* 程序名: 通用方法common.js
**/

var com = {};
com.vm = {};

/** 
* @author zuolangguo 
* @constructor AjaxPost 
* @description 通用ajax 无进度条
* @example com.AjaxPostNoLoader("a.do","type=1","json",acallback); 
* @since version 1.0
* @param url ajax访问url
* @param param ajax参数
* @param dataType 数据类型
* @param callback 回调函数
* @param apidiv 进度条显示位置，不填写在body
*/ 
com.AjaxPost = function(url, param, dataType, callback) {
	$.ajax({
		type : "post",
		url : url,
		data : param,
		dataType : dataType,
		success : callback,
		error : function(e) {
			var msg = e.responseText;
			var ret = msg
					.match(/^{\"Message\":\"(.*)\",\"ExceptionMessage\":\"(.*)\",\"ExceptionType\":.*/);
			if (ret != null) {
				msg = (ret[1] + ret[2]).replace(/\\"/g, '"').replace(
						/\\r\\n/g, '<br/>').replace(/dbo\./g, '');
			} else {
				try {
					msg = $(msg).text() || msg;
				} catch (ex) {
				}
			}
			// com.msgShow("提示","请求错误");
			//alert(msg);
		}
	} );
};

/** 
* @author zuolangguo 
* @constructor AjaxGet 
* @description 通用ajax 无进度条
* @example com.AjaxGetNoLoader("a.do","type=1","json",acallback); 
* @since version 1.0
* @param url ajax访问url
* @param param ajax参数
* @param dataType 数据类型
* @param callback 回调函数
* @param apidiv 进度条显示位置，不填写在body
*/ 
com.AjaxGet = function(url, param, dataType, callback) {
	$.ajax({
		type : "get",
		url : url,
		//data : param,
		dataType : dataType,
		success : callback,
		error : function(e) {
			console.log('data:'+e); 
			var msg = e.responseText;
			var ret = msg
					.match(/^{\"Message\":\"(.*)\",\"ExceptionMessage\":\"(.*)\",\"ExceptionType\":.*/);
			if (ret != null) {
				msg = (ret[1] + ret[2]).replace(/\\"/g, '"').replace(
						/\\r\\n/g, '<br/>').replace(/dbo\./g, '');
			} else {
				try {
					msg = $(msg).text() || msg;
				} catch (ex) {
				}
			}
			// com.msgShow("提示","请求错误");
			alert('Ajax获取数据异常!');
		}
	} );
};

function go(_this){
 	var url = _this.getAttribute("goUrl");
 	//alert(url);
 	$("#pageContent").load(url);
}