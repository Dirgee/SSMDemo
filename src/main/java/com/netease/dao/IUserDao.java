package com.netease.dao;

import com.netease.model.User;
import org.springframework.stereotype.Repository;

@Repository
public interface IUserDao {

    User selectUser(long id);

}