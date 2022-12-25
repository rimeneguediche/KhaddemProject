package com.example.khaddemproject.Entites;

import lombok.*;
import lombok.experimental.FieldDefaults;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
@Table(name = "equipe")


public class Equipe implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
     int idEquipe ;
    String nomEquipe ;

    @Enumerated(EnumType.STRING)
    Niveau niveau;

    @ManyToMany ( mappedBy = "equipes" , cascade = CascadeType.ALL)
    private Set<Etudiant> etudiants;

    @OneToOne
    private DetailEquipe detailEquipe ;
}
