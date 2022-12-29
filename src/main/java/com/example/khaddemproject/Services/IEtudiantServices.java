package com.example.khaddemproject.Services;


import com.example.khaddemproject.Entites.Etudiant;

import java.util.List;
import java.util.Set;

public interface IEtudiantServices {


    List<Etudiant> getALLEtudiant();

    Etudiant addEtudiant(Etudiant e);

    Etudiant updateEtudiant(Etudiant e);

    void deleteETudiant(Long id);

    Etudiant getEtudiantById(Long id);

    Etudiant assignEtudiantToDepartement(Long idEtudiant, Integer idDepartement);

    Etudiant addAndAssignEtudiantToEquipeAndContract(Etudiant e, Integer idContrat,Integer idEquipe);

    List<Etudiant> getEtudiantByDepartement(Integer idDepartement);

}
