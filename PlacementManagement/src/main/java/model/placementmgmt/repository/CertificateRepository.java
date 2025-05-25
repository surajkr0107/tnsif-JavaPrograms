package model.placementmgmt.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import model.placementmgmt.entity.Certificate;

public interface CertificateRepository extends JpaRepository<Certificate, Long> {}
