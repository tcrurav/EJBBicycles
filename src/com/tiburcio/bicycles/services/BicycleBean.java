package com.tiburcio.bicycles.services;

import java.util.List;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import com.tiburcio.bicycles.models.Bicycle;

@Stateless
@LocalBean
public class BicycleBean 
	implements IBicycleLocal
//, IBicycleRemote,

{
	
	@PersistenceContext(unitName="EJBBicycles")
	private EntityManager em;
	
//	@Override
	public List<Bicycle> findAll(){
        Query query = em.createQuery("FROM Bicycle");
 
        List<Bicycle> list = query.getResultList();
        return list;
 
    }
}
