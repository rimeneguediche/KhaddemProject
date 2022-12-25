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
@Table(name = "departement")


public class Departement implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idDepartement;
    private String nomDepartement;

    @OneToMany (cascade = CascadeType.ALL, mappedBy = "departement")
    @JsonIgnore
    private Set<Etudiant> etudiants ;

}
