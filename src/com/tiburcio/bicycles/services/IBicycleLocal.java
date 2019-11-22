package com.tiburcio.bicycles.services;

import java.util.List;

import javax.ejb.Local;

import com.tiburcio.bicycles.models.Bicycle;

@Local
public interface IBicycleLocal {
	public List<Bicycle> findAll();
}
