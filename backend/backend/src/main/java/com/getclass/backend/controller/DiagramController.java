package com.getclass.backend.controller;

import com.getclass.backend.model.Diagram;
import com.getclass.backend.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/diagrams")
@CrossOrigin(origins = "http://localhost:3000") // Pour autoriser les requêtes depuis React
public class DiagramController {

    @Autowired
    private DiagramService diagramService;

    @GetMapping
    public List<Diagram> getAllDiagrams() {
        return diagramService.getAllDiagrams();
    }

    @GetMapping("/{id}")
    public Optional<Diagram> getDiagramById(@PathVariable Long id) {
        return diagramService.getDiagramById(id);
    }

    @PostMapping
    public Diagram createDiagram(@RequestBody Diagram diagram) {
        return diagramService.saveDiagram(diagram);
    }

    @DeleteMapping("/{id}")
    public void deleteDiagram(@PathVariable Long id) {
        diagramService.deleteDiagram(id);
    }
}
