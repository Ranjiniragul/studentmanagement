package com.scl.pro;

import java.util.List;

public class Student {
private int sid;
private String stuname;
private int grade;
private String section;
private Long year;
private Long number;
private String email;
private String gender;
public String getGender() {
	return gender;
}
public void setGender(String gender) {
	this.gender = gender;
}
public int getSid() {
	return sid;
}
public void setSid(int sid) {
	this.sid = sid;
}
public String getStuname() {
	return stuname;
}
public void setStuname(String stuname) {
	this.stuname = stuname;
}
public int getGrade() {
	return grade;
}
public void setGrade(int grade) {
	this.grade = grade;
}
public String getSection() {
	return section;
}
public void setSection(String section) {
	this.section = section;
}
public Long getYear() {
	return year;
}
public void setYear(Long year) {
	this.year = year;
}
public Long getNumber() {
	return number;
}
public void setNumber(Long number) {
	this.number = number;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public Student() {
	
}
public Student(int sid) {
	this.sid=sid;
}
	

public Student(int sid, String stuname, int grade, String section, Long year, Long number, String email,String gender) {
	super();
	this.sid = sid;
	this.stuname = stuname;
	this.grade = grade;
	this.section = section;
	this.year = year;
	this.number = number;
	this.email = email;
	this.gender=gender;
}
public Student( String stuname, int grade, String section, Long year, Long number, String email,String gender,int sid) {
	super();
	this.stuname = stuname;
	this.grade = grade;
	this.section = section;
	this.year = year;
	this.number = number;
	this.email = email;
	this.gender=gender;
	this.sid = sid;

}

@Override
public String toString() {
	return "sid=" + sid + ", stuname=" + stuname + ", class=" + grade + ", section=" + section + ", year="
			+ year + ", number=" + number + ", email=" + email+"gender"+gender;
}

}
