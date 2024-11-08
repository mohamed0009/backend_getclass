package com.getclass.backend.service;

import com.getclass.backend.model.Diagram;
import com.getclass.backend.repository.DiagramRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DiagramService {

    @Autowired
    private DiagramRepository diagramRepository;

    public List<Diagram> getAllDiagrams() {
        return diagramRepository.findAll();
    }

    public Optional<Diagram> getDiagramById(Long id) {
        return diagramRepository.findById(id);
    }

    public Diagram saveDiagram(Diagram diagram) {
        return diagramRepository.save(diagram);
    }

    public void deleteDiagram(Long id) {
        diagramRepository.deleteById(id);
    }
}
