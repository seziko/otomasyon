package com.seziko.otomasyon.entities;

import lombok.Data;

import javax.persistence.*;
import java.sql.Date;

@Data
@Entity
@Table(name = "kiraci")
public class Kiraci {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    int id;
   // @ManyToOne()
   // @JoinColumn(name = "id")
   // private Kimlik kimlik;
   // @Column(name = "daire_adresi")
    String daireAdresi;
    @Column(name = "kira_bedeli")
    String kiraBedeli;
    @Column(name = "kisi_sayisi")
    String kisiSayisi;
   // @ManyToMany
   // @JoinColumn(name = "id")
   // private Daire daire;
    @Column(name = "giris_tarihi")
    Date girisTarihi;
    @Column(name = "cikis_tarihi")
    Date cikisTarihi;

}
