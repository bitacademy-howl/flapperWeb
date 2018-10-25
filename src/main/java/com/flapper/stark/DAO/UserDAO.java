package com.flapper.stark.DAO;

import java.util.List;

import com.flapper.stark.model.UserVO;

public interface UserDAO {
	public List<UserVO> getList();
}