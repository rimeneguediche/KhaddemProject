package com.example.khaddemproject.Services;


import com.example.khaddemproject.Entites.Etudiant;

import java.util.List;

public interface IEtudiantServices {


    List<Etudiant> getALLEtudiant();

    Etudiant addEtudiant(Etudiant e);

    Etudiant updateEtudiant(Etudiant e);

    void deleteETudiant(Long id);

    Etudiant getEtudiantById(Long id);

    void assignEtudiantToDepartement(Long idEtudiant, Integer idDepartement);

}
