package model.placementmgmt.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import model.placementmgmt.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Long> {}
