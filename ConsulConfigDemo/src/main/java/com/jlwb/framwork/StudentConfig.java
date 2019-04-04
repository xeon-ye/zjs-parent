package com.jlwb.framwork;

import org.springframework.boot.context.properties.ConfigurationProperties;


/**
 * @author daxiong
 */
@ConfigurationProperties(prefix = "student")
public class StudentConfig {
    private String author;

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    private  int age;




    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }



}
