package com.panyk.jta.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:applicationContext.xml")
public class TestServiceTest {
	@Autowired
	private TestService testService;

	@Test
	public void insert(){
		try {
			testService.insertTest();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	@Test
	public void insertWithError(){
		try {
			testService.insertWithError();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	@Test
	public void insertWithChildTransaction(){
		try {
			testService.insertWithChildTransaction();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	@Test
	public void insertWithChildTransactionError(){
		try {
			testService.insertWithChildTransactionError();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
}
