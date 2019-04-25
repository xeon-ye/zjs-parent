package com.zjs.commons.dao;

import tk.mybatis.mapper.common.Marker;
import tk.mybatis.mapper.common.MySqlMapper;
import tk.mybatis.mapper.common.base.insert.InsertSelectiveMapper;

/**
 * @author daxiong
 * @desc 基础插入功能mapper
 */
public interface InsertMapper<T> extends Marker,
		tk.mybatis.mapper.common.base.insert.InsertMapper<T>,
        InsertSelectiveMapper<T>,
        MySqlMapper<T> {
}
