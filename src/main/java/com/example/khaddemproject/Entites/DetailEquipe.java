package com.example.khaddemproject.Entites;


import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;
import lombok.experimental.FieldDefaults;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
@Table(name = "detailEquipe")


public class DetailEquipe implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idDetailEquipe ;
    private int salle;
    private String thematique ;

    @OneToOne ( mappedBy = "detailEquipe")
    @JsonIgnore
    private Equipe equipe ;
}