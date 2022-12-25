package com.example.khaddemproject.Controllers;

import com.example.khaddemproject.Entites.Departement;
import com.example.khaddemproject.Services.IDepartementServices;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@AllArgsConstructor
public class DepartementController {

    IDepartementServices departementServices;


    @GetMapping("/getDepartement/{idDepart}")
    public Departement getDepartements(@PathVariable Integer idDepart){return departementServices.getDepartementById(idDepart);}

    @GetMapping("/getAllDepartment")
    public List<Departement> getDepartementList(){return departementServices.getAllDepartements();}

    @PostMapping("/addDepartement")
    public Departement addDepartement(@RequestBody Departement d){return departementServices.addDepartement(d);}

    @PutMapping("/updateDepartement")
    public Departement updateDepartement(@RequestBody Departement d){return departementServices.updateDepartement(d);}

    @DeleteMapping("/deleteDepartement/{idDepart}")
    public void deleteDepartement(@PathVariable Integer idDepart){departementServices.deleteDepartement(idDepart);}




}
