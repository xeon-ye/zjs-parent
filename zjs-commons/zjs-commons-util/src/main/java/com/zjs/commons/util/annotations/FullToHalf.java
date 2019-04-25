package com.zjs.commons.util.annotations;



import com.zjs.commons.util.AsciiUtils;
import com.zjs.commons.util.convert.BeanFieldConverter;

import java.lang.annotation.*;

/**
 * @desc 半角替全角
 *
 * @author daxiong
 * @since 2018/9/16
 */
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface FullToHalf {

    /**
     * 转换器
     */
    class Converter implements BeanFieldConverter<FullToHalf, String> {

        @Override
        public void initialize(FullToHalf ann) {

        }

        @Override
        public boolean isNeedConvert(String field) {
            return AsciiUtils.existFullChar(field);
        }

        @Override
        public String convert(String field) {
            return AsciiUtils.full2Half(field);
        }
    }
}
