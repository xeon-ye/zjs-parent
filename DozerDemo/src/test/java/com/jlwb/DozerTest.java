package com.jlwb;

import com.github.dozermapper.core.DozerBeanMapperBuilder;
import com.github.dozermapper.core.Mapper;
import org.junit.Test;

import java.util.Date;

/**
 * mapper 可以写成单例
 */
public class DozerTest extends BaseTest{

    @Test
    public void apiTest() {
        Mapper mapper = DozerBeanMapperBuilder.buildDefault();
        User user = new User();
        user.setName("hxy");
        user.setAge(123);
        user.setBirthday(new Date());

        UserApiDestinationObject destinationObject = mapper.map(user, UserApiDestinationObject.class);
        // 或者
        // UserApiDestinationObject destinationObject = new UserApiDestinationObject();
        // mapper.map(user, destinationObject);

        System.out.println(destinationObject);
    }
    @Test
    public void xmlTest() {
        // withMappingFiles 方法加载 xml 配置文件，多个配置文件可以用 "," 隔开，如 withMappingFiles("userMapping.xml" , "anotherMapping.xml")
        Mapper mapper = DozerBeanMapperBuilder.create().withMappingFiles("mapping/userMapping.xml").build();
        User user = new User();
        user.setName("hxy");
        user.setAge(123);
        user.setBirthday(new Date());
        UserXmlDestinationObject destinationObject = mapper.map(user, UserXmlDestinationObject.class);
        System.out.println(destinationObject);
    }
    @Test
    public void annotationsTest(){
       // Mapper mapper = DozerBeanMapperBuilder.buildDefault();
        //单例实现
        Mapper mapper = MappingSingleton.SINGLETON.getDefaultMapper();
        User user = new User();
        user.setName("hxy");
        user.setAge(123);
        user.setBirthday(new Date());
        UserAnnotationsObject destinationObject = mapper.map(user, UserAnnotationsObject.class);
        System.out.println(destinationObject);
    }

}
