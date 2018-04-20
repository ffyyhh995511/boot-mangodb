package com.neo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.aggregation.AggregationResults;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.stereotype.Service;

import com.neo.entity.Student;
import com.neo.service.StudentService;

@Service
public class StudentServiceImpl implements StudentService{
	
	@Autowired
	private MongoTemplate mongoTemplate;

	@Override
	public void addList(List<Student> list) {
		mongoTemplate.insertAll(list);
	}

	@Override
	public void sumGrade(String studentId) {}
}
