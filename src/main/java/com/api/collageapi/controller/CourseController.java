package com.api.collageapi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;
import com.api.collageapi.binding.Course;
import com.api.collageapi.service.CourseService;

@RestController
public class CourseController {
  @Autowired
  private CourseService courseService;

  @PostMapping("/course")
  public ResponseEntity<String> createCourse(@RequestBody Course course) {
    String status = courseService.upSert(course);
    return new ResponseEntity<>(status, HttpStatus.CREATED);

  }

  @GetMapping("/course/{id}")
  public ResponseEntity<Course> getCourse(@PathVariable Integer id) {
    Course course = courseService.getById(id);
    return new ResponseEntity<>(course, HttpStatus.OK);
  }

  @GetMapping("/all-courses")
  public ResponseEntity<List<Course>> getAllCourse() {
    List<Course> allCourse = courseService.getAllCourses();
    return new ResponseEntity<>(allCourse, HttpStatus.OK);
  }

  @PutMapping("/course")
  public ResponseEntity<String> updateCourse(@RequestBody Course course) {
    String status = courseService.upSert(course);
    return new ResponseEntity<>(status, HttpStatus.OK);

  }

  @DeleteMapping("/course/{id}")
  public ResponseEntity<String> deleteCourse(@PathVariable Integer id) {
    String status = courseService.deleteById(id);
    return new ResponseEntity<>(status, HttpStatus.OK);
  }

}