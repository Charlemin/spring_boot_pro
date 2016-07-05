package com.zm.boot.controller;

import com.zm.boot.dao.UserDao;
import com.zm.boot.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.apache.log4j.Logger;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * Created by Eric on 2016/6/27.
 */

@RestController
@RequestMapping("/user")
public class UserController {

    private static Logger logger = Logger.getLogger(UserController.class.getName());
    @Autowired
    private UserDao userDao;

    @RequestMapping(value = "/{id}")
    public @ResponseBody Object view (@PathVariable("id") long id) {
        User user=new User();
        user.setId(id);
        user.setName("zha");
//        User user2=userDao.findById(7L);
        userDao.save(user);
        return this.setResult(0,"",user);
    }

    @RequestMapping(value = "/one",method = RequestMethod.GET)
    public @ResponseBody Object getList(){
        List<User> users;
        users = userDao.findByIdAndName(7L,"zha");
        logger.info("getLinst" + " " + users);
        return this.setResult(0,"",users);
    }
    @RequestMapping(value = "/top",method = RequestMethod.GET)
    public @ResponseBody Object getTop(){
        List<User> users = null;
        users = userDao.findTop2ByName("zha");
        return this.setResult(0,"",users);
    }
    private Map<String, Object> setResult(int code, String msg, Object data) {
        Map<String, Object> result = new HashMap<String, Object>();
        result.put("code", code);
        result.put("message", msg);
        result.put("data", data);
        return result;
    }

    @RequestMapping(value = "/all",method = RequestMethod.GET)
    public @ResponseBody Object getAll(){
        Iterable<User> userList;
        userList = userDao.findAll();
        return this.setResult(0,"",userList);
    }
}
