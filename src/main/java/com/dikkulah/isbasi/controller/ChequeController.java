package com.dikkulah.isbasi.controller;

import com.dikkulah.isbasi.model.Cheque;
import com.dikkulah.isbasi.service.ChequeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/cheque")
public class ChequeController {

    @Autowired
    private ChequeService chequeService;



    //  kayıt etme
    @PostMapping
    public Cheque createCheque(@RequestBody Cheque request) {
        return chequeService.createCheque(request);
    }

    //Hepsini listele
    @GetMapping
    public List<Cheque> getAllCheques() {
        return chequeService.getAllCheques();
    }

    //id ile arama
    @GetMapping(value = "/{id}")
    public Cheque getChequeById(@PathVariable Integer id) {
        return chequeService.getChequeById(id);
    }

    //id ile bulup gönderilen body ile update etme
    @PutMapping
    public Cheque updateCheque(@RequestBody Cheque request) {
        return chequeService.updateCheque(request);
    }

    // id ile silme
    @DeleteMapping(value = "/{id}")
    public void deleteChequeById(@PathVariable Integer id) {
            chequeService.deleteChequeById(id);

    }

}
