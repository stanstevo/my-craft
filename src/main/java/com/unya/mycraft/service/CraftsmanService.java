/* package com.unya.mycraft.service;


import com.unya.mycraft.entity.Craftsman;
import com.unya.mycraft.repository.CraftsmanRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service

public class CraftsmanService {

    private CraftsmanRepository craftsmanRepository;

    @Autowired
    public CraftsmanService(CraftsmanRepository craftsmanRepository) {
        this.craftsmanRepository = craftsmanRepository;
    }

    public List<Craftsman> findAll() {
        return craftsmanRepository.findAll();
    }
}
 */