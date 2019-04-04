package com.jlwb.push.service;

import java.util.List;
import java.util.Map;

/**
 * @author daxiong
 */
public interface ConsulService {
     void setKVValue(Map<String, String> kvValue);

     void setKVValue(String key, String value);

     Map<String, String> getKVValues(String keyPrefix);

     List<String> getKVKeysOnly(String keyPrefix);

     Map<String, String> getKVValues();

     List<String> getKVKeysOnly();
}
