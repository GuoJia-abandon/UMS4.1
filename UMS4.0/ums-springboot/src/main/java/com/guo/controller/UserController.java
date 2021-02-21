package com.guo.controller;

import com.guo.base.base.baseController;
import com.guo.base.vo.ResponseVo;
import com.guo.pojo.entity.User;
import com.guo.pojo.vo.CellphoneVo;
import com.guo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 类描述：
 *
 * @ClassName UserController
 * @Description TODO
 * @Author 郭佳
 * @Date 2021/2/4 20:44
 * @Version 1.0
 */
@RestController
@RequestMapping("/user")
public class UserController extends baseController {

	@Autowired
	private UserService userService;

	/**
	 * @Description: 检查手机号码是否可用
	 * @Param: [com.guo.pojo.vo.CellphoneVo]
	 * @return: com.guo.base.vo.ResponseVo
	 * @Author: 郭佳
	 * @Date: 2021/2/4
	 */
	@PostMapping("/check/cellphone")
	public ResponseVo checkCellphoneIsCanUse(@RequestBody CellphoneVo cellphoneVo) throws Exception{
		if (userService.getCelllphoneByUser(cellphoneVo)){
			return ResponseVo.getSuccessResponseVo(true);
		}
		return ResponseVo.getErrorResponseVo(false);
	}

	@PostMapping("/register")
	public ResponseVo registerUser(@RequestBody User user) throws Exception{
		if (userService.registerUser(user)){
			return ResponseVo.getSuccessResponseVo();
		}
		return ResponseVo.getErrorResponseVo(false);
	}





}