package com.tecacet.service;

import com.tecacet.core.Pojo;
import org.junit.Test;

import java.time.LocalDate;

import static org.junit.Assert.*;

public class GreatServiceTest {

    @Test
    public void combine() {
        Pojo pojo1 = new Pojo("Nick", LocalDate.of(2005,2,8));
        Pojo pojo2 = new Pojo("Nolte", LocalDate.of(2010, 4, 21));
        GreatService service = new GreatService();
        Pojo pojo = service.combine(pojo1, pojo2);
        assertEquals("Nick Nolte", pojo.getName());
        assertEquals(LocalDate.of(2010, 4, 21), pojo.getDate());
    }
}