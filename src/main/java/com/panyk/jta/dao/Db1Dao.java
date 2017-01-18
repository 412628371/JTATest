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
public class Db1Dao {
	@Autowired
	private JdbcTemplate jdbcTemplateA;
	
	public void insert() throws Exception{
		String sql = "insert into test1(operdate) values(now())";
		jdbcTemplateA.execute(sql);
	}
}
