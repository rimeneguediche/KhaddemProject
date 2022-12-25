package com.example.khaddemproject.Controllers;

import com.example.khaddemproject.Entites.Equipe;
import com.example.khaddemproject.Services.IEquipeServices;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@AllArgsConstructor
public class EquipeController {

    IEquipeServices equipeServices;

    @GetMapping("/getAllEquipes")
    public List<Equipe> getallEquipes(){return equipeServices.getAllEquipes();}

    @GetMapping("/getEquipe/{idEquipe}")
    public Equipe getEquipe(@PathVariable Integer idEquipe){return equipeServices.getEquipe(idEquipe);}

    @PostMapping("/addEquipe")
    public Equipe addEquipe(@RequestBody Equipe e){return equipeServices.addEquipe(e);}

    @PutMapping("/updateEquipe")
    public Equipe updateEquipe(@RequestBody Equipe e){return equipeServices.updateEquipe(e);}

    @DeleteMapping("/deleteEquipe/{idEquipe}")
    public void deleteEquipe(@PathVariable Integer idEquipe){equipeServices.deleteEquipe(idEquipe);}


}
