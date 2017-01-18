package com.panyk.jta.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.panyk.jta.dao.Db1Dao;
import com.panyk.jta.dao.Db2Dao;
import com.panyk.jta.service.TestService;
import com.panyk.jta.service.TransactionalService;

/**
 * <dl>
 * <dt>TestServiceImpl</dt>
 * <dd>Description:TODO</dd>
 * <dd>Copyright: Copyright (C) 2016</dd>
 * </dl>
 *
 * @author panyk
 */

@Service
public class TestServiceImpl implements TestService {
	@Autowired
	private Db1Dao db1Dao;
	@Autowired
	private Db2Dao db2Dao;
	@Autowired
	private TransactionalService transactionalService;
	
	
	@Override
	public void insertTest() throws Exception {
		db1Dao.insert();
		db2Dao.insert();
	}
	
	public void insertWithError() throws Exception{
		db1Dao.insert();
		db2Dao.insertWithError();
	}
	public void insertWithChildTransaction() throws Exception{
		db1Dao.insert();
		transactionalService.insertRequiredNew();//这里是新开启一个事务进行提交
		throw new RuntimeException("抛出异常，db2插入是子事务，需要成功，db1需要回滚。");
	}
	public void insertWithChildTransactionError() throws Exception{
		db1Dao.insert();
		this.insertDb2RequiredNew();
		throw new RuntimeException("抛出异常，db2插入是子事务，需要成功，db1需要回滚。"
				+ "但是，这里的写法有问题，一个service中的调用insertDb2RequiredNew根本没有开启新事务，"
				+ "所以，这里是全部回滚了。");
	}
	public void insertDb2() throws Exception{
		db2Dao.insert();
	}
	public void insertDb2RequiredNew() throws Exception{
		db2Dao.insert();
	}
}
