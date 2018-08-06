package com.manju.repository;

import java.util.ArrayList;
import java.util.List;

import com.manju.model.Activity;

public class ActivityRepositoryStub implements ActivityRepository {
	

	public  List<Activity> findActivities(String activityId){
	
		int len = activityId.length();
		double countA=0, countB=0, countC=0, countD=0, total=0, div=0, mod=0;
		double costA=0, costB=0, costC=0, costD=0; 
		List<Activity> activities = new ArrayList<>();
		
		for (int i = 0; i < len; ++i)
		{
		    char charAt = activityId.charAt(i);
		    if(charAt=='a'||charAt=='A')
		    	countA++;	    	
		    else if(charAt=='b'||charAt=='B')
		    	countB++;
		    else if(charAt=='c'||charAt=='C')
		    	countC++;
		    else if(charAt=='d'||charAt=='D')
		    	countD++;
		}
		if(countA>=3)
		{
			if(countC%3==0)
			{
				div=countA/3;
				costA=div*3;
			}
			else
			{
				mod=countA%3;
				costA=(((countA-mod)/3)*3)+mod;
			}
		}
		else
			costA=countA*1.25;
		costB=countB*4.25;
		if(countC>=6)
		{
			if(countC%6==0)
			{
				div=countC/6;
				costC=div*5;
			}
			else
			{
				mod=countC%6;
				costC=(((countC-mod)/6)*5)+mod;
			}
		}
		else
			costC=countC;
		costD=countD*0.75;
		total=costA+costB+costC+costD;
		Activity activity= new Activity();
		activity.setCountA(countA);
		activity.setCountB(countB);
		activity.setCountC(countC);
		activity.setCountD(countD);
		activity.setTotal(total);
		activities.add(activity);
		
		return activities;
		
	}
}
