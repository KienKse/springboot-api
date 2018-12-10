package com.cartas.card;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestRoute {

    @RequestMapping("/int")
    public Integer home2() {
        return 1+3;
    }

}
