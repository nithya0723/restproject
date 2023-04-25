package com.example.samplee.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.samplee.model.Samplee;
import com.example.samplee.repository.SampleeRepository;

@Service 

public class SampleeService {
	@Autowired
	SampleeRepository ri;
	
	public List<Samplee> getDetails(){
	List<Samplee> no = ri.findAll();
	return no;
	}
	public Samplee saveSamplee(Samplee d)
	{
		return ri.save(d);
	}
}

