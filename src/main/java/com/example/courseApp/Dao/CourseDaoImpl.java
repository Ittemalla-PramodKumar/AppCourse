package com.example.courseApp.Dao;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import com.example.courseApp.model.Course;

@Service
@Repository
public class CourseDaoImpl implements CourseDao {

	@Autowired
	private CourseRepository repository;
	
	@Override
	public void saveCourse(Course course) {
		repository.save(course);

	}
	@Override
	public void deleteCourse(Integer id) {
	repository.deleteById(id);
		
	}
	@Override
	public Course getCourseById(Integer id) {
		return repository.getById(id);
	}

	@Override
	public List<Course> getAllCourses() {	
		return repository.findAll();
	}
	@Override
	public Course getCourseByName(String name) {
		// TODO Auto-generated method stub
		return repository.findByCourseName(name);
	}

	@Override
	public Integer getMaxCourseId() {
		Integer id=repository.getMaxCourseId();
		return id;
	}

}
