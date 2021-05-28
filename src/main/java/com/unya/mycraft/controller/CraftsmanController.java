package com.unya.mycraft.controller;

import com.unya.mycraft.service.CraftsmanService;
import org.springframework.beans.factory.annotation.Autowired;

public class CraftsmanController {


    private CraftsmanService craftsmanService;

    @Autowired
    public CraftsmanController(CraftsmanService craftsmanService) {
        this.craftsmanService = craftsmanService;
    }
}
