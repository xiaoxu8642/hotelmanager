package com.bjsxt.hotelmanager;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class HotelmanagerApplicationTests {

	@Test
	public void contextLoads() {

	}
	@Test
	public void ininDb(){
		System.out.println("加载数据库");
	}

}
