package com.guo.util;

import org.apache.tomcat.util.bcel.Const;

import java.util.Properties;

/**
 * <b>系统常量工具类</b>
 */
public class ConstantUtil {
	private static Properties prop = new Properties();

	static {
		try {
			prop.load(ConstantUtil.class.getClassLoader().getResourceAsStream("system.properties"));
		} catch (Exception e){
			e.printStackTrace();
		}
	}

	/*
	 *<b>分页信息：当前页数</b>
	 */
	public static final Integer PAGE_NUM = Integer.parseInt(prop.getProperty("page.num"));

	/*
	 *<b>分页信息：每页显示数量</b>
	 */
	public static final Integer PAGE_SIZE = Integer.parseInt(prop.getProperty("page.size"));
}
