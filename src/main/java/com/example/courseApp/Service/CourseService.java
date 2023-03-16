package com.example.courseApp.Service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.courseApp.Dao.CourseDao;
import com.example.courseApp.model.Course;
import com.example.courseApp.model.CourseDTO;


@Service
public class CourseService {
	@Autowired
	private CourseDao courseDao;
	
	public void saveCourse(CourseDTO courseDTO) {
		Course course = new Course(courseDTO.getCourseId(),courseDTO.getCourseName(),courseDTO.getFee(),courseDTO.getDuration());
		courseDao.saveCourse(course);

	}

	public CourseDTO getCourseById(Integer id) {
		Course course = courseDao.getCourseById(id);
		CourseDTO courseDto = new CourseDTO(course.getCourseId(),course.getCourseName(),course.getFee(),course.getDuration());
		return courseDto ;
	}
	
	public void deleteCourse(Integer id) {
		courseDao.deleteCourse(id);
	}

	public CourseDTO getCourseByName(String name)  {
		Course course = courseDao.getCourseByName(name);
		CourseDTO courseDto = new CourseDTO(course.getCourseId(),course.getCourseName(),course.getFee(),course.getDuration());
		return courseDto;
	}

	public List<CourseDTO> getAllCourses() {
		List<Course> courses = courseDao.getAllCourses();
		List<CourseDTO> courseList = new ArrayList<CourseDTO>();
		for(Course course : courses) {
			CourseDTO courseDto = new CourseDTO(course.getCourseId(),course.getCourseName(),course.getFee(),course.getDuration());
			courseList.add(courseDto);
		}
		return courseList;
	}

	public Integer generateId() {
	Integer id= courseDao.getMaxCourseId();
	if(id==null)
		id=1000;
	return ++id;
}
}
	
