package com.manju.repository;

import java.util.List;

import com.manju.model.Activity;

public interface ActivityRepository {

	List<Activity> findActivities(String activityId);


}