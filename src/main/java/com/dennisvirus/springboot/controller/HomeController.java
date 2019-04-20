package com.dennisvirus.springboot.controller;

import com.dennisvirus.springboot.dto.Country;
import com.dennisvirus.springboot.service.HomeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/home")
public class HomeController {

    @Autowired
    HomeService homeService;

    @GetMapping("/json/{value}")
    public Map<String, String> getJsonValue(@PathVariable("value") String value) {
        Map<String, String> map = new HashMap<>();
        map.put("name", value);
        map.put("age", "22");
        return map;
    }

    @GetMapping("/json/table/{name}")
    public Country getTableValue(@PathVariable("name") String name) {

        return homeService.getTableData(name);

    }

    public static Comparator<String> reverse(Comparator<String> comp) {
        return (x, y) -> comp.compare(y, x);
    }


}
