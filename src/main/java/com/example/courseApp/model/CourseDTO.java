package com.example.courseApp.model;


public class CourseDTO {
	// used for db access

		private Integer courseId;
		private String courseName;
		private Double fee;
		private Integer duration;
		public CourseDTO() {
			super();
			// TODO Auto-generated constructor stub
		}
		public CourseDTO(Integer courseId, String courseName, Double fee, Integer duration) {
			super();
			this.courseId = courseId;
			this.courseName = courseName;
			this.fee = fee;
			this.duration = duration;
		}
		
		public CourseDTO(Integer courseId) {
			super();
			this.courseId = courseId;
			this.courseName = "  ";
			this.fee = 1.0;
			this.duration = 1;
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
