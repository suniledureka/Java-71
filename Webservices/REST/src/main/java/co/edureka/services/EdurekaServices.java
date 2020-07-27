package co.edureka.services;

import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;

@Path("/edureka")
public class EdurekaServices {
	@GET
	@Produces("text/html")
	public String localService() {
		return "<h2>Customer Service for India</h2>";
	}

	@GET
	@Produces("text/html")
	@Path("/intl")
	public String internationalService() {
		return "<h2>International Customer Service</h2>";
	}

	@GET
	@Produces("text/html")
	@Path("{name}/{course}")
	public String getCourseDetails(@PathParam("name") String custName, @PathParam("course") String course) {
		String response = "<h2>Customer Name - " + custName + "<br><br>Course - " + course + "</h2>";
		return response;
	}

	@GET
	@Produces("text/html")
	@Path("/enquiry")
	public String enquiry(@QueryParam("name") String name, @QueryParam("course") String crs) {
		String output = "<h2>Customer Name : " + name + "<br><br>Course Name : " + crs + "</h2>";
		return output;
	}

	@POST
	@Produces("text/html")
	@Path("/registerCustomer")
	public String registerNewUser(@FormParam("name") String name, @FormParam("age") String age,
			@FormParam("addr") String address) {
		String output = "<div style=color:red;font-size:25px;>Registration Success::<br> Name - <u>" + name
				+ "</u><br> Age - <u>" + age + "</u><br>Address - <u>" + address + "</u><hr></div>";
		return output;
	}

	@GET
	@Produces("application/json")
	@Path("/jsonresponse")
	public String method1() {
		return "{\"empno\":\"101\", \"ename\":\"Sunil\", \"sal\":\"1234\"}";
	}
}
