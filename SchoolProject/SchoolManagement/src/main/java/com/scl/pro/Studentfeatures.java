package com.scl.pro;

import java.util.List;

public interface Studentfeatures {
int  AddStudent(Student stu);
int UpdateStudent(Student stu);
void DeleteStudent(int sid);
List<Student> GetAllStudent();

}
