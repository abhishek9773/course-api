package com.api.collageapi.service;

import com.api.collageapi.binding.Course;
import java.util.List;

public interface CourseService {

  public String upSert(Course course); // if single method is perform both update and insert it calle as upSert()
                                       // method.

  public Course getById(Integer id);

  public String deleteById(Integer id);

  public List<Course> getAllCourses();

}
