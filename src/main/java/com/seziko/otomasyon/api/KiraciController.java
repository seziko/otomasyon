package com.seziko.otomasyon.api;

import com.seziko.otomasyon.results.DataResult;
import com.seziko.otomasyon.results.Result;
import com.seziko.otomasyon.entities.Kiraci;
import com.seziko.otomasyon.service.KiraciService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/kiraciController")
public class KiraciController {

    private KiraciService kiraciService;

    @Autowired
    public KiraciController(KiraciService kiraciService) {
        this.kiraciService = kiraciService;
    }

    @PostMapping("/kiraciEkle")
    public Result add(Kiraci kiraci){
        return this.kiraciService.add(kiraci);
    }

    @PostMapping("/kiraciSil")
    public Result deleteById(int id){
        return this.kiraciService.deleteById(id);
    }

    @GetMapping("/tumKiraciListele")
    public DataResult<List<Kiraci>> findAll(){
        return this.kiraciService.findAll();
    }
}
