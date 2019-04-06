package com.dennisvirus.springboot.service;

import com.dennisvirus.springboot.dto.Country;
import com.dennisvirus.springboot.mapper.HomeMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HomeService {

    @Autowired
    HomeMapper homeMapper;

    public Country getTableData(String name){
        return homeMapper.getTableData(name);
    }
}
