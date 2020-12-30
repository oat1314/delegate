package com.iverson.model.adapter.loginadapter.v1;

import com.iverson.model.adapter.loginadapter.v1.service.SinginForThirdService;

/**
 * @program: delegate
 * @author: ouguoxin
 * @create: 2020-12-28 16:54
 **/

public class SiginForThirdServiceTest {
    public static void main(String[] args) {
        SinginForThirdService service = new SinginForThirdService();
        service.login("tom","123456");
        service.loginForQQ("asdfasdf");
        service.loginForWechat("fsafsdafs");
    }


}

