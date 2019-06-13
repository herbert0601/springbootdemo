package com.herbert.controller;

import com.herbert.domain.Student;
import com.herbert.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * @author Herbert
 * @create 2019-06-13 10:13
 */
@Controller
@RequestMapping("/student")
public class StudentController {

    @Autowired
    private StudentService studentService;

    /*
    注意：访问页面的时候就不能在类上面写@restcontroller，会将"index"当成json数据返回界面的，不会跳转静态页面资源。
    因为@restcontroller默认将return后的数据转成json格式返回给请求路径。
        @restcontroller = @controller + @responsebody，推荐以后分开写，需要返回json时在方法上加@responsebody
    */
    @RequestMapping("/showIndex")
    public String showIndex(){
        return "index";
    }

    @RequestMapping(value="/addStudent")
    public String addStudent(Student student) {

        Integer studentId = studentService.addStudent(student);

        System.out.println(studentId);

        return "success";

    }

    @RequestMapping("/delStudent")
    public String delStudent(Integer id){

        studentService.delStudent(id);

        return "success";

    }

    @RequestMapping("/updateStudent")
    public String updateStudent(Integer id) {
        studentService.updateStudent(id);
        return "success";
    }

    @RequestMapping("/queryStudent")
    @ResponseBody
    public Student queryStudent(String sno){ //如果前后形参不一致，括号里可以加@RequestParam(value = "xxxx",required = false)
        Student student=studentService.queryStudent(sno);
        return student;
    }
}
