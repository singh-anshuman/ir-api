package com.anshuman.irapi.instrument.service;

import com.anshuman.irapi.instrument.model.Instrument;
import com.anshuman.irapi.instrument.repository.InstrumentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class InstrumentService {

    @Autowired
    private InstrumentRepository instrumentRepository;

    public List<Instrument> getInstruments() {
        return instrumentRepository.findAll();
    }

    public Optional<Instrument> getInstrumentById(Long id) {
        return instrumentRepository.findById(id);
    }
    
    public Instrument saveInstrument(Instrument instrument) {
        return instrumentRepository.save(instrument);
    }

}
