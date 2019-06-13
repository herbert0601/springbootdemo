package com.herbert.dao;

import com.herbert.domain.Student;

/**
 * @author Herbert
 * @create 2019-06-13 11:15
 */
public interface StudentMapper {
    Integer addStudent(Student student);

    void delStudent(Integer id);

    void updateStudent(Integer id);

    Student queryStudent(String sno);
}
