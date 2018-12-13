/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.primo.service;

import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.Consumes;
import javax.ws.rs.Produces;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PUT;
import javax.ws.rs.core.MediaType;

/**
 * REST Web Service
 *
 * @author Usuario
 */
@Path("Persona")
public class PersonaResource {

    @Context
    private UriInfo context;

    /**
     * Creates a new instance of PersonaResource
     */
    public PersonaResource() {
    }

    /**
     * Retrieves representation of an instance of co.com.primo.service.PersonaResource
     * @return an instance of java.lang.String
     */
    @GET
    @Produces(MediaType.APPLICATION_XML)
    public String getXml() {
        //TODO return proper representation object
        return "<datos>Prueba</datos>";
    }

    /**
     * PUT method for updating or creating an instance of PersonaResource
     * @param content representation for the resource
     */
    @PUT
    @Consumes(MediaType.APPLICATION_XML)
    public void putXml(String content) {
    }
    
    @GET
    @Path("/crearPersonas")
    @Produces(MediaType.APPLICATION_XML)
    public String crearPersona(){
        System.out.println("LLegue");
        return "<datos>Creado</datos>";
    }
}
