package com.shsxt.dao;

import com.shsxt.base.BaseMapper;
import com.shsxt.po.User;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Repository;

@Repository
public interface UserMapper extends BaseMapper<User> {

}