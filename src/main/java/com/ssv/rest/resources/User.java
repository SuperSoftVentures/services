package com.ssv.rest.resources;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Application;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.SecurityContext;

import com.ssv.rest.entity.UserEntity;

@Path("/user")
public class User extends Application {

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public UserEntity getUser(@Context SecurityContext context) {
		UserEntity user = new UserEntity();
		user.id = context.getUserPrincipal().getName();
		// TODO Read rest of the fields from DB
		user.displayName = "Manish Joshi";
		user.firstName = "Manish";
		user.lastName = "Joshi";
		user.companyCode = "SAP001";
		return user;
	}
}
