package com.example.courseApp.Dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import com.example.courseApp.model.Course;

@Repository
public interface CourseRepository extends JpaRepository<Course, Integer> {

	@Query("FROM Course WHERE courseName=?1")
	public Course findByCourseName(String name);
	
	@Query("select max(courseId) from Course")
	public Integer getMaxCourseId();

	
}
