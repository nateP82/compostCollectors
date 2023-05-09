package com.compostcollectors.compostingAPI;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Price class
 * ROBO POJO generated class based on com.Posting API response for a Price endpoint.
 * ex: http://compostingapi-env.eba-x3jcxyuh.us-east-2.elasticbeanstalk.com/composting/pricesv2/id/json
 */
public class Price{

	@JsonProperty("unitType")
	private String unitType;

	@JsonProperty("perUnit")
	private Object perUnit;

	@JsonProperty("id")
	private int id;

	/**
	 * Set unit type.
	 *
	 * @param unitType the unit type
	 */
	public void setUnitType(String unitType){
		this.unitType = unitType;
	}

	/**
	 * Get unit type string.
	 *
	 * @return the string
	 */
	public String getUnitType(){
		return unitType;
	}

	/**
	 * Set per unit.
	 *
	 * @param perUnit the per unit
	 */
	public void setPerUnit(Object perUnit){
		this.perUnit = perUnit;
	}

	/**
	 * Get per unit object.
	 *
	 * @return the object
	 */
	public Object getPerUnit(){
		return perUnit;
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

	@Override
 	public String toString(){
		return 
			"Price{" + 
			"unitType = '" + unitType + '\'' + 
			",perUnit = '" + perUnit + '\'' + 
			",id = '" + id + '\'' + 
			"}";
		}
}