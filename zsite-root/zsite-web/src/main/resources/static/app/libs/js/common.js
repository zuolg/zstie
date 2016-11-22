/**
* 模块名：共通脚本
* 程序名: 通用方法lzmon.js
**/

var lz = {};
lz.vm = {};

/** 
* @author zuolangguo 
* @constructor AjaxPost 
* @description 通用ajax 无进度条
* @example lz.AjaxPost("a.do","type=1","json",acallback); 
* @since version 1.0
* @param url ajax访问url
* @param param ajax参数
* @param dataType 数据类型
* @param callback 回调函数
* @param apidiv 进度条显示位置，不填写在body
*/ 
lz.AjaxPost = function(url, param, dataType, callback) {
	$.ajax({
		type : "post",
		url : url,
		data : param,
		dataType : dataType,
		success : callback,
		error : function(e) {
			alert(e);
		}
	} );
};

/** 
* @author zuolangguo 
* @constructor AjaxGet 
* @description 通用ajax 无进度条
* @example lz.AjaxGet("a.do","type=1","json",acallback); 
* @since version 1.0
* @param url ajax访问url
* @param param ajax参数
* @param dataType 数据类型
* @param callback 回调函数
* @param apidiv 进度条显示位置，不填写在body
*/ 
lz.AjaxGet = function(url, param, dataType, callback) {
	$.ajax({
		type : "get",
		url : url,
		data : param,
		dataType : dataType,
		success : callback,
		error : function(e) {
			console.log('data:'+e); 
			alert('Ajax获取数据异常!');
		}
	} );
};

/**
 * @author zuolangguo
 * @constructor 判断字符串是否为空
 * @description 判断字符串是否为空
 * @example Util.format("qwe");
 * @since version 1.0
 * @param format
 */
lz.isEmpty = function(str) {
	return str == null || (typeof (str) == undefined)|| (typeof (str) == 'undefined') || (str == 'undefined')|| str == '';
}

//alert提示
lz.alert = function(str){
	alert("aaaaaaaaa==="+str);
}

//toast
lz.toast = function(str){
	$.toast(str);
}


