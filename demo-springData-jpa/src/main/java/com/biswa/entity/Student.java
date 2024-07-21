package com.biswa.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.NamedStoredProcedureQueries;
import jakarta.persistence.NamedStoredProcedureQuery;
import jakarta.persistence.ParameterMode;
import jakarta.persistence.StoredProcedureParameter;
import lombok.Data;

@Data
@Entity
@NamedStoredProcedureQueries({
@NamedStoredProcedureQuery(
		name = "Student.getStudents",
		procedureName = "getStudents",
		resultClasses = Student.class
),
@NamedStoredProcedureQuery(
		name = "Student.getStudentsById",
		procedureName = "getStudentsById",
		resultClasses = Student.class,
		parameters = {
				@StoredProcedureParameter(name="id",type = Long.class,mode = ParameterMode.IN)
		}
)
})
public class Student {

	@Id
	@Column(name = "stu_id")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	private String name;
	
	private String mail;
	
	@Column(unique = true)
	private String mobile;
	
	private int status = 1;
	
}
