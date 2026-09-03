package com.pranav.repository;
import org.springframework.data.repository.CrudRepository;
import com.pranav.entity.Course;
public interface ICourserepo extends CrudRepository<Course, Integer>
{

}
