package com.guo.service.Impl;

import com.guo.dao.UserDao;
import com.guo.pojo.entity.User;
import com.guo.pojo.vo.CellphoneVo;
import com.guo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * 类描述：
 *
 * @ClassName UserServiceImpl
 * @Description 用户业务逻辑层接口实现类
 * @Author 郭佳
 * @Date 2021/2/4 20:48
 * @Version 1.0
 */
@Service("userServiceImpl")
@Transactional
public class UserServiceImpl implements UserService {

	@Autowired
	private UserDao userDao;

	@Override
	public boolean getCelllphoneByUser(CellphoneVo cellphoneVo) throws Exception {
		User query = new User();
		query.setCellphone(cellphoneVo.getCellphone());
		List<User> listByQuery = userDao.findListByQuery(query);
		if (listByQuery == null || listByQuery.isEmpty()){
			return true;
		} else {
			if (cellphoneVo.getId() != null && cellphoneVo.getId().equals(listByQuery.get(0).getId())){
				return true;
			}
		}
		return false;
	}

	/**
	 * @Description: 用户注册
	 * @Param: [com.guo.pojo.entity.User]
	 * @return: boolean
	 * @Author: 郭佳
	 * @Date: 2021/2/7
	 */
	@Override
	public boolean registerUser(User user) throws Exception{
		if (userDao.save(user) > 0){
			return true;
		}
		return false;
	}
}