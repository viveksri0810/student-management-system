package com.vivek.sms.service.impl;

import com.vivek.sms.dao.entity.StudentEntity;
import com.vivek.sms.dao.repository.IStudentRepository;
import com.vivek.sms.service.template.IStudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements IStudentService {

    @Autowired
    private IStudentRepository studentRepository;

    @Override
    public List<StudentEntity> getAllStudents(){
        return studentRepository.findAll();
    }

    @Override
    public StudentEntity saveStudent(StudentEntity studentEntity){
        return studentRepository.save(studentEntity);
    }

    @Override
    public StudentEntity getStudentById(Long id) {
        return studentRepository.findById(id).get();
    }

    @Override
    public void deleteById(Long id){
        studentRepository.deleteById(id);
    }
}
