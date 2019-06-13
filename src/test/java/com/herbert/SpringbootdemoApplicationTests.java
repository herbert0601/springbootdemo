package com.herbert;

import com.herbert.domain.Student;
import com.herbert.service.StudentService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringbootdemoApplicationTests {

    @Autowired
    private StudentService studentService;

    @Test
    public void contextLoads() {
        Student s = new Student();
        s.setUsername("rose");
        s.setPassword("jack");
        s.setSno("1314520");
        s.setSex("female");
        Integer studentId = studentService.addStudent(s);
        System.out.println("学生ID："+studentId);
    }

}
