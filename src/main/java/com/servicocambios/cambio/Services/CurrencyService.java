package com.servicocambios.cambio.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.servicocambios.cambio.Model.Currency;
import com.servicocambios.cambio.Repository.CurrencyRepo;

import java.util.List;
import java.util.Optional;


@Service
public class CurrencyService {

    private CurrencyRepo currencyRepo;


    @Autowired
    public void setCurrencyRepo(CurrencyRepo currencyRepo){
        this.currencyRepo = currencyRepo;
    }
    
    public List<Currency> getAll(){
        return currencyRepo.findAll();
    }
    
    public Optional<Currency> getCurrencyById(Integer id){
        return currencyRepo.findById(id);
    }

    public void addCurrency(Currency currency){
        currencyRepo.save(currency);
    }

    public void updateCurrency(Integer id,Currency currency){
        currencyRepo.save(currency);
    }

    public void deleteCurrency(Integer id){
        currencyRepo.deleteById(id);
    }

    

}
