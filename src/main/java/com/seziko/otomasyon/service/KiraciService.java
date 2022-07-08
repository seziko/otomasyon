package com.seziko.otomasyon.service;

import com.seziko.otomasyon.entities.Kiraci;
import com.seziko.otomasyon.results.DataResult;
import com.seziko.otomasyon.results.Result;
import org.springframework.stereotype.Service;

import javax.xml.crypto.Data;
import java.util.List;

@Service
public interface KiraciService {

    Result add(Kiraci kiraci);

    Result deleteById(int id);

    DataResult<List<Kiraci>> findAll();


}
