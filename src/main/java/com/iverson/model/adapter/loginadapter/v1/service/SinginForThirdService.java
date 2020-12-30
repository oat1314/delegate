package com.iverson.model.adapter.loginadapter.v1.service;

import com.iverson.model.adapter.loginadapter.ResultMsg;

/**
 * @program: delegate
 * @author: ouguoxin
 * @create: 2020-12-28 16:47
 **/

public class SinginForThirdService extends SiginService {

    public ResultMsg loginForQQ(String openId) {
        return loginForRegist(openId,null);
    }

    public ResultMsg loginForWechat(String openId) {
        return null;
    }

    public ResultMsg loginForToken(String token) {
        return null;
    }

    public ResultMsg loginForTelphone(String telphone,String code) {
        return null;
    }

    public ResultMsg loginForRegist(String username,String password){
        super.regist(username,null);
        return super.login(username,null);
    }
}

