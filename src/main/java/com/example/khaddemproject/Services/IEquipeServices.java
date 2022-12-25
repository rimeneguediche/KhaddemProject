package com.example.khaddemproject.Services;


import com.example.khaddemproject.Entites.Equipe;

import java.util.List;

public interface IEquipeServices {

    List<Equipe> getAllEquipes();

    Equipe getEquipe (Integer idEquipe);

    Equipe addEquipe(Equipe e); // ajouter l’équipe avec son détail

    Equipe updateEquipe (Equipe e);

    void deleteEquipe (Integer idEquipe);
}
