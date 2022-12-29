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
@Table(name = "university")


public class University implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
     private int idUniversite;
    private String nomUniversite;

    @OneToMany ( cascade = {CascadeType.PERSIST ,CascadeType.REMOVE})
    private Set<Departement> departements ;

}
