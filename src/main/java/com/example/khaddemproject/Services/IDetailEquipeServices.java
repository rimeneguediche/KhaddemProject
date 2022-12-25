package com.example.khaddemproject.Services;


import com.example.khaddemproject.Entites.DetailEquipe;

import java.util.List;

public interface IDetailEquipeServices {

    List<DetailEquipe> GetAllDetailEquipe();

    DetailEquipe addDetailEquipe(DetailEquipe e);

    DetailEquipe updateDetailEquipe (DetailEquipe e);

    DetailEquipe getDetailEquipeById (Integer idDetailEquipe);

    void deleteDetailEquipe(Integer idDetailEquipe);


}
