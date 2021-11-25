package com.restapi.restapi.mycontrollers;

import java.util.List;

import com.restapi.restapi.entities.Cource;
import com.restapi.restapi.services.CourceService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
public class MyController {

    @Autowired
    private CourceService CourceService;

    @GetMapping("/home")
    public String home() {
        return "This is home";
    }

    // Get cources
    @GetMapping("/cources")
    public List<Cource> getCources() {
        return this.CourceService.getCources();
    }

    // Add Cource
    @PostMapping("/cources")
    public Cource addCource(@RequestBody Cource cource) {
        try {
            this.CourceService.addCource(cource);
        } catch (Exception e) {
            System.out.println("Wrong fromate");
        }
        return cource;
    }
}