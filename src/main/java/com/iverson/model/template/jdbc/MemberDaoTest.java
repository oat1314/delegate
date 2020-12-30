package com.iverson.model.template.jdbc;

import com.iverson.model.template.jdbc.dao.MemberDao;

import java.util.List;

/**
 * @program: delegate
 * @author: ouguoxin
 * @create: 2020-12-28 16:34
 **/

public class MemberDaoTest {

    public static void main(String[] args) {
        MemberDao memberDao = new MemberDao(null);
        List<?> result = memberDao.selectAll();
        System.out.println(result);
    }


}

