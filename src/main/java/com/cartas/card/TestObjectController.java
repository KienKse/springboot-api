package com.cartas.card;

import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicInteger;

//import java.util.concurrent.atomic.AtomicLong;

@RestController
public class TestObjectController {

//    private final AtomicInteger counter = new AtomicInteger();
//
//    @RequestMapping("/")
//    public Carta carta(@RequestParam(value="name", defaultValue="World") String name) {
//        return new Carta(counter.incrementAndGet(),name,"",1000,"","",3);
//    }

    @RequestMapping("/")
    public  String home() {
        return "Card...";
    }

}
