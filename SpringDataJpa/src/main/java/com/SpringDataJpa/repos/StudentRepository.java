package com.SpringDataJpa.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.SpringDataJpa.entities.Student;

public interface StudentRepository extends JpaRepository<Student, Long> {

}
