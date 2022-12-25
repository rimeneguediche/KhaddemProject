package com.example.khaddemproject.Entites;

import com.fasterxml.jackson.annotation.JsonIgnore;
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
    private int idEquipe ;
    private String nomEquipe ;

    @Enumerated(EnumType.STRING)
    Niveau niveau;

    @ManyToMany ( mappedBy = "equips" , cascade = CascadeType.ALL)
    @JsonIgnore
    private Set<Etudiant> etudiants;

    @OneToOne
    private DetailEquipe detailEquipe ;
}
