package com.jlwb;

import lombok.Data;

/**
 * 有时候两个 bean 的属性名并不完全相同，这时候通过 Dozer 的隐式映射并不能满足我们的实际需求，这时候就可以通过 Dozer 的另一种映射方式——显示映射 进行映射。
 * 通过显示映射的方法需要我们自己创建一个 xml 的映射文件来指定两个类的映射关系。这些 xml 配置文件将在运行时由 Dozer 引擎使用。
 * ---------------------
 * @author daxiong
 */
@Data
public class UserXmlDestinationObject {
    private String username;
    private String age;
    public String dateOfBirth;
}