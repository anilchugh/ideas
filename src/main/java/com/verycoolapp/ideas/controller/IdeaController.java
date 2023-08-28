package com.verycoolapp.ideas.controller;

import com.verycoolapp.ideas.model.Idea;
import com.verycoolapp.ideas.service.IdeaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/www.verycoolapp.com/idea")
public class IdeaController {

    @Autowired
    private IdeaService ideaService;

    @GetMapping("/list")
    public ResponseEntity<Iterable<Idea>> listIdeas() {
        Iterable<Idea> ideas = ideaService.listIdeas();
        if (ideas.iterator().hasNext()) {
            return new ResponseEntity(ideaService.listIdeas(), HttpStatus.OK);
        }
        return new ResponseEntity(HttpStatus.NO_CONTENT);
    }

    @PostMapping("/add")
    public ResponseEntity<Idea> addIdea(@RequestBody Idea idea) {
        Idea ideaToSave = new Idea();
        ideaToSave.setName(idea.getName());
        ideaToSave.setDescription(idea.getDescription());
        return new ResponseEntity(ideaService.saveIdea(ideaToSave), HttpStatus.OK);
    }

}
