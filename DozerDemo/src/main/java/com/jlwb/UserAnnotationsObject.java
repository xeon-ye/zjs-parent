package com.jlwb;

import com.github.dozermapper.core.Mapping;
import lombok.Data;
import lombok.ToString;

/**
 * @author daxiong
 */
@Data
@ToString
public class UserAnnotationsObject {
    @Mapping("name")
    public String username;
    private String age;
    @Mapping("birthday")
    private String dateOfBirth;
}
