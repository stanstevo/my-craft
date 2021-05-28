package com.unya.mycraft.service;

import com.unya.mycraft.entity.Craft;
import com.unya.mycraft.repository.CraftRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CraftService {

    private CraftRepository craftRepository;

    public CraftService(CraftRepository craftRepository) {
        this.craftRepository = craftRepository;
    }

    public void save(Craft craft) {
        craftRepository.save(craft);
    }

    public void saveAll(List<Craft> craftList) {
        craftRepository.saveAll(craftList);
    }
}
