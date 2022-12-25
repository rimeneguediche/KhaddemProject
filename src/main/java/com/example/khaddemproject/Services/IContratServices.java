package com.example.khaddemproject.Services;

import com.example.khaddemproject.Entites.Contrat;

import java.util.List;

public interface IContratServices {

    List<Contrat> getALLContrat();
    Contrat addContrat(Contrat c);
    Contrat updateContrat(Contrat c);
    void deleteContrat(Integer id);
    Contrat getContratById(Integer id);


}
