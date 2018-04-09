package com.example.demo;


import static org.junit.Assert.assertThat;
import static org.hamcrest.Matchers.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoApplicationTests {

	@Autowired
	private DemoApplicationController demoApplicationController;

	@Test
	public void contextLoads() {
		assertThat("DemoApplicationController exists.", demoApplicationController, notNullValue());
	}

}
