package com.example.khaddemproject.Controllers;

import com.example.khaddemproject.Entites.DetailEquipe;
import com.example.khaddemproject.Services.IDetailEquipeServices;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
public class DetailEquipeController {

    IDetailEquipeServices detailEquipeServices;

    @GetMapping("/getALLDetailEquipe")
    public List<DetailEquipe> getallDetailEquipes(){return detailEquipeServices.GetAllDetailEquipe();}

    @GetMapping("/getDetailEquipe/{idDetailEquipe}")
    public DetailEquipe getDetailEquipe(@PathVariable Integer idDetailEquipe){return detailEquipeServices.getDetailEquipeById(idDetailEquipe);}

    @PostMapping("/addDetailEquipe")
    public DetailEquipe addDetailEquipe(@RequestBody DetailEquipe e){return detailEquipeServices.addDetailEquipe(e);}

    @PutMapping("/updateDetailEquipe")
    public DetailEquipe updateDetailEquipe(@RequestBody DetailEquipe e){return detailEquipeServices.updateDetailEquipe(e);}

    @DeleteMapping("/deleteDetailEquipe/{idDetailEquipe}")
    public void deleteDetailEquipe(@PathVariable Integer idDetailEquipe){detailEquipeServices.deleteDetailEquipe(idDetailEquipe);}




}
