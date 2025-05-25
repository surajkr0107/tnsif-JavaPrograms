package model.placementmgmt.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import model.placementmgmt.entity.College;

public interface CollegeRepository extends JpaRepository<College, Long> {}
