package com.manju;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.manju.model.Activity;
import com.manju.repository.ActivityRepository;
import com.manju.repository.ActivityRepositoryStub;

@Path("/checkout")
public class ActivityResource {
	
	private ActivityRepository activityRepository= new ActivityRepositoryStub();
			
	@GET
	@Path("{activityId}")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
		public List<Activity> getAllActivities(@PathParam("activityId") String activityId){
			return activityRepository.findActivities(activityId);
		}
	
}
