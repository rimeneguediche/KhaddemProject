package com.example.khaddemproject.Entites;

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
    Integer idEtudiant ;
    String prenomE;
    String nomE;


    @Enumerated(EnumType.STRING)
    Option option;


    @OneToMany (cascade= CascadeType.ALL, mappedBy = "etudiant")
    private Set<Contrat> contrats;


    @ManyToOne
    private  Departement departements;

    @ManyToMany ( cascade = CascadeType.ALL)
    private Set<Equipe> equipes ;

}
