package com.panyk.jta.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

/**
 * <dl>
 * <dt>Db1Dao</dt>
 * <dd>Description:TODO</dd>
 * <dd>Copyright: Copyright (C) 2016</dd>
 * </dl>
 *
 * @author panyk
 */

@Repository
public class Db2Dao {
	@Autowired
	private JdbcTemplate jdbcTemplateB;
	
	public void insert() throws Exception{
		String sql = "insert into test2(operdate) values(now())";
		jdbcTemplateB.execute(sql);
	}
	
	public void insertWithError() throws Exception{
		String sql = "insert into test2(operdate) values(now())";
		jdbcTemplateB.execute(sql);
		throw new RuntimeException("这里抛出一个异常！");
	}
}
