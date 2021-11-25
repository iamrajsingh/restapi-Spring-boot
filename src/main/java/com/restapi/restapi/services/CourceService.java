package com.restapi.restapi.services;

import java.util.List;

import com.restapi.restapi.entities.Cource;

public interface CourceService {
    public List<Cource> getCources();

    public Cource addCource(Cource cource);
}
