package com.seziko.otomasyon.dao;

import com.seziko.otomasyon.entities.Kimlik;
import com.seziko.otomasyon.results.DataResult;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface KimlikDao extends JpaRepository<Kimlik,Integer> {



}
