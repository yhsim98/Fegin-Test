package com.example.eksa.service;

import com.example.eksa.lib.BClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class AService {
    @Autowired
    private BClient bClient;

    public Map<String, String> getB() {
        return bClient.getB();
    }
}
