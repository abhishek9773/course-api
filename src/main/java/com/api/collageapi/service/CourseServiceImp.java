package com.api.collageapi.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.api.collageapi.binding.Course;
import com.api.collageapi.repository.CourseRepository;

@Service
public class CourseServiceImp implements CourseService {

  @Autowired
  private CourseRepository courseRepo;

  @Override
  public String upSert(Course course) {
    courseRepo.save(course); // upsert (insert / update based on primary key);
    return "Success";
  }

  @Override
  public Course getById(Integer id) {
    Optional<Course> findById = courseRepo.findById(id); // optional is container;

    if (findById.isPresent()) {
      return findById.get();
    }
    return null;
  }

  @Override
  public String deleteById(Integer id) {
    if (courseRepo.existsById(id)) {
      courseRepo.deleteById(id);
      return "Delete is Success";
    }
    return "no Record found";
  }

  @Override
  public List<Course> getAllCourses() {
    return courseRepo.findAll();
  }
}
