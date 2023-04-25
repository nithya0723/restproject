package com.example.samplee.model;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Samplee {
	@Id
	public int Sno;
	public String Brand;
	public String Model;
	public String Display;
	public String Processor;
	public String Storage;
	public String Random_Acess_Memory;
	public String Operating_System;
	public String Battery_Capacity;
	public int getSno() {
		return Sno;
	}
	public void setSno(int sno) {
		Sno = sno;
	}
	public String getBrand() {
		return Brand;
	}
	public void setBrand(String brand) {
		Brand = brand;
	}
	public String getModel() {
		return Model;
	}
	public void setModel(String model) {
		Model = model;
	}
	public String getDisplay() {
		return Display;
	}
	public void setDisplay(String display) {
		Display = display;
	}
	public String getProcessor() {
		return Processor;
	}
	public void setProcessor(String processor) {
		Processor = processor;
	}
	public String getStorage() {
		return Storage;
	}
	public void setStorage(String storage) {
		Storage = storage;
	}
	public String getRandom_Acess_Memory() {
		return Random_Acess_Memory;
	}
	public void setRandom_Acess_Memory(String random_Acess_Memory) {
		Random_Acess_Memory = random_Acess_Memory;
	}
	public String getOperating_System() {
		return Operating_System;
	}
	public void setOperating_System(String operating_System) {
		Operating_System = operating_System;
	}
	public String getBattery_Capacity() {
		return Battery_Capacity;
	}
	public void setBattery_Capacity(String battery_Capacity) {
		Battery_Capacity = battery_Capacity;
	}
}
