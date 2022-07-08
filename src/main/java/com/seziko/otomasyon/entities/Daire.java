package com.seziko.otomasyon.entities;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "daire")
public class Daire {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    int id;
    @Column(name = "il")
    String il;
    @Column(name = "ilce")
    String ilce;
    @Column(name = "semt")
    String semt;
    @Column(name = "mahalle")
    String mahalle;
    @Column(name = "sokak")
    String sokak;
    @Column(name = "posta_kodu")
    String postaKodu;
    @Column(name = "acik_adres")
    String acikAdres;
    @Column(name = "kira_bedeli")
    String kira_bedeli;
}
