package org.dikkulah.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/till")
public class TillController {
   /* @Autowired
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
    public Till getTillById(@PathVariable Long id) {
        return tillService.getTillById(id);
    }

    //id ile bulup gönderilen body ile update etme
    @PutMapping("/{id}")
    public Till updateTill(@PathVariable Long id, @RequestBody Till request) {
        return tillService.updateTill(id, request);
    }

    // id ile silme
    @DeleteMapping(value = "/{id}")
    public Boolean deleteTillById(@PathVariable Long id) {
        return tillService.deleteTillById(id);
    }

    // aktif- pasif listeleme
    @GetMapping(value = "state/{isActive}")
    public List<Till> getTillByIsActive(@PathVariable String isActive) {
        return tillService.getTillByIsActive(Boolean.valueOf(isActive));
    }*/
}
