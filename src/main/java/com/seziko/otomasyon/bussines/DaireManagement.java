package com.seziko.otomasyon.bussines;

import com.seziko.otomasyon.dao.DaireDao;
import com.seziko.otomasyon.entities.Daire;
import com.seziko.otomasyon.results.*;
import com.seziko.otomasyon.service.DaireService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
public class DaireManagement implements DaireService {

    private DaireDao daireDao;

    public DaireManagement(DaireDao daireDao) {
        this.daireDao = daireDao;
    }

    @Override
    public Result add(Daire daire) {
        this.daireDao.save(daire);
        return new SuccessResult("Daire eklenmiştir.");
    }

    @Override
    public DataResult<List<Daire>> findAll() {
        return new SuccessDataResult<List<Daire>>(this.daireDao.findAll(),"Tüm liste listelenmiştir.");
    }

    @Override
    public Result deleteById(int id){
        String mesaj;
        try {
            this.daireDao.deleteById(id);
            mesaj = String.valueOf(id)+" id li daire silinmiştir..";

        }catch (Exception exception){
            mesaj = String.valueOf(id) +" id li herhangi bir daire bulunamamıştır..";
        }
        if (mesaj.equals(String.valueOf(id) + " id li daire silinmiştir..")) {
            return new SuccessResult(mesaj);
        }else {
            return new ErrorResult(mesaj);
        }
    }
}
