package com.i2tech.autowire;

public class laptopDTO {
	private Integer id;
    private String model;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	@Override
	public String toString() {
		return "laptopDTO [id=" + id + ", model=" + model + "]";
	}
    
}
