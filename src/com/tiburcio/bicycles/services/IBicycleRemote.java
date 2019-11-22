package com.tiburcio.bicycles.services;

import java.util.List;

import javax.ejb.Local;
import javax.ejb.Remote;

import com.tiburcio.bicycles.models.Bicycle;

@Remote
public interface IBicycleRemote {
	public List<Bicycle> findAll();
}
