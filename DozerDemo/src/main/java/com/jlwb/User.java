package com.jlwb;


import lombok.Data;

import java.util.Date;
/**
 * @author daxiong
 */
@Data
public class User {
    private String name;
    private Integer age;
    private Date birthday;
}