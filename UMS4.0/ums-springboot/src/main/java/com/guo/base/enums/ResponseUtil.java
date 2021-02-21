package com.guo.base.enums;

import com.guo.util.ConstantUtil;

import java.util.Properties;

/**
 * <b>系统响应工具类</b>
 */
 class ResponseUtil {
	private static Properties prop = new Properties();

	static {
		try {
			prop.load(ConstantUtil.class.getClassLoader().getResourceAsStream("enums.properties"));
		} catch (Exception e){
			e.printStackTrace();
		}
	}

	/*
	 *<b>系统响应成功</b>
	 */
	 static final Integer RESP_CODE_SUCCESS = Integer.parseInt(prop.getProperty("resp.code.success"));

	/*
	 *<b>系统响应异常</b>
	 */
	 static final Integer RESP_CODE_EXCEPTION = Integer.parseInt(prop.getProperty("resp.code.exception"));

	/*
	 *<b>系统响应错误</b>
	 */
	 static final Integer RESP_CODE_ERROR = Integer.parseInt(prop.getProperty("resp.code.error"));
}
