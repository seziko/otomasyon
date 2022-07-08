package com.seziko.otomasyon.bussines;

import com.seziko.otomasyon.dao.KiraciDao;
import com.seziko.otomasyon.entities.Kiraci;
import com.seziko.otomasyon.results.*;
import com.seziko.otomasyon.service.KiraciService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class KiraciManagement implements KiraciService {

    private KiraciDao kiraciDao;

    public KiraciManagement(KiraciDao kiraciDao) {
        this.kiraciDao = kiraciDao;
    }

    @Override
    public Result add(Kiraci kiraci) {
         this.kiraciDao.save(kiraci);
         return new SuccessDataResult<Kiraci>(kiraci,"Kiracı eklenmiştir.");
    }

    @Override
    public Result deleteById(int id){
        String mesaj;
        try {
            this.kiraciDao.deleteById(id);
            mesaj = id+" id'li kiracı silinmiştir..";
        }catch (Exception exception){
            mesaj = id+" id'li bir kiracı bulunamadı. Tekrar kontrol edeiniz..";
        }
        if (mesaj.equals(id + " id'li kiracı silinmiştir..")) {
            return new SuccessResult(mesaj);
        }else {
            return new ErrorResult(mesaj);
        }
    }

    @Override
    public DataResult<List<Kiraci>> findAll() {
        return new SuccessDataResult<List<Kiraci>>(this.kiraciDao.findAll(),"Tüm kiracılar listelenmiştir..");
    }
}
