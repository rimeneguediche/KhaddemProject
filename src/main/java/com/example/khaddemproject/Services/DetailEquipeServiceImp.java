package com.example.khaddemproject.Services;

import com.example.khaddemproject.Entites.DetailEquipe;
import com.example.khaddemproject.Repositorys.DetailEquipeRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class DetailEquipeServiceImp implements IDetailEquipeServices{

    DetailEquipeRepository detailEquipeRepository;
    @Override
    public List<DetailEquipe> GetAllDetailEquipe() {
        return detailEquipeRepository.findAll();
    }

    @Override
    public DetailEquipe addDetailEquipe(DetailEquipe e) {
        return detailEquipeRepository.save(e);
    }

    @Override
    public DetailEquipe updateDetailEquipe(DetailEquipe e) {
        return detailEquipeRepository.save(e);
    }

    @Override
    public DetailEquipe getDetailEquipeById(Integer idDetailEquipe) {
        return detailEquipeRepository.findById(idDetailEquipe).orElse(null);
    }

    @Override
    public void deleteDetailEquipe(Integer idDetailEquipe) {
        detailEquipeRepository.deleteById(idDetailEquipe);
    }



}
