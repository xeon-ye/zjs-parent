package com.zjs.commons.service;

import com.zjs.commons.model.po.TreePO;

/**
 * @desc 树结构crud服务
 *
 * @author daxiong
 * @since 10/18/2017 18:31 PM
 */
public interface TreeCrudService<E extends TreePO, PK> extends
		CrudService<E, PK>,
		TreeSelectService<E, PK> {
}
