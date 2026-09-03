package com.pranav.controller;

import org.springframework.stereotype.Controller;
import com.pranav.service.ICourseService;
import org.springframework.ui.Model;
import com.pranav.entity.Course;
import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.beans.factory.annotation.Autowired;


@Controller
public class CourseController 
{
	private ICourseService service;
    
	@Autowired
	public void setCourseService(ICourseService courseService) {
		this.service = courseService;
	}
	
	// == list all courses == 
	 @GetMapping("/courselist")
     public String getAllCourses(Model model)
	 {
    	 List<Course> courses = service.getAllCourses();
	     model.addAttribute("courses", courses);
	     courses.forEach(c->System.out.println(c));
	     return "CourseList";
	 }
     @GetMapping("/showCourseForm")
     public String ShowForm(@ModelAttribute("course") Course course)
	 {
		 return "CourseForm";
	 }
     
     // == Update Form ==
     @GetMapping("/updateCourseForm")
     public String updateForm(@ModelAttribute("course") Course course)
     {
    	 return "CourseForm";
     }
     //== register course ==
     @PostMapping("/registerCourse")
     public String registerCourse(@ModelAttribute("course") Course course)
	 {
		 service.RegisterCourse(course);
		 return "redirect:/courselist";
	 }
     
	 //== delete course ==
	 @GetMapping("/deleteCourse")
	 public String deleteCourse(@RequestParam("id") Integer id)
	 {
		 service.deleteCourseById(id);
		 return "redirect:/courselist";
	 }
     
	
	
	

}
