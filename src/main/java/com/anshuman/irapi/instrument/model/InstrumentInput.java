package com.anshuman.irapi.instrument.model;

import lombok.Data;

@Data
public class InstrumentInput {

    private String name;
    private String isin;
    private Double price;
    private String assetClass;

}
