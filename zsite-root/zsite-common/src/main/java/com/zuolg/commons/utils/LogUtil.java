package com.zuolg.commons.utils;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.logging.Log;
import org.slf4j.Logger;

/**
 * 日志帮助类
 * 
 * 
 */
public class LogUtil {

	public final static SimpleDateFormat DATE_FORMAT = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

	/**
	 * 获得到当前执行处的调用过程作为字符串返回，msg是要放到字符串前面的内容，方便直接用log
	 * 
	 * @param msg
	 * @return
	 */
	public static String getStackTrace(String msg) {
		StringBuffer sb = new StringBuffer();
		sb.append(msg);
		StackTraceElement[] trace = Thread.currentThread().getStackTrace();
		for (int i = 3; i < trace.length; i++) {
			sb.append("\tat ");
			sb.append(trace[i]).append("\n");
		}
		return sb.toString();
	}

	/**
	 * debug时，将long型按时间的格式输出
	 * 
	 * @param time
	 * @return
	 */
	public static String longDateToStr(long time) {
		return DATE_FORMAT.format(new Date(time));
	}

	public static void traceWarn(Log log, String errorMsg) {
		log.warn(getStackTrace(errorMsg));
	}

	public static void traceWarn(Logger log, String errorMsg) {
		log.warn(getStackTrace(errorMsg));
	}

	public static String getTraceStringOld(String errorMsg, Throwable e) {
		StringWriter w = new StringWriter();
		PrintWriter out = new PrintWriter(w);
		if (!StringUtils.isEmpty(errorMsg)) {
			out.println(errorMsg);
		}
		e.printStackTrace(out);
		return w.toString();
	}

	/**
	 * 不会抛错的String.format
	 * 
	 * @param format
	 * @param args
	 * @return
	 */
	public static String format(String format, Object... args) {
		try {
			return String.format(format, args);
		} catch (Exception e) {
			StringBuffer sb = new StringBuffer();
			sb.append(format).append(' ').append(e.getMessage()).append('\t');
			for (int i = 0; i < args.length; i++) {
				sb.append(args[i]).append(" ");
			}
			return sb.toString();
		}
	}

}
