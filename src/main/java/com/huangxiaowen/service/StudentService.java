package com.huangxiaowen.service;

import com.huangxiaowen.domain.Student;

import java.util.List;

public interface StudentService {
    int addStudent(Student student);
    List<Student> findStudents();
}
