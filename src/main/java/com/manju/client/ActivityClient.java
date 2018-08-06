package com.manju.client;

import java.util.List;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.GenericType;
import javax.ws.rs.core.MediaType;

import com.manju.model.Activity;

public class ActivityClient {
	
	private Client client;
	
	public ActivityClient()
	{
	client= ClientBuilder.newClient();
	}

		public  List<Activity> getList(String id) {
		
		WebTarget target=client.target("http://localhost:8080/BestBuy/webapi/");
				
		List<Activity> response= target.path("checkout/" + id).request(MediaType.APPLICATION_JSON).get(new GenericType<List<Activity>>() {});
			
		return response;		
	}
}
