package com.ganeshit.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Data
public class Student {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer stutId;
	@Column(name= "Student_FirstName")
	private String stuFirstName;
	@Column(name = "Student_LastName")
	private String stuLastName;
	@Column(name = "Student_School_Name")
	private String stuSchoolName;
	@Column(name = "Student_Address")
	private String stuAddress;
	
	

}
