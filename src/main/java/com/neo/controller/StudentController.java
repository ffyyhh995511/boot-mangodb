package com.neo.controller;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.neo.entity.Student;
import com.neo.service.StudentService;

/**
 * 测试mongodb 函数相关 eg:sum、avg、order、group、distinct、max、min、
 * 
 * @author:fangyunhe
 * @time:2018年4月20日 下午2:52:00
 * @version 1.0
 */
@RestController
@RequestMapping("/user")
public class StudentController {
	
	@Resource
	private StudentService studentService; 
	
	@RequestMapping("/mock")
	public Object mockData() {
		List<Student> list = new ArrayList<Student>();
		Student a = new Student();
		a.setId("1");
		a.setGrade(100D);
		a.setName("fyh");
		a.setCourse("A");
		
		Student b = new Student();
		b.setId("2");
		b.setGrade(90D);
		b.setName("fyh");
		b.setCourse("B");
		
		Student c = new Student();
		c.setId("3");
		c.setGrade(80D);
		c.setName("fyh");
		c.setCourse("C");
		
		Student d = new Student();
		d.setId("4");
		d.setGrade(70D);
		d.setName("fyh");
		d.setCourse("C");
		
		list.add(a);
		list.add(b);
		list.add(c);
		list.add(d);
		
		studentService.addList(list);;
		return true;
	}
	
	/**
	 * 测试sum 合计分数
	 * @return
	 */
	@RequestMapping("/sum")
	public Object sum(String studentId) {
		studentService.sumGrade(studentId);
		return null;
	}
}
