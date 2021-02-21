package com.guo.service;

import com.guo.pojo.entity.User;
import com.guo.pojo.vo.CellphoneVo;

/**
 * 类描述：
 *
 * @ClassName UserService
 * @Description 用户业务逻辑层接口
 * @Author 郭佳
 * @Date 2021/2/4 20:48
 * @Version 1.0
 */
public interface UserService {

	/**
	 * @Description: 根据电话号码查询用户
	 * @Param: [com.guo.pojo.vo.CellphoneVo]
	 * @return: boolean
	 * @Author: 郭佳
	 * @Date: 2021/2/4
	 */
	boolean getCelllphoneByUser(CellphoneVo cellphoneVo) throws Exception;

	/**
	 * @Description: 用户注册
	 * @Param: [com.guo.pojo.entity.User]
	 * @return: boolean
	 * @Author: 郭佳
	 * @Date: 2021/2/7
	 */
	boolean registerUser(User user) throws Exception;
}