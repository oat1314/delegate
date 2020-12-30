package com.iverson.model.adapter.loginadapter.v1.service;

import com.iverson.model.adapter.loginadapter.Member;
import com.iverson.model.adapter.loginadapter.ResultMsg;

/**
 * @program: delegate
 * @author: ouguoxin
 * @create: 2020-12-28 16:44
 **/

public class SiginService {

    public ResultMsg regist(String username,String password) {
        return new ResultMsg(200,"注册成功",new Member());
    }

    public ResultMsg login(String username,String password) {
        return null;
    }


}

