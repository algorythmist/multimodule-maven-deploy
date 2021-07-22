package com.tecacet.core;

import org.junit.Test;

import java.time.LocalDate;

import static org.junit.Assert.*;

public class PojoTest {

    @Test
    public void getName() {
        Pojo pojo = new Pojo("Nick", LocalDate.MIN);
        assertEquals("Nick", pojo.getName());
    }
}