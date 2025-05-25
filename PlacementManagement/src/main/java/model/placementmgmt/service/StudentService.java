package model.placementmgmt.service;


import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import model.placementmgmt.entity.Student;
import model.placementmgmt.repository.StudentRepository;

@Service
public class StudentService {
    private final StudentRepository repo;

    public StudentService(StudentRepository repo) {
        this.repo = repo;
    }

    public List<Student> getAll() {
        return repo.findAll();
    }

    public Optional<Student> getById(Long id) {
        return repo.findById(id);
    }

    public Student save(Student student) {
        return repo.save(student);
    }

    public void delete(Long id) {
        repo.deleteById(id);
    }
}
