package com.neo.entity;

import org.springframework.data.annotation.Id;

/**
 * 
 * @Description:TODO
 * @author:fangyunhe
 * @time:2018年4月20日 下午2:51:45
 * @version 1.0
 */
public class Student {
	
	/**
	 * @id这个注解来对应mongo的_id这个字段
	 */
	@Id
    private String _id;
	
	private String id;
	
	private Double grade;
	
	private String name;
	
	private String course;
	
	private String age;
	
	private String sex;
	
	private String teacher;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Double getGrade() {
		return grade;
	}

	public void setGrade(Double grade) {
		this.grade = grade;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public String getTeacher() {
		return teacher;
	}

	public void setTeacher(String teacher) {
		this.teacher = teacher;
	}

}
