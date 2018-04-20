package com.neo.service;

import java.util.List;

import com.neo.entity.Student;

public interface StudentService {

	void addList(List<Student> list);

	void sumGrade(String studentId);

}
