package com.cursojava.curso.models;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "provedores")

public class Provedor {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Getter @Setter @Column(name = "idprovedor")
    private long idprovedor;

    @Getter @Setter @Column(name = "nombre")
    private String nombre ;

    @Getter @Setter @Column(name = "producto")
    private String producto;

    @Getter @Setter @Column(name = "telefono")
    private String telefono;

    @Getter @Setter @Column(name = "email")
    private String email;


}