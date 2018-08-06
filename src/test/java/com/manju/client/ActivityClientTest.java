package com.manju.client;

import static org.junit.Assert.assertNotNull;

import java.util.List;

import org.junit.Test;

import com.manju.model.Activity;

public class ActivityClientTest {

	@Test
	public void test1() {
		
		ActivityClient client= new ActivityClient();
		List<Activity> activity =client.getList("abcdaba");
		assertNotNull(activity);
	}
	@Test
	public void test2() {
		
		ActivityClient client= new ActivityClient();
		List<Activity> activity =client.getList("ccccccc");
		assertNotNull(activity);
	}
	@Test
	public void test3() {
		
		ActivityClient client= new ActivityClient();
		List<Activity> activity =client.getList("abcd");
		assertNotNull(activity);
	}
	
}
