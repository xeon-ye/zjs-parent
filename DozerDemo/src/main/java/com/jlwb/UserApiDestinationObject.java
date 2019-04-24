package com.jlwb;

import lombok.Data;
import lombok.ToString;

/**
 * @author daxiong
 */
@Data
@ToString
public class UserApiDestinationObject {
    private String name;
    private String age;
    public String birthday;
}