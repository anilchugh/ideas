package com.verycoolapp.ideas.service;

import com.verycoolapp.ideas.model.Idea;
import com.verycoolapp.ideas.repository.IdeaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class IdeaService {

    @Autowired
    private IdeaRepository ideaRepository = null;

    public Idea saveIdea(Idea idea) {
        ideaRepository.save(idea);
        return idea;
    }

    public Iterable<Idea> listIdeas() {
        return ideaRepository.findAll();
    }

}
