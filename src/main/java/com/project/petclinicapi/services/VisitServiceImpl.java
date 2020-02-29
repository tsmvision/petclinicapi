package com.project.petclinicapi.services;

import com.project.petclinicapi.controllerResultJson.VisitJson;
import com.project.petclinicapi.model.Visit;
import com.project.petclinicapi.repositories.VisitRepository;
import org.springframework.stereotype.Service;

import java.util.*;

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

    @Override
    public VisitJson findByIdWithPetId(Integer id) {
        return convertVetIntoVetJson(findById(id));
    }

    public List<Visit> findAll() {
        Iterable<Visit> visits = visitRepository.findAll();
        List<Visit> result = new ArrayList<>();

        for (Visit visit : visits) {
            result.add(visit);
        }

        return result;
    }

    @Override
    public Set<VisitJson> findAllWithPetIds() {
        Iterable<Visit> visits = visitRepository.findAll();
        Set<VisitJson> result = new HashSet<>();

        for (Visit visit : visits) {
            result.add(convertVetIntoVetJson(visit));
        }

        return result;
    }

    public VisitJson convertVetIntoVetJson(Visit visit) {
        VisitJson visitJson = new VisitJson();
        if (visit != null) {
            visitJson.setId(visit.getId());
            visitJson.setVisitDate(visit.getVisitDate());
            visitJson.setDescription(visit.getDescription());
            visitJson.setPetId(visit.getPet().getId());
        }
        return visitJson;
    }

    public void save(Visit visit) {
        visitRepository.save(visit);
    }
}
