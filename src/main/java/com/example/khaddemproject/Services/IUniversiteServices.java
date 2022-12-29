package com.example.khaddemproject.Services;


import com.example.khaddemproject.Entites.University;

import java.util.List;

public interface IUniversiteServices {

    List<University> getAllUniversites();

    University addUniversite (University u);

    University updateUniversite (University u);

    void deleteUniversite(Integer idUniversite);

    University getUniversite (Integer idUniversite);

    void assignUniversiteToDepartement(Integer idDepartement,Integer idUniversite);


     University addOrUpdateUniversite (University u) ;


}

