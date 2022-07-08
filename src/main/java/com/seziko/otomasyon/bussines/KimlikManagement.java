package com.seziko.otomasyon.bussines;

import com.seziko.otomasyon.dao.KimlikDao;
import com.seziko.otomasyon.entities.Kimlik;
import com.seziko.otomasyon.results.DataResult;
import com.seziko.otomasyon.results.Result;
import com.seziko.otomasyon.results.SuccessDataResult;
import com.seziko.otomasyon.results.SuccessResult;
import com.seziko.otomasyon.service.KimlikService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class KimlikManagement implements KimlikService {
    @Autowired
    private KimlikDao kimlikDao;

    public KimlikManagement(KimlikDao kimlikDao) {
        this.kimlikDao = kimlikDao;
    }

    @Override
    public Result add(Kimlik kimlik) {
            this.kimlikDao.save(kimlik);
        return new SuccessResult("Kimlik eklendi..");
    }

    @Override
    public DataResult<List<Kimlik>> findAll() {
        return new SuccessDataResult<List<Kimlik>>(
                this.kimlikDao.findAll(),
                "Listelendi..");
    }

    @Override
    public Result deleteById(int id){
        this.kimlikDao.deleteById(id);
        return new SuccessResult("id = "+id+" olan kimlik kaydı silinmiştir.");
    }
}
