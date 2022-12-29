package com.example.khaddemproject.Controllers;

import com.example.khaddemproject.Entites.University;
import com.example.khaddemproject.Repositorys.UniversityRepository;
import com.example.khaddemproject.Services.IUniversiteServices;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@AllArgsConstructor
public class UniversiteController {
    IUniversiteServices universiteServices;
    private final UniversityRepository universityRepository;

    @GetMapping("/getAllUniversite")
    public List<University> getAllUniverite(){
        return universiteServices.getAllUniversites();
    }

    @PostMapping("/addUniversite")
    public University addUniversite(@RequestBody University u){
        return universiteServices.addUniversite(u);
    }

    @PutMapping("/updateUniversite")
    public University updatUniversite(@RequestBody University u){
        return universiteServices.updateUniversite(u);
    }

    @DeleteMapping("/deleteUniversite/{idUniversite}")
    void deleteUniversite(@PathVariable Integer idUniversite){
        universiteServices.deleteUniversite(idUniversite);
    }

    @GetMapping("/getUniversite/{idUniversite}")
    public University getUniversite(@PathVariable Integer idUniversite){
        return universiteServices.getUniversite(idUniversite);
    }

    @PutMapping("/assignUniversiteToDepartement/{idDepartement}/{idUniversite}")
    public void assignUniversiteToDepartement(@PathVariable ("idDepartement") Integer idDepartement,@PathVariable ("idUniversite") Integer idUniversite){
        universiteServices.assignUniversiteToDepartement(idDepartement,idUniversite);
    }

  @PostMapping("/add")
    University addUniversites(@RequestBody University universitys){
        return universiteServices.addOrUpdateUniversite(universitys);
  }

}
