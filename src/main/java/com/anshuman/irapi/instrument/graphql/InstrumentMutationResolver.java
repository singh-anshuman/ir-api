package com.anshuman.irapi.instrument.graphql;

import com.anshuman.irapi.instrument.model.AssetClass;
import com.anshuman.irapi.instrument.model.Instrument;
import com.anshuman.irapi.instrument.service.InstrumentService;
import com.coxautodev.graphql.tools.GraphQLMutationResolver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class InstrumentMutationResolver implements GraphQLMutationResolver {

    @Autowired
    private InstrumentService instrumentService;

    public Instrument addInstrument(String name, String isin, Double price, String assetClass) {
        Instrument instrument = new Instrument();
        instrument.setName(name);
        instrument.setIsin(isin);
        instrument.setPrice(price);
        instrument.setAssetClass(AssetClass.valueOf(assetClass));

        return instrumentService.saveInstrument(instrument);
    }

}
