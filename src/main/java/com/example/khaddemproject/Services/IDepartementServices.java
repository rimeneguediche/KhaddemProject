package com.example.khaddemproject.Services;


import com.example.khaddemproject.Entites.Departement;

import java.util.List;

public interface IDepartementServices {
    List<Departement> getAllDepartements();

    Departement addDepartement (Departement d);

    Departement updateDepartement (Departement d);

    void deleteDepartement (Integer idDepart);

    Departement getDepartementById(Integer idDepart);




}
