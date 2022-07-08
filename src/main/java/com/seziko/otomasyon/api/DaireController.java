package com.seziko.otomasyon.api;

import com.seziko.otomasyon.entities.Daire;
import com.seziko.otomasyon.results.DataResult;
import com.seziko.otomasyon.results.Result;
import com.seziko.otomasyon.service.DaireService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/daireController")
public class DaireController {

    private DaireService daireService;

    public DaireController(DaireService daireService) {
        this.daireService = daireService;
    }

    @PostMapping("/daireEkle")
    public Result add(Daire daire){
        return this.daireService.add(daire);
    }

    @GetMapping("/tumDaireListele")
    public DataResult<List<Daire>> findAll(){
        return this.daireService.findAll();
    }

    @PostMapping("/daireSil")
    public Result deleteById(int id){
        return this.daireService.deleteById(id);
    }
}
