package com.pranav.service;
import java.util.List;
import com.pranav.entity.Course;

public interface ICourseService
{
	
	public List<Course> getAllCourses();
	public void RegisterCourse(Course course);
	public void deleteCourseById(Integer id);
	

}
