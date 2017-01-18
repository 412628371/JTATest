package com.panyk.jta.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.panyk.jta.service.TestService;
import com.panyk.jta.service.TransactionalService;

/**
 * <dl>
 * <dt>TransactionalServiceImpl</dt>
 * <dd>Description:TODO</dd>
 * <dd>Copyright: Copyright (C) 2016</dd>
 * <dd>Company: 青牛（北京）技术有限公司</dd>
 * <dd>CreateDate: 2017年1月18日</dd>
 * </dl>
 *
 * @author panyk
 */

@Service
public class TransactionalServiceImpl implements TransactionalService {
	@Autowired
	private TestService testService;
	
	@Override
	public void insertRequiredNew() throws Exception {
		testService.insertDb2();
	}

}
