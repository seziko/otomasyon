package com.seziko.otomasyon.service;

import com.seziko.otomasyon.entities.Kimlik;
import com.seziko.otomasyon.results.DataResult;
import com.seziko.otomasyon.results.Result;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface KimlikService{

    Result add(Kimlik kimlik);

    DataResult<List<Kimlik>> findAll();

    Result deleteById(int id);

}
