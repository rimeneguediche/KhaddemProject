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
@Table(name = "departement")


public class Departement implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int idDepart;
    String nomDepart;

    @OneToMany (cascade = CascadeType.ALL, mappedBy = "departements")
    private Set<Etudiant> etudiants ;

}
