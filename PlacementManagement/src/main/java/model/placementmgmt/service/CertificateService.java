package model.placementmgmt.service;


import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import model.placementmgmt.entity.Certificate;
import model.placementmgmt.repository.CertificateRepository;

@Service
public class CertificateService {
    private final CertificateRepository repo;

    public CertificateService(CertificateRepository repo) {
        this.repo = repo;
    }

    public List<Certificate> getAll() {
        return repo.findAll();
    }

    public Optional<Certificate> getById(Long id) {
        return repo.findById(id);
    }

    public Certificate save(Certificate certificate) {
        return repo.save(certificate);
    }

    public void delete(Long id) {
        repo.deleteById(id);
    }
}
