package com.example.courseApp.Dao;

import java.util.List;

import com.example.courseApp.model.Course;

public interface CourseDao {
	
	 public void saveCourse(Course course);
	  public Course getCourseById(Integer id);
	  public Course getCourseByName(String name);
	  public List<Course> getAllCourses();
	  public Integer getMaxCourseId();
	  public void deleteCourse(Integer id);

}
