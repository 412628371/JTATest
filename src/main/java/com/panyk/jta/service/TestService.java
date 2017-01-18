package com.panyk.jta.service;
/**
 * <dl>
 * <dt>TestService</dt>
 * <dd>Description:TODO</dd>
 * <dd>Copyright: Copyright (C) 2016</dd>
 * </dl>
 *
 * @author panyk
 */


public interface TestService {
	void insertTest() throws Exception;
	void insertDb2() throws Exception;
	void insertWithError() throws Exception;
	void insertWithChildTransaction() throws Exception;
	void insertWithChildTransactionError() throws Exception;
	void insertDb2RequiredNew() throws Exception;
	
}
