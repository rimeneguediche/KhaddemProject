package com.example.khaddemproject.Entites;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;
import lombok.experimental.FieldDefaults;
import org.hibernate.engine.internal.Cascade;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
@Table(name = "etudiant")


public class Etudiant implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long idEtudiant ;
    String prenomEtudiant;
    String nomEtudiant;


    @Enumerated(EnumType.STRING)
    Option option;


    @OneToMany (cascade= CascadeType.ALL, mappedBy = "etudiant")
    @JsonIgnore
    private Set<Contrat> contrats;


    @ManyToOne
    @JsonIgnore
    Departement departement;

    @ManyToMany ( cascade = CascadeType.PERSIST) // a voir
     Set<Equipe> equips ;

}
