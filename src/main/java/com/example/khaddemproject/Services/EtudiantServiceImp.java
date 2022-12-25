package com.example.khaddemproject.Services;

import com.example.khaddemproject.Entites.Departement;
import com.example.khaddemproject.Entites.Etudiant;
import com.example.khaddemproject.Repositorys.DepartementRepository;
import com.example.khaddemproject.Repositorys.EtudiantRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;


@AllArgsConstructor
@Service

public class EtudiantServiceImp implements  IEtudiantServices {

    EtudiantRepository etudiantRepository ;
    DepartementRepository departementRepository;
    @Override
    public List<Etudiant> getALLEtudiant() {
        return etudiantRepository.findAll();
    }

    @Override
    public Etudiant addEtudiant(Etudiant e) {
        return etudiantRepository.save(e);
    }

    @Override
    public Etudiant updateEtudiant(Etudiant e) {
        return etudiantRepository.save(e);
    }

    @Override
    public void deleteETudiant(Long id) {
        etudiantRepository.deleteById(id);
        System.out.println("deleted successfuly");
    }

    @Override
    public Etudiant getEtudiantById(Long id) {
        return etudiantRepository.findById(id).orElse(null);
    }

    @Override
    public void assignEtudiantToDepartement(Long idEtudiant, Integer idDepartement) {
        Etudiant etudiant = etudiantRepository.findById(idEtudiant).orElse(null);
        Departement departement = departementRepository.findById(idDepartement).orElse(null);
        etudiant.setDepartement(departement);
        etudiantRepository.save(etudiant);
    }

}