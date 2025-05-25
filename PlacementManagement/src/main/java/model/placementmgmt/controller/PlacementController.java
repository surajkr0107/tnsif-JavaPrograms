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

import model.placementmgmt.entity.Placement;
import model.placementmgmt.service.PlacementService;

@RestController
@RequestMapping("/api/placements")
public class PlacementController {
    private final PlacementService service;

    public PlacementController(PlacementService service) {
        this.service = service;
    }

    @GetMapping
    public List<Placement> getAll() {
        return service.getAll();
    }

    @GetMapping("/{id}")
    public Placement getById(@PathVariable Long id) {
        return service.getById(id).orElse(null);
    }

    @PostMapping
    public Placement create(@RequestBody Placement placement) {
        return service.save(placement);
    }

    @PutMapping("/{id}")
    public Placement update(@PathVariable Long id, @RequestBody Placement placement) {
        placement.setId(id);
        return service.save(placement);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        service.delete(id);
    }
}

