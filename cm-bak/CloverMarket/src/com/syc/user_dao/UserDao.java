package com.syc.user_dao;

import com.syc.user_entity.User;

public interface UserDao {
	//��UserDaoMapper.xml��ins��Ӧ
	public void ins(User user);
	//��UserDaoMapper.xml��reg��Ӧ
	public void reg(Integer id,String username,String password);
}
