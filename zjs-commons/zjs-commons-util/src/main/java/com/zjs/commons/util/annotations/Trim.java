package com.zjs.commons.util.annotations;

import com.zjs.commons.util.convert.BeanFieldConverter;
import org.apache.commons.lang3.StringUtils;

import java.lang.annotation.*;

/**
 * @desc 字符串去两边空格
 *
 * @author daxiong
 * @since 2018/9/16
 */
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface Trim {

    /**
     * 转换器
     */
    class Converter implements BeanFieldConverter<Trim, String> {

        @Override
        public void initialize(Trim ann) {

        }

        @Override
        public boolean isNeedConvert(String field) {
            if (StringUtils.isEmpty(field)) {
                return false;
            }
            return field.startsWith(" ") || field.endsWith(" ");
        }

        @Override
        public String convert(String field) {
            return field.trim();
        }
    }

}
