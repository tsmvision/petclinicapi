package com.project.petclinicapi.services;

import com.project.petclinicapi.dto.visit.VisitDto;
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
    public VisitDto findByIdWithPetId(Integer id) {
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
    public Set<VisitDto> findAllWithPetIds() {
        Iterable<Visit> visits = visitRepository.findAll();
        Set<VisitDto> result = new HashSet<>();

        for (Visit visit : visits) {
            result.add(convertVetIntoVetJson(visit));
        }

        return result;
    }

    public VisitDto convertVetIntoVetJson(Visit visit) {
        VisitDto visitJson = new VisitDto();
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
