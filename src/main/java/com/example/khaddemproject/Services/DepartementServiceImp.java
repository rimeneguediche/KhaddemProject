package com.example.khaddemproject.Services;

import com.example.khaddemproject.Entites.Departement;
import com.example.khaddemproject.Repositorys.DepartementRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
@AllArgsConstructor
public class DepartementServiceImp implements IDepartementServices{

    DepartementRepository departementRepository;


    @Override
    public List<Departement> getAllDepartements() {
        return departementRepository.findAll();
    }


    @Override
    public Departement addDepartement(Departement d) {
        return departementRepository.save(d);
    }

    @Override
    public Departement updateDepartement(Departement d) {
        return departementRepository.save(d);
    }

    @Override
    public void deleteDepartement(Integer idDepart) {
        departementRepository.deleteById(idDepart);
    }

    @Override
    public Departement getDepartementById(Integer idDepart) {
        return departementRepository.findById(idDepart).orElse(null);
    }


}
