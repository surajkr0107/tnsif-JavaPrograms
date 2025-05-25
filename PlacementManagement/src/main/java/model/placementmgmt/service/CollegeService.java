package model.placementmgmt.service;


import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import model.placementmgmt.entity.College;
import model.placementmgmt.repository.CollegeRepository;

@Service
public class CollegeService {
    private final CollegeRepository repo;

    public CollegeService(CollegeRepository repo) {
        this.repo = repo;
    }

    public List<College> getAll() {
        return repo.findAll();
    }

    public Optional<College> getById(Long id) {
        return repo.findById(id);
    }

    public College save(College college) {
        return repo.save(college);
    }

    public void delete(Long id) {
        repo.deleteById(id);
    }
}
