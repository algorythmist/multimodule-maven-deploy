package com.tecacet.core;

import java.time.LocalDate;

public class Pojo {

    private final String name;
    private final LocalDate date;

    public Pojo(String name, LocalDate date) {
        this.name = name;
        this.date = date;
    }

    public String getName() {
        return name;
    }

    public LocalDate getDate() {
        return date;
    }

    @Override
    public String toString() {
        return "Pojo{" +
                "name='" + name + '\'' +
                ", date=" + date +
                '}';
    }
}
