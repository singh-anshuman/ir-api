package com.anshuman.irapi.instrument.model;

import lombok.*;

import javax.persistence.*;

@Entity
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "INSTRUMENTS")
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