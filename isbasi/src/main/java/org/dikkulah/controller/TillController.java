package org.dikkulah.controller;

import org.dikkulah.model.Till;
import org.dikkulah.service.TillService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/till")
public class TillController {
    @Autowired
    private TillService tillService;

    //  kayıt etme
    @PostMapping
    public Till createTill(@RequestBody Till request) {
        return tillService.createTill(request);
    }

    //Hepsini listele
    @GetMapping
    public List<Till> getAllTills() {
        return tillService.getAllTills();
    }

    //id ile arama
    @GetMapping(value = "/{id}")
    public Till getTillById(@PathVariable Integer id) {
        return tillService.getTillById(id);
    }

    //id ile bulup gönderilen body ile update etme
    @PutMapping
    public Till updateTill(@RequestBody Till request) {
        return tillService.updateTill(request);
    }

    // id ile silme
    @DeleteMapping(value = "/{id}")
    public void deleteTillById(@PathVariable Integer id) {
        tillService.deleteTillById(id);
    }

    // aktif- pasif listeleme
    @GetMapping(value = "state/{isActive}")
    public List<Till> getTillsByIsActive(@PathVariable String isActive) {
        return tillService.getTillsByIsActive(Boolean.valueOf(isActive));
    }
}
