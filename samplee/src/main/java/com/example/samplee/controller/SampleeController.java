package com.example.samplee.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.samplee.model.Samplee;
import com.example.samplee.repository.SampleeRepository;
import com.example.samplee.service.SampleeService;

@RestController
public class SampleeController {
	@Autowired
	SampleeService oo;
	@Autowired
	SampleeRepository of;
	
	
	@GetMapping(value="/hello")
	public List<Samplee> getDetails()
	{
		return oo.getDetails();
	}
	
	
	@PostMapping(value="/hii")
	public String jk(@RequestBody Samplee g)
	{
		of.save(g);
		return "saved";
	}
	
	
	@PutMapping(value="/hoo")
	public String ss(@RequestBody Samplee o)
	{
		of.save(o);
		return "updated";
	}
	
	
	@DeleteMapping(value="/joo/{Id}")
	public String deleteById(@PathVariable int Id)
	{
		of.deleteById(Id);
		return "deleted";
	}
}
