package com.zjs.commons.model.po;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.persistence.Column;

/**
 * @desc 基础排序树PO类

 * @author daxiong
 * @since 18/12/2017 2:14 PM
 */
@Data
public abstract class BaseSortTreePO<PK> extends BaseTreePO<PK> implements SortTreePO<PK>{

	@ApiModelProperty(value = "排序值")
	@Column(name = "sort")
	private Integer sort;

}
