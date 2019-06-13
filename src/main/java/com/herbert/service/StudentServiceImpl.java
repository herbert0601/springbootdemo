package com.herbert.service;

import com.herbert.dao.StudentMapper;
import com.herbert.domain.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author Herbert
 * @create 2019-06-13 10:39
 */
@Service
@Transactional
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentMapper studentMapper;

    @Override
    public Integer addStudent(Student student) {
        return studentMapper.addStudent(student);
    }

    @Override
    public void delStudent(Integer id) {
        studentMapper.delStudent(id);
    }

    @Override
    public void updateStudent(Integer id) {
        studentMapper.updateStudent(id);
    }

    @Override
    public Student queryStudent(String sno) {
        return studentMapper.queryStudent(sno);
    }
}
