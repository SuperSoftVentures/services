package com.ssv.rest.resources;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Path("/launchpad")
public class Launchpad {

	@GET
	public String getHelloWorld() {
		return "Hello World !!!";
	}
}
