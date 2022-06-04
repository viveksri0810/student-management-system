package com.vivek.sms.controller;


import com.vivek.sms.dao.entity.StudentEntity;
import com.vivek.sms.dao.repository.IStudentRepository;
import com.vivek.sms.service.impl.StudentServiceImpl;
import com.vivek.sms.service.template.IStudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@Controller
//@RestController
public class StudentController {

    @Autowired
    private IStudentService studentService;

    @GetMapping("/students")
    public String listStudent(Model model){
        model.addAttribute("students",studentService.getAllStudents());
        return "students1";
    }

    @GetMapping("/student/new")
    public String createStudentForm(Model model){

        //create student object to hold student form data
        StudentEntity studentEntity=new StudentEntity();
        model.addAttribute("create_student",studentEntity);
        return "create_student1";
    }

    @PostMapping("/saveStudent")
    public String saveStudents(@ModelAttribute ("create_student3") StudentEntity studentEntity3){
        studentService.saveStudent(studentEntity3);
        return "redirect:/students";
    }

    @GetMapping("/student/edit/{id}")
    public String editStudentForm(@PathVariable Long id,Model model){
         model.addAttribute("student",studentService.getStudentById(id));
         return "edit_student";
    }

    @PostMapping("/updateStudent/{id}")
    public String updateStudent (@PathVariable Long id, @ModelAttribute("update_student3") StudentEntity studentEntity){

        //get student from database by id
        StudentEntity existingStudent=studentService.getStudentById(id);
        System.out.println(studentEntity);
        System.out.println(existingStudent);


        if(studentEntity.getEmail()!=null && !studentEntity.getFirstName().isEmpty()  ){
            existingStudent.setFirstName(studentEntity.getFirstName());
        }
        if(studentEntity.getEmail()!=null && !studentEntity.getLastName().isEmpty()  ){
            existingStudent.setLastName(studentEntity.getLastName());
        }
        if(studentEntity.getEmail()!=null && !studentEntity.getEmail().isEmpty()  ){
            existingStudent.setEmail(studentEntity.getEmail());
        }

        //save updated student object

        studentService.saveStudent(existingStudent);

        return "redirect:/students";
    }


    @GetMapping("/student/delete/{id}")
    public String deleteById(@PathVariable Long id){
        studentService.deleteById(id);
        return "redirect:/students";
    }
}
