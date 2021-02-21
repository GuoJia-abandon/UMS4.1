package com.guo.dao;

import com.guo.pojo.entity.User;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @program: ums3.1
 * @description: 用户信息持久层接口
 * @author: Mr.guo
 * @create: 2021-01-09 10:55
 **/
@Repository
public interface UserDao {

	/**
	 * <b>根据查询对象查询列表信息</b>
	 * @param query
	 * @return
	 * @throws Exception
	 */
	List<User> findListByQuery(User query) throws Exception;

	/**
	 * <b>保存对象</b>
	 * @param entity
	 * @return
	 * @throws Exception
	 */
	int save(User entity) throws Exception;

	/**
	 * <b>修改信息</b>
	 * @param entity
	 * @return
	 * @throws Exception
	 */
	int update(User entity) throws Exception;
}
