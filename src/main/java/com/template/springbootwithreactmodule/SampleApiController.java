package com.template.springbootwithreactmodule;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SampleApiController {

    @GetMapping("/api/proxy")
    public long getCurrentTimeMilli() {
        return System.currentTimeMillis();
    }
}
