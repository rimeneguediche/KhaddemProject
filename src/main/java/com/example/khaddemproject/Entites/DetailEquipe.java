package com.example.khaddemproject.Entites;


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
    int idDetailEquipe ;
    int salle;
    String thematique ;

    @OneToOne ( mappedBy = "detailEquipe")
    private Equipe equipe ;
}