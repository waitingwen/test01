package com.huangxiaowen.dao;

import com.huangxiaowen.domain.Student;

import java.util.List;

public interface StudentDao {
    int insertStudent(Student student);
    List<Student> selectStudent();
}
