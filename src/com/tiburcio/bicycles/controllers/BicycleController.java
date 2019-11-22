package com.tiburcio.bicycles.controllers;

import java.util.List;

import javax.ejb.EJB;
import javax.enterprise.context.RequestScoped;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.tiburcio.bicycles.models.Bicycle;
import com.tiburcio.bicycles.services.BicycleBean;


@Path("/bicycles")
@RequestScoped
public class BicycleController {
	
	@EJB
	private BicycleBean bicycleBean;
	
	@GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Bicycle> listAllMembers() {
        return bicycleBean.findAll();
    }
	
}
