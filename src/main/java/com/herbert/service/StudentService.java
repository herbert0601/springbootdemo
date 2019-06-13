package com.herbert.service;

import com.herbert.domain.Student;

/**
 * @author Herbert
 * @create 2019-06-13 10:39
 */
public interface StudentService {
    Integer addStudent(Student student);

    void delStudent(Integer id);

    void updateStudent(Integer id);

    Student queryStudent(String sno);
}

