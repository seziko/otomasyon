package com.seziko.otomasyon.service;

import com.seziko.otomasyon.entities.Daire;
import com.seziko.otomasyon.results.DataResult;
import com.seziko.otomasyon.results.Result;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public interface DaireService {

    Result add(Daire daire);

    DataResult<List<Daire>> findAll();


    Result deleteById(int id);
}
