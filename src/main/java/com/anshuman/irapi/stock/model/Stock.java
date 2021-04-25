package com.anshuman.irapi.stock.model;


import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "STOCKS")
public class Stock {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private String symbol;
    private String name;
    private Exchange exchange;

}