package com.anshuman.irapi.instrument.controller;

import com.anshuman.irapi.instrument.model.Instrument;
import com.anshuman.irapi.instrument.service.InstrumentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class InstrumentController {

    @Autowired
    private InstrumentService instrumentService;

    @GetMapping("/instruments")
    public ResponseEntity<List<Instrument>> getInstruments() {
        return new ResponseEntity<>(instrumentService.getInstruments(), HttpStatus.OK);
    }

    @PostMapping("/instruments")
    public ResponseEntity<Instrument> addInstrument(@RequestBody Instrument instrument) {
        return new ResponseEntity<>(instrumentService.saveInstrument(instrument),HttpStatus.CREATED);
    }


}
