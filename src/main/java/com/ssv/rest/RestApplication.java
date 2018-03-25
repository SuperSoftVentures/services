package com.ssv.rest;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import javax.ws.rs.core.Application;

import com.ssv.rest.resources.Launchpad;
import com.ssv.rest.resources.User;

public class RestApplication extends Application {

	@Override
	public Set<Class<?>> getClasses() {
		return new HashSet<Class<?>>(Arrays.asList(Launchpad.class, User.class));		
	}

}
