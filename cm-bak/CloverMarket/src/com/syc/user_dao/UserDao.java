package com.syc.user_dao;

import com.syc.user_entity.User;

public interface UserDao {
	//与UserDaoMapper.xml里ins对应
	public void ins(User user);
	//与UserDaoMapper.xml里reg对应
	public void reg(Integer id,String username,String password);
}
