package com.jlwb;

import com.github.dozermapper.core.DozerBeanMapperBuilder;
import com.github.dozermapper.core.Mapper;

/**
 * 首先，在枚举中我们明确了构造方法限制为私有，在我们访问枚举实例时会执行构造方法，同时每个枚举实例都是static final类型的，也就表明只能被实例化一次。在调用构造方法时，我们的单例被实例化。
 * 也就是说，因为enum中的实例被保证只会被实例化一次，所以我们的INSTANCE也被保证实例化一次。
 * 可以看到，枚举实现单例还是比较简单的
 * @author daxiong
 */
public enum MappingSingleton {
    SINGLETON;

    /**
     * 默认构造对象
     * @return
     */
    public Mapper getDefaultMapper() {
        return DozerBeanMapperBuilder.buildDefault();
    }

}
