package com.example.khaddemproject.Services;

import com.example.khaddemproject.Entites.Departement;
import com.example.khaddemproject.Entites.University;
import com.example.khaddemproject.Repositorys.DepartementRepository;
import com.example.khaddemproject.Repositorys.UniversityRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
@AllArgsConstructor
public class UniversiteServiceImp implements IUniversiteServices{
    UniversityRepository universiteRepository;
    DepartementRepository departementRepository;

    @Override
    public List<University> getAllUniversites() {
        return universiteRepository.findAll();
    }

    @Override
    public University addUniversite(University u) {
        return universiteRepository.save(u);
    }

    @Override
    public University updateUniversite(University u) {
        return universiteRepository.save(u);
    }

    @Override
    public void deleteUniversite(Integer idUniversite) {
        universiteRepository.deleteById(idUniversite);
    }

    @Override
    public University getUniversite(Integer idUniversite) {
        return universiteRepository.findById(idUniversite).orElse(null);
    }


    @Override
    public void assignUniversiteToDepartement(Integer idDepartement, Integer idUniversite) {
        University universite = universiteRepository.findById(idUniversite).orElse(null);
        Departement departement = departementRepository.findById(idDepartement).orElse(null);
        universite.getDepartements().add(departement);
        universiteRepository.save(universite);
    }


}
