package com.biswa.student;

import java.util.List;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.biswa.entity.Student;

import jakarta.transaction.Transactional;

@Transactional
public interface StudentDao extends CrudRepository<Student, Long> {

	@Query(name = "select s from Student s where s.mobile:mobile")
	List<Student> getStudentListByMobile(@Param("mobile") String mobile);
	
	@Modifying
	@Query("update Student s set s.mail = :mail where s.id = :id")
	int updateStudentMail(@Param("mail") String mail, @Param("id") Long id);
	
	@Procedure(name ="Student.getStudents")
	List<Student> getStudentList();

	@Procedure(name ="Student.getStudentsById")
	List<Student> getStudentsById(Long id);
}
