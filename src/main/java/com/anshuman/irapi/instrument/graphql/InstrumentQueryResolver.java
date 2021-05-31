package com.anshuman.irapi.instrument.graphql;

import com.anshuman.irapi.instrument.model.Instrument;
import com.anshuman.irapi.instrument.service.InstrumentService;
import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class InstrumentQueryResolver implements GraphQLQueryResolver {

    @Autowired
    private InstrumentService instrumentService;

    public Instrument getInstrumentById(Long id) {
        return instrumentService.getInstrumentById(id).get();
    }

    public List<Instrument> getInstruments() {
        return instrumentService.getInstruments();
    }

}
