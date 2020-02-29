package com.project.petclinicapi.services;

import com.project.petclinicapi.model.Visit;
import com.project.petclinicapi.repositories.VisitRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class VisitServiceImpl implements VisitService {

    VisitRepository visitRepository;

    public VisitServiceImpl(VisitRepository visitRepository) {
        this.visitRepository = visitRepository;
    }

    public Visit findById(Integer id) {
        Optional<Visit> visit = visitRepository.findById(id);
        return visit.orElseGet(Visit::new);
    }

    public List<Visit> findAll() {
        Iterable<Visit> visits = visitRepository.findAll();
        List<Visit> result = new ArrayList<>();

        for (Visit visit : visits) {
            result.add(visit);
        }

        return result;
    }

    public void save(Visit visit) {
        visitRepository.save(visit);
    }
}
