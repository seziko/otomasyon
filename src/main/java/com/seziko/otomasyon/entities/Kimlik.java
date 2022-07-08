package com.seziko.otomasyon.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Date;

@Data
@Entity
@Table(name = "kimlik")
@NoArgsConstructor
@AllArgsConstructor
public class Kimlik implements Serializable {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    int id;
    @Column(name = "adi")
    String adi;
    @Column(name = "soyadi")
    String soyadi;
    @Column(name = "adi_soyadi")
    String adiSoyadi;
    @Column(name = "dogum_tarihi")
    Date dogumTarihi;
    @Column(name = "cinsiyet")
    String cinsiyet;
    @Column(name="tc_kimlik_no")
    String tcKimlikNo;
    @Column(name = "telefon_no")
    String telefonNo;
    @Column(name = "medeni_durumu")
    String medeniDurumu;
    @Column(name = "meslek")
    String meslek;
    @Column(name = "yakin_telefon_no")
    String yakinTelefonNo;
    @Column(name = "yakin_adi_soyadi")
    String yakin_adi_soyadi;
    @Column(name = "yakinlik_durumu")
    String yakinlikDurumu;

}
