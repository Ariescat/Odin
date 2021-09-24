package com.mmorpg.logic.modules.activity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author Ariescat
 * @version 2020/2/26 14:41
 */
@Component
public class ActivityService implements IActivityService {

	@Autowired
	private IActivityService2 activityService2;

	@Override
	public void reqInfo() {
		System.err.println("reqInfo");
	}
}
