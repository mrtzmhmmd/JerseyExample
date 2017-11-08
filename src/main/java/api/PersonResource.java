package api;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

import dao.PersonEntityManager;
import model.Person;

@Path("/person")
public class PersonResource {

	@Path("/add")
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	public void add(Person person) {
		PersonEntityManager.add(person);
	}

	@Path("/delete")
	@DELETE
	public void delete(@QueryParam("id") String id) {
		PersonEntityManager.delete(Integer.valueOf(id));
	}

	@Path("/edit")
	@PUT
	@Consumes(MediaType.APPLICATION_JSON)
	public void update(Person person) {
		PersonEntityManager.update(person);
	}

	@Path("/getById")
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public Person getById(@QueryParam("id") String id) {
		return PersonEntityManager.getPerson(Integer.valueOf(id));
	}
}