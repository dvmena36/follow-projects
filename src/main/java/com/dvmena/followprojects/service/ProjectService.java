package com.dvmena.followprojects.service;

import com.dvmena.followprojects.model.Project;
import com.dvmena.followprojects.repository.ProjectsRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;


import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class ProjectService {
    private final ProjectsRepository projectsRepository;
    public Project add(Project project){
        return projectsRepository.save(project);
    }

    public List<Project> getAll(){
        return projectsRepository.findAll();
    }

    public Project getOne(long id){
        Optional<Project> project = projectsRepository.findById(id);
        return project.get();
    }
    public void delete(long id){
        projectsRepository.deleteById(id);
    }
}
