package com.zjs.commons.service.impl;

import com.zjs.commons.model.Model;
import com.zjs.commons.model.po.PO;
import com.zjs.commons.model.qo.PageQO;
import com.zjs.commons.model.vo.PageVO;
import com.zjs.commons.service.RestfulCrudService;
import com.zjs.commons.validator.CreateGroup;
import com.zjs.commons.validator.UpdateGroup;
import org.springframework.http.HttpStatus;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;

import java.util.List;
import java.util.Set;

public class RestfulCrudServiceImpl<E extends PO<PK>, PK> extends BaseMySqlCrudServiceImpl<E, PK> implements RestfulCrudService<E, PK> {

	@ResponseStatus(HttpStatus.CREATED)
	@Override
	public E add(@Validated(CreateGroup.class) @RequestBody E record) {
		PK id = super.insert(record);
		if (id != null) {
			return super.selectByPk(id);
		}
		return null;
	}

	@ResponseStatus(HttpStatus.NO_CONTENT)
	@Override
	public int deleteById(@PathVariable("id") PK id) {
		return super.deleteByPk(id);
	}

	@Override
	public E updateByIdSelective(@Validated(UpdateGroup.class) @PathVariable("id") PK id, @RequestBody E record) {
		super.updateByPkSelective(id, record);
		return super.selectByPk(id);
	}

	@Override
	public E updateById(@PathVariable("id") PK id, @RequestBody E record) {
		super.updateByPk(id, record);
		return super.selectByPk(id);
	}

	@Override
	public E getById(@PathVariable("id") PK id) {
		return super.selectByPk(id);
	}

	@Override
	public List<E> getByIds(@RequestParam("id") Set<PK> ids) {
		return super.selectByPks(ids);
	}

	@Override
	public PageVO<E> getPage(@RequestBody PageQO<? extends Model> pageQO) {
		return super.selectPage(pageQO);
	}

}
