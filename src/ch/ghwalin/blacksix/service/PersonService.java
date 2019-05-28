package ch.ghwalin.blacksix.service;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

/**
 * services to read / write person
 * <p>
 * Black Six
 *
 * @author Marcel Suter
 * @version 0.1
 * @since 2019-03-04
 */

@Path("person")
public class PersonService {
    public PersonService() {

    }

    /**
     * reads a person identified by id
     * @param personId
     * @return  Response with person object
     */
    @GET
    @Path("read")
    @Produces(MediaType.APPLICATION_JSON)
    public Response readPerson(
            @QueryParam("id") String personId
    ) {
        return Response
                .status(200)
                .header("Access-Control-Allow-Origin", "*")
                .header("Access-Control-Allow-Credentials", "true")
                .header("Access-Control-Allow-Headers",
                        "origin, content-type, accept, authorization")
                .header("Access-Control-Allow-Methods",
                        "GET, POST, DELETE")
                .entity("")
                .build();
    }

    /**
     * lists all people matching the filter
     * @param filter  search filter for the list
     * @return  Response with person object
     */
    @GET
    @Path("list")
    @Produces(MediaType.APPLICATION_JSON)
    public Response listPeople(
            @QueryParam("filter") String filter
    ) {
        return Response
                .status(200)
                .header("Access-Control-Allow-Origin", "*")
                .header("Access-Control-Allow-Credentials", "true")
                .header("Access-Control-Allow-Headers",
                        "origin, content-type, accept, authorization")
                .header("Access-Control-Allow-Methods",
                        "GET, POST, DELETE")
                .entity("")
                .build();
    }

    /**
     * write a new or changed person
     * @param personId
     * @param licenseNo
     * @param firstname
     * @param lastname
     * @param clubUUID
     * @param clubName
     * @return  Response with the status
     */
    @POST
    @Path("write")
    @Produces(MediaType.APPLICATION_JSON)
    public Response writePerson(
            @QueryParam("id") String personId,
            @FormParam("licenseNo") String licenseNo,
            @FormParam("firstname") String firstname,
            @FormParam("lastname") String lastname,
            @FormParam("clubUUID") String clubUUID,
            @FormParam("clubName") String clubName
    ) {
        return Response
                .status(200)
                .header("Access-Control-Allow-Origin", "*")
                .header("Access-Control-Allow-Credentials", "true")
                .header("Access-Control-Allow-Headers",
                        "origin, content-type, accept, authorization")
                .header("Access-Control-Allow-Methods",
                        "GET, POST, DELETE")
                .entity("")
                .build();
    }
}
