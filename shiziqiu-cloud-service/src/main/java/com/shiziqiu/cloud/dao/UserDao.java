package com.shiziqiu.cloud.dao;

import java.util.List;

import com.shiziqiu.cloud.model.User;
/**
 * 
 * @author shiziqiu
 *
 */
public interface UserDao {

	int deleteByPrimaryKey(Integer id);

	int insert(User record);

	int insertSelective(User record);

	User selectByPrimaryKey(Integer id);

	int updateByPrimaryKeySelective(User record);

	int updateByPrimaryKey(User record);

	List<User> getAllUsers();
}
