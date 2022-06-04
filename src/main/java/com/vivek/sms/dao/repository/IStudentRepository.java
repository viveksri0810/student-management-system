package com.vivek.sms.dao.repository;

import com.vivek.sms.dao.entity.StudentEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface IStudentRepository extends JpaRepository<StudentEntity,Long> {

}
