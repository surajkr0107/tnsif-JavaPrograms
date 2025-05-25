package model.placementmgmt.service;


import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import model.placementmgmt.entity.Placement;
import model.placementmgmt.repository.PlacementRepository;

@Service
public class PlacementService {
    private final PlacementRepository repo;

    public PlacementService(PlacementRepository repo) {
        this.repo = repo;
    }

    public List<Placement> getAll() {
        return repo.findAll();
    }

    public Optional<Placement> getById(Long id) {
        return repo.findById(id);
    }

    public Placement save(Placement placement) {
        return repo.save(placement);
    }

    public void delete(Long id) {
        repo.deleteById(id);
    }
}
