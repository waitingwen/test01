package com.huangxiaowen.service.impl;

import com.huangxiaowen.dao.StudentDao;
import com.huangxiaowen.domain.Student;
import com.huangxiaowen.service.StudentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {
    //引用；类型自动注入@Autowired，@Resource
    @Resource
    private StudentDao studentDao;
    @Override
    public int addStudent(Student student) {
        int nums = studentDao.insertStudent(student);
        return nums;
    }

    @Override
    public List<Student> findStudents() {
        return studentDao.selectStudent();
    }
}
