package com.coinsource.simpleservice.controller;

import com.coinsource.simpleservice.model.Student;
import java.util.ArrayList;
import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController
{
    @GetMapping("/name")
    public String getControllerName()
    {
        return "Hello! this is StudenController";
    }

    @GetMapping("/students/{student_id}")
    public Student getStudentById(@PathVariable("student_id") Integer studentId)
    {
        return new Student(1, "Chathuranga", "Bsc", "Sri Lanka");
    }


    @GetMapping("/courses/{course_id}/students")
    public List<Student> getStudentsByCourses(@PathVariable("course_id") Integer courseId)
    {
        List<Student> studentList = new ArrayList<>();

        studentList.add(new Student(1, "Chathuranga", "Bsc", "Sri Lanka"));
        studentList.add(new Student(2, "Darshana", "Sun Certified", "Sri Lanka"));
        return studentList;
    }


    @GetMapping("/departments/{department_id}/courses/{course_id}/students")
    public List<Student> getStudentsByDepartmentCourses(
            @PathVariable("department_id") Integer departmentId,
            @PathVariable("course_id") Integer courseId) {
        List<Student> studentList = new ArrayList<>();

        studentList.add(new Student(1, "Chathuranga", "Bsc", "Sri Lanka"));
        studentList.add(new Student(2, "Darshana", "Sun Certified", "Sri Lanka"));
        studentList.add(new Student(3, "Tennakoon", "Zend Certified", "Sri Lanka"));
        return studentList;
    }
}