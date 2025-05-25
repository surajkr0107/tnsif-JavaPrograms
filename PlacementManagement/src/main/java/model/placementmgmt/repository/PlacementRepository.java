package model.placementmgmt.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import model.placementmgmt.entity.Placement;

public interface PlacementRepository extends JpaRepository<Placement, Long> {}
