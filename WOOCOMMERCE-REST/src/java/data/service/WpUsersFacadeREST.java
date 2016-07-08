/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data.service;

import data.WpUsers;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.*;
/*import java.sql.*;
import data.dao.MysqlConnection;
import java.util.ArrayList;*/

/**
 *
 * @author Deschamps Sébastien
 */
@Stateless
@Path("wpusers")
public class WpUsersFacadeREST extends AbstractFacade<WpUsers> {

    @PersistenceContext(unitName = "WOOCOMMERCE-RESTPU")
    private EntityManager em;

    public WpUsersFacadeREST() {
        super(WpUsers.class);
    }

    @GET
    @Path("{id}")
    @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
    public WpUsers find(@PathParam("id") Long id) {
        return super.find(id);
    }

    @GET
    @Override
    @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
    public List<WpUsers> findAll() {
        return super.findAll();
    }

    @GET
    @Path("{from}/{to}")
    @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
    public List<WpUsers> findRange(@PathParam("from") Integer from, @PathParam("to") Integer to) {
        return super.findRange(new int[]{from, to});
    }

    @GET
    @Path("email")
    @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
    public List<WpUsers> findAllEmail() {
        return super.findAllEmail();
    }

/*    @GET
    @Path("emailz")
    @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
    public List<String> findAllEmailz() throws Exception {
        Connection conn = null;
        PreparedStatement query = null;
        List<String> results = new ArrayList<>();
//        String returnString = null;
        
        try {
            conn = MysqlConnection.MysqlConnection().getConnection();
            query = conn.prepareStatement("SELECT user_email FROM wp_users");
            ResultSet rs = query.executeQuery();
            
            while (rs.next()) {
                System.out.println(rs.getString(1));
                results.add(rs.getString(1));
            }
            conn.close();
        }
        catch (Exception e) {
            e.printStackTrace();
        } 
        finally {
            if(conn != null) conn.close();
        }
        return results;
    }*/

    @GET
    @Path("count")
    @Produces(MediaType.TEXT_PLAIN)
    public String countREST() {
        return String.valueOf(super.count());
    }

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }    
}
