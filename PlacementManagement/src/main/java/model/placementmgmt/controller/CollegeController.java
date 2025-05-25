package model.placementmgmt.controller;


import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import model.placementmgmt.entity.College;
import model.placementmgmt.service.CollegeService;

@RestController
@RequestMapping("/api/colleges")
public class CollegeController {
    private final CollegeService service;

    public CollegeController(CollegeService service) {
        this.service = service;
    }

    @GetMapping
    public List<College> getAll() {
        return service.getAll();
    }

    @GetMapping("/{id}")
    public College getById(@PathVariable Long id) {
        return service.getById(id).orElse(null);
    }

    @PostMapping
    public College create(@RequestBody College college) {
        return service.save(college);
    }

    @PutMapping("/{id}")
    public College update(@PathVariable Long id, @RequestBody College college) {
        college.setId(id);
        return service.save(college);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        service.delete(id);
    }
}

