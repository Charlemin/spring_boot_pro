package com.zm.boot.dao;

import com.zm.boot.model.User;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Created by Eric on 2016/6/27.
 */

public interface UserDao extends CrudRepository<User,Long> {

    User findById(Long id);
    List<User> findByIdAndName(Long id,String name);
    List<User> findTop2ByName(String name);

}
