package com.iverson.model.template.course;

/**
 * @program: delegate
 * @author: ouguoxin
 * @create: 2020-12-28 15:54
 **/

public class BigDataCourse extends NetworkCourse{

    private boolean needHomeworkFlag = false;

    public BigDataCourse(boolean needHomeworkFlag) {
        this.needHomeworkFlag = needHomeworkFlag;
    }

    @Override
    void checkHomework() {
        System.out.println("检查Java的架构课件");
    }

    @Override
    protected boolean needHomework() {
        return this.needHomeworkFlag;
    }
}

