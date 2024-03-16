package com.api.collageapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.api.collageapi.binding.Course;
import java.io.Serializable;

@Repository
public interface CourseRepository extends JpaRepository<Course, Serializable> {

}
