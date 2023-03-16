package com.example.courseApp.Controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;
import com.example.courseApp.Service.CourseService;
import com.example.courseApp.model.CourseDTO;

@RestController
public class CourseController {
	
	@Autowired
	private CourseService service;
	
	@GetMapping("index")
	public ModelAndView openHomePage() {
		List<CourseDTO> courseList=service.getAllCourses();
		ModelAndView mv= new ModelAndView("homePage");
		mv.addObject("courseList",courseList);
				return mv;
	}
	
	@GetMapping("course")
	public ModelAndView openCourseEntryPage() {
		int newId=service.generateId();
		CourseDTO courseDTO=new CourseDTO(newId);
		ModelAndView mv= new ModelAndView("courseEntryPage");
		mv.addObject("courseRecord", courseDTO);
		return mv;
	}
	
	 @PostMapping("course")
	 	public ModelAndView saveCourse(@ModelAttribute("courseRecord") CourseDTO courseDTO) {
	 	System.out.println(courseDTO.getCourseId());
		 service.saveCourse(courseDTO);
	 		ModelAndView mv=new ModelAndView("redirect:/index;");
	 		return mv;
}
	 @GetMapping("delete_course/{id}")
		public ModelAndView deleteCourse(@PathVariable int id) {
	 		service.deleteCourse(id);
	 		ModelAndView mv=new ModelAndView("redirect:/index;");
	 		return mv;
	 }
	 
	/*
	 *  @GetMapping("edit_course/{id}")
	 public ModelAndView openCourseEditPage(@PathVariable int id) {
		 CourseDTO courseDTO=service.getCourseById(id);
		 ModelAndView mv= new ModelAndView("courseEditPage");
		 mv.addObject("courseRecord",courseDTO);
		 return mv;
	 }
	 
	 @PostMapping("edit_course")
	 	public ModelAndView editCourse(@ModelAttribute("courseRecord") CourseDTO courseDTO) {
		 service.saveCourse(courseDTO);
	 		ModelAndView mv=new ModelAndView("redirect:/index;");
	 		return mv;
	 } */
	 
	 @GetMapping("edit_course/{id}")
	 public ModelAndView openCourseEditPage(@PathVariable int id) {
		 CourseDTO courseDTO=service.getCourseById(id);
		 ModelAndView mv= new ModelAndView("courseEditPage");
		 mv.addObject("courseRecord",courseDTO);
		 return mv;
	 }
     
     @PostMapping("edit_course/course_edit")
 	public ModelAndView editCourse(@ModelAttribute("courseRecord") CourseDTO courseDto) {
 		service.saveCourse(courseDto);
 		ModelAndView mv = new ModelAndView("redirect:/index");
 		return mv;
 	}
  /*   @GetMapping("showjson")
  	public List<CourseDTO> displayInJson() {
  		List<CourseDTO> courseList = service.getAllCourses();
  		return courseList;
  	}  */
     @GetMapping(value="showjson",produces =MediaType.APPLICATION_JSON_VALUE)
 	public List<CourseDTO> displayInJson() {
 		List<CourseDTO> courseList = service.getAllCourses();
 		return courseList;
 	}
     
     @GetMapping(value="showxml",produces =MediaType.APPLICATION_XML_VALUE)
  	public List<CourseDTO> displayInXml() {
  		List<CourseDTO> courseList = service.getAllCourses(); 		
  		return courseList;
  	}
     @PostMapping(value ="/accept" , consumes={MediaType.APPLICATION_JSON_VALUE,MediaType.APPLICATION_XML_VALUE} )
     public String insertCourse(@RequestBody CourseDTO courseDTO) {
    	 service.saveCourse(courseDTO);
    	 return "One Course added";
     }
     @GetMapping(value="/show/{name}",produces = MediaType.APPLICATION_JSON_VALUE)
  	public CourseDTO displayCourse(@PathVariable String name) {
  		CourseDTO courseList = service.getCourseByName(name);
  		return courseList;
  	}
     @GetMapping(value="/showx/{name}",produces = MediaType.APPLICATION_XML_VALUE)
   	public CourseDTO displayCourseX(@PathVariable String name) {
   		CourseDTO courseList = service.getCourseByName(name);
   		return courseList;
   	}
     
} // end of class