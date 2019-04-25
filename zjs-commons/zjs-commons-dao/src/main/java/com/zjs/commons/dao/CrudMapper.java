package com.zjs.commons.dao;

/**
 * @author daxiong
 * @desc 基础增删改查功能mapper
 */
public interface CrudMapper<T> extends
		InsertMapper<T>,
		DeleteMapper<T>,
		UpdateMapper<T>,
		SelectMapper<T> {
}
