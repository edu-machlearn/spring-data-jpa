package com.biswa.student;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.biswa.entity.Student;

import jakarta.transaction.Transactional;

@Transactional
@RestController
@RequestMapping("/v1")
public class StudentController {

	@Autowired
	StudentDao dao;
	
	@PostMapping("/save")
	private Student saveData(@RequestBody Student student) {
		dao.save(student);
		return student;
	}
	
	@GetMapping("/getByMobile/{mobile}")
	public List<Student> getStudentListByMobile(@PathVariable String mobile) {
		return dao.getStudentListByMobile(mobile);
	}
	
	@PutMapping("/updateStudentMail/{mail}/{id}")
	private int updateStudentMail(@PathVariable String mail, @PathVariable Long id) {
		return dao.updateStudentMail(mail,id);
	}
	
	@GetMapping("/getAllStudent")
	public List<Student> getAllStudent() {
		return dao.getStudentList();
	}
	
	@GetMapping("/getStudentsById/{id}")
	public List<Student> getStudentsById(@PathVariable Long id) {
		return dao.getStudentsById(id);
	}
}
