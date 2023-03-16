package com.example.courseApp.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Course {
	
	@Id
		private Integer courseId;
		private String courseName;
		private Double fee;
		private Integer duration;
		public Course() {
			super();
			// TODO Auto-generated constructor stub
		}
		public Course(Integer courseId, String courseName, Double fee, Integer duration) {
			super();
			this.courseId = courseId;
			this.courseName = courseName;
			this.fee = fee;
			this.duration = duration;
		}
		public Integer getCourseId() {
			return courseId;
		}
		public void setCourseId(Integer courseId) {
			this.courseId = courseId;
		}
		public String getCourseName() {
			return courseName;
		}
		public void setCourseName(String courseName) {
			this.courseName = courseName;
		}
		public Double getFee() {
			return fee;
		}
		public void setFee(Double fee) {
			this.fee = fee;
		}
		public Integer getDuration() {
			return duration;
		}
		public void setDuration(Integer duration) {
			this.duration = duration;
		}
		
		
		


}
