package com.jlwb.framwork.starter.swagger;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

import java.util.List;

/**
 * @author wuxiongxiong
 * @date 2018-4-3
 **/
@Data
@ConfigurationProperties(prefix = "zjs.swagger2")
public class Swagger2Properties {

    private String basePackage;
    private List<String> excludePath;
    private String title;
    private String description;
    private String version;
    private String apiName;
    private String apiKeyName;
    private String termsOfServiceUrl;
    private Boolean enable;
    private String reg;

}
