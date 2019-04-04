package com.jlwb.framwork;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


/**
 * @author daxiong
 */
@RestController
@RefreshScope
public class DemoController {

    @Value("${student.author}")
    private String author;

    @Value("${student.age}")
    private String age;

    @GetMapping("/demo")
    public String demo() {
        return author + "," + age;
    }

}