/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data.service;

import javax.ejb.Stateless;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 *
 * @author Deschamps Sébastien
 */
@Stateless
@Path("api")
public class ApplicationFacadeREST {

    private static final String APP_VERSION = "1.0.0";

    public ApplicationFacadeREST() {
    }

    @GET
    @Path("status")
    @Produces(MediaType.TEXT_PLAIN)
    public String returnStatus() {
        return "it works";
    }

    @GET
    @Path("version")
    @Produces(MediaType.TEXT_PLAIN)
    public String returnVersion() {
        return APP_VERSION;
    }

/*    @GET
    @Path("doc")
    @Produces(MediaType.TEXT_PLAIN)
    public String returnDoc() {
        return doc;
    }*/
}
