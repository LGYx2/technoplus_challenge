package com.servicocambios.cambio.Controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.servicocambios.cambio.Model.Currency;
import com.servicocambios.cambio.Services.CurrencyService;

import java.util.List;
import java.util.Optional;



@RestController
public class CurrencyController{

    private CurrencyService currencyService;

    @Autowired
    public void setCurrencyService(CurrencyService currencyService){
        this.currencyService = currencyService;
    }

    @GetMapping("/list-currency-rates")
    public List<Currency> listCurrencyRates(){
        return currencyService.getAll(); 
    }
    
    @GetMapping("/find-currency-rate/{id}")
    public Optional<Currency> getCurrencyById(@PathVariable Integer id){
        return currencyService.getCurrencyById(id); 
    }
    @PostMapping("/add-currency-rate")
    public void addCurrency(@RequestBody Currency currency){
        currencyService.addCurrency(currency); 
    }

    @PutMapping("/update-currency-rate/{id}")
    public void updateCurrency(@PathVariable Integer id,@RequestBody Currency currency){
        currencyService.updateCurrency(id,currency); 
    }
    @DeleteMapping("/delete-currency-rate/{id}")
    public void deleteCurrency(@PathVariable Integer id){
        currencyService.deleteCurrency(id); 
    }
    





}