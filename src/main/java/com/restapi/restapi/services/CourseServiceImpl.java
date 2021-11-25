package com.restapi.restapi.services;

import java.util.ArrayList;
import java.util.List;

import com.restapi.restapi.entities.Cource;

import org.springframework.stereotype.Service;

@Service
public class CourseServiceImpl implements CourceService {

    List<Cource> list;

    public CourseServiceImpl() {
        list = new ArrayList<Cource>();
        list.add(new Cource(1, "Raj", "Java"));
    }

    @Override
    public List<Cource> getCources() {

        return list;
    }

    @Override
    public Cource addCource(Cource cource) {
        list.add(cource);
        return cource;
    }
}