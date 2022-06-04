package com.vivek.sms;

import com.vivek.sms.dao.entity.StudentEntity;
import com.vivek.sms.dao.repository.IStudentRepository;
import com.vivek.sms.service.impl.StudentServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class StudentManagementSystemApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(StudentManagementSystemApplication.class, args);
	}


	@Autowired
	private IStudentRepository studentRepository;

	@Override
	public void run(String... args) throws Exception {

//		StudentEntity student=new StudentEntity("Vivek","Srivastava","vivek.gmail.com");
//		studentRepository.save(student);
//
//		StudentEntity student1=new StudentEntity("Atul","Pandey","atul.gmail.com");
//		studentRepository.save(student1);
//
//		StudentEntity student2=new StudentEntity("Parmeshwar","Singh","parmeshwar.gmail.com");
//		studentRepository.save(student2);

	}


	}
