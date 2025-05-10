package com.example.lab4_20212624_gtics.Entity;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "clinic")
public class Clinic {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private int id;


    @Column(name = "name")
    private String nombre;
    @Column(name = "address")
    private String direccion;
    @Column(name = "phone_number")
    private String telefono;


}
