package com.unya.mycraft.controller;

import com.unya.mycraft.entity.Craft;
import com.unya.mycraft.service.CraftService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import javax.annotation.PostConstruct;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@Controller
public class CraftController {
    private CraftService craftService;
    @Autowired
    public CraftController(CraftService craftService) {
        this.craftService = craftService;
    }

    public void saveCraft(Craft craft) {
        if(craft == null) {
            return;
        }
        craftService.save(craft);
    }
    @PostConstruct
    public void generateTestData() {
        craftService.saveAll(Stream.of(new Craft(null, "Caregiver"),
                new Craft(null, "Mason"),
                new Craft(null, "Carpenter"),
                new Craft(null, "Electrician"),
                new Craft(null, "Plumber"),
                new Craft(null, "Gardener"),
                new Craft(null, "Landscaper"),
                new Craft(null, "Plumber")
        ).collect(Collectors.toList()));
    }
}
