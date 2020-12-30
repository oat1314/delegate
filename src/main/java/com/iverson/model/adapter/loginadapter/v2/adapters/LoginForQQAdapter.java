package com.iverson.model.adapter.loginadapter.v2.adapters;


import com.iverson.model.adapter.loginadapter.ResultMsg;

/**
 *
 * @author Tom
 * @date 2019/3/16
 */
public class LoginForQQAdapter implements LoginAdapter {
    public boolean support(Object adapter) {
        return adapter instanceof LoginForQQAdapter;
    }

    public ResultMsg login(String id, Object adapter) {
        return null;
    }
}
