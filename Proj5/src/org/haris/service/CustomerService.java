package org.haris.service;

import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;

@Path("/customer/service")

public class CustomerService {
     @GET
	 public void getCustomer()
	 {
		 System.out.println("CustomerService.getCustomer()");
	 }
     
     @PUT
     @Path("/create")
     public void createCustomer()
     {
    	 System.out.println("CustomerService.createCustomer()");
     }
     
     @POST
     public void updateUser()
     {
    	 System.out.println("CustomerService.updateUser()");
     }
     
     @DELETE
     @Path("/delete")
     public void deleteUser()
     {
    	 System.out.println("CustomerService.deleteUser()");
     }
}
