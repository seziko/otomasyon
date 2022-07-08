package com.seziko.otomasyon.dao;

import com.seziko.otomasyon.entities.Daire;
import com.seziko.otomasyon.results.DataResult;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DaireDao extends JpaRepository<Daire,Integer> {



}
