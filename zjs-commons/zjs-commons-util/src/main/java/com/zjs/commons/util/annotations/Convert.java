package com.zjs.commons.util.annotations;

import java.lang.annotation.*;

/**
 * @desc 标记在对象/集合属性上
 *
 * @author daxiong
 * @since 2018/9/16
 */
@Target({ElementType.FIELD, ElementType.PARAMETER})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface Convert {

}