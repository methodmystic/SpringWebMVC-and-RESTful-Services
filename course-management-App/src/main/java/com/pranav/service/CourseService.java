package com.pranav.service;
import org.springframework.beans.factory.annotation.Autowired;
import com.pranav.repository.ICourserepo;
import org.springframework.stereotype.Service;
import com.pranav.entity.Course;
import java.util.List;



@Service
public class CourseService implements ICourseService
{
	@Autowired
	private ICourserepo repo;

	public void setRepo(ICourserepo repo) {
		this.repo = repo;
	}
	
    @Override
	public List<Course> getAllCourses()
	{
	    return (List<Course>) repo.findAll();
	}
	
    @Override
	public void RegisterCourse(Course course)
	{
		repo.save(course);
	}
	
   
    @Override
	public void deleteCourseById(Integer id)
	{
		repo.deleteById(id);
	}
	

	

}
