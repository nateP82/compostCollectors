package com.compostcollectors.compostingAPI;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Period class
 * ROBO POJO generated class based on com.Posting API response for a time Period endpoint.
 * ex: http://compostingapi-env.eba-x3jcxyuh.us-east-2.elasticbeanstalk.com/composting/periodsv2/id/json
 */
public class Period{

	@JsonProperty("id")
	private int id;

	@JsonProperty("frequency")
	private int frequency;

	@JsonProperty("timeUnit")
	private String timeUnit;

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
	 * Set frequency.
	 *
	 * @param frequency the frequency
	 */
	public void setFrequency(int frequency){
		this.frequency = frequency;
	}

	/**
	 * Get frequency int.
	 *
	 * @return the int
	 */
	public int getFrequency(){
		return frequency;
	}

	/**
	 * Set time unit.
	 *
	 * @param timeUnit the time unit
	 */
	public void setTimeUnit(String timeUnit){
		this.timeUnit = timeUnit;
	}

	/**
	 * Get time unit string.
	 *
	 * @return the string
	 */
	public String getTimeUnit(){
		return timeUnit;
	}

	@Override
 	public String toString(){
		return 
			"Period{" + 
			"id = '" + id + '\'' + 
			",frequency = '" + frequency + '\'' + 
			",timeUnit = '" + timeUnit + '\'' + 
			"}";
		}
}