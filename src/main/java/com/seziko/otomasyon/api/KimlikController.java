package com.seziko.otomasyon.api;

import com.seziko.otomasyon.entities.Kimlik;
import com.seziko.otomasyon.results.DataResult;
import com.seziko.otomasyon.results.Result;
import com.seziko.otomasyon.service.KimlikService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/kimlikController")
public class KimlikController {

    private KimlikService kimlikService;

    @Autowired
    public KimlikController(KimlikService kimlikService) {
        this.kimlikService = kimlikService;
    }

    @PostMapping("/kimlikEkle")
    public Result add(Kimlik kimlik){
        return this.kimlikService.add(kimlik);
    }

    @GetMapping("/tumKimlikListele")
    public DataResult<List<Kimlik>> findAll(){
        return this.kimlikService.findAll();
    }

    @PostMapping("/kimlikSil")
    public Result deleteById(int id){
        return this.kimlikService.deleteById(id);
    }
}
