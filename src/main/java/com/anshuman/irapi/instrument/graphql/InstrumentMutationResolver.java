package com.anshuman.irapi.instrument.graphql;

import com.anshuman.irapi.instrument.model.AssetClass;
import com.anshuman.irapi.instrument.model.Instrument;
import com.anshuman.irapi.instrument.model.InstrumentInput;
import com.anshuman.irapi.instrument.service.InstrumentService;
import com.coxautodev.graphql.tools.GraphQLMutationResolver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class InstrumentMutationResolver implements GraphQLMutationResolver {

    @Autowired
    private InstrumentService instrumentService;

    public Instrument addInstrument(String name, String isin, Double price, String assetClass) {
        Instrument instrument = Instrument.builder()
                                    .name(name)
                                    .isin(isin)
                                    .price(price)
                                    .assetClass(AssetClass.valueOf(assetClass))
                                    .build();

        return instrumentService.saveInstrument(instrument);
    }

    public Instrument addInstrumentViaInput(InstrumentInput instrumentInput) {
        return addInstrument(instrumentInput.getName()
                ,instrumentInput.getIsin()
                ,instrumentInput.getPrice()
                ,instrumentInput.getAssetClass());
    }

}
