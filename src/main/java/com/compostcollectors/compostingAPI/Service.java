package com.compostcollectors.compostingAPI;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Service class
 * ROBO POJO generated class based on com.Posting API response for a Service endpoint
 * ex: http://compostingapi-env.eba-x3jcxyuh.us-east-2.elasticbeanstalk.com/composting/servicesv2/id/json
 */
public class Service{

	@JsonProperty("name")
	private String name;

	@JsonProperty("description")
	private String description;

	@JsonProperty("id")
	private int id;

	/**
	 * Set name.
	 *
	 * @param name the name
	 */
	public void setName(String name){
		this.name = name;
	}

	/**
	 * Get name string.
	 *
	 * @return the string
	 */
	public String getName(){
		return name;
	}

	/**
	 * Set description.
	 *
	 * @param description the description
	 */
	public void setDescription(String description){
		this.description = description;
	}

	/**
	 * Get description string.
	 *
	 * @return the string
	 */
	public String getDescription(){
		return description;
	}

	/**
	 * Set id.
	 *
	 * @param id the id
	 */
	public void setId(int id){
		this.id = id;
	}

	/**
	 * Get id int.
	 *
	 * @return the int
	 */
	public int getId(){
		return id;
	}

	/**
	 * equals method
	 * @param o an object parameter passed for comparison
	 * @return - an object based on an Id
	 */

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (!(o instanceof Service)) return false;
		Service service = (Service) o;
		return getId() == service.getId() && getName().equals(service.getName()) && getDescription().equals(service.getDescription());
	}

	/**
	 * hashCode
	 * @return int
	 */
	@Override
	public int hashCode() {
		return Objects.hash(getName(), getDescription(), getId());
	}

	/**
	 * toString method
	 * returns a string of information about a Service object
	 * @return Service object
	 */
	@Override
 	public String toString(){
		return 
			"Service{" + 
			"name = '" + name + '\'' + 
			",description = '" + description + '\'' + 
			",id = '" + id + '\'' + 
			"}";
		}
}