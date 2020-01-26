/* robomq
 * Abhishek khandelwal
 * 25-01-2020
 * day_6_assignment
 * JDBC Mobile Template
 */

//POJO class
package com.robomq.pojo;

public class Mobile {

	private Long id;
	private String name;
	private double price;
	private int quantity;
	private String description;
	
	//Default Constructor
	public Mobile() {
		// TODO Auto-generated constructor stub
	}
	
	//Constructor
	public Mobile(Long id, String name, double price, int quantity, String description) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
		this.quantity = quantity;
		this.description = description;
	}

	//Getter and Setter methods
	
	//get mobile ID
	public Long getId() {
		return id;
	}
	
	//set mobile id
	public void setId(Long id) {
		this.id = id;
	}
	
	//get mobile name
	public String getName() {
		return name;
	}
	
	//set mobile name
	public void setName(String name) {
		this.name = name;
	}
	
	//get mobile price
	public double getPrice() {
		return price;
	}
	
	//set mobile price
	public void setPrice(double price) {
		this.price = price;
	}
	
	//get mobile quantity
	public int getQuantity() {
		return quantity;
	}
	
	//set mobile quantity
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	//get mobile description
	public String getDescription() {
		return description;
	}
	
	//set mobile description
	public void setDescription(String description) {
		this.description = description;
	}
	
	//Overriding toString method 
	@Override
	public String toString()
	{
		return "name: " + name + "price: " + price + "quantity: " + quantity + "description: " + description; 
	}
}
