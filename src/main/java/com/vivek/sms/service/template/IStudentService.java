package com.vivek.sms.service.template;

import com.vivek.sms.dao.entity.StudentEntity;
import org.springframework.stereotype.Service;

import java.util.List;

public interface IStudentService {
    List<StudentEntity> getAllStudents();

    StudentEntity saveStudent(StudentEntity studentEntity);

    StudentEntity getStudentById (Long id);

    void deleteById(Long id);

}
