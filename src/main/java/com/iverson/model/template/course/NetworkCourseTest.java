package com.iverson.model.template.course;

/**
 * @program: delegate
 * @author: ouguoxin
 * @create: 2020-12-28 16:01
 **/

public class NetworkCourseTest {

    public static void main(String[] args) {
        System.out.println("---Java架构师课程---");
        NetworkCourse javaCourse = new JavaCourse();
        javaCourse.createCourse();

        System.out.println("---大数据课程---");
        NetworkCourse bigDataCourse = new BigDataCourse(true);
        bigDataCourse.createCourse();
    }

}

