package com.tecacet.service;

import com.tecacet.core.Pojo;

import java.time.LocalDate;

public class GreatService {

    public Pojo combine(Pojo pojo1, Pojo pojo2) {
        return new Pojo(pojo1.getName() + " " + pojo2.getName(),
                max(pojo1.getDate(), pojo2.getDate()));
    }

    private LocalDate max(LocalDate date1, LocalDate date2) {
        return date1.isAfter(date2) ? date1 : date2;
    }
}
