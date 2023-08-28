package com.verycoolapp.ideas.repository;

import com.verycoolapp.ideas.model.Idea;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IdeaRepository extends CrudRepository<Idea, Long> {
}
