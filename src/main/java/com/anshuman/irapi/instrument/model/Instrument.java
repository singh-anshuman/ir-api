package com.anshuman.irapi.instrument.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@Table(name = "INSTRUMENTS")
@NoArgsConstructor
public class Instrument {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String name;
    private String isin;
    private Double price;

    @Enumerated(EnumType.STRING)
    private AssetClass assetClass;

}