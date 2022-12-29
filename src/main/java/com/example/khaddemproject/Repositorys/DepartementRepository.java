package com.example.khaddemproject.Repositorys;

import com.example.khaddemproject.Entites.Departement;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface DepartementRepository extends JpaRepository <Departement,Integer> {

}
