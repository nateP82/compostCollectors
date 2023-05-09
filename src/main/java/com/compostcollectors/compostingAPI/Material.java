package com.compostcollectors.compostingAPI;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Material class
 * ROBO POJO generated class based on com.Posting API response for a Materials endpoint
 * ex: http://compostingapi-env.eba-x3jcxyuh.us-east-2.elasticbeanstalk.com/composting/materialsv2/id/json
 */
public class Material{

	@JsonProperty("comments")
	private String comments;

	@JsonProperty("name")
	private String name;

	@JsonProperty("id")
	private int id;

	/**
	 * Set comments.
	 *
	 * @param comments the comments
	 */
	public void setComments(String comments){
		this.comments = comments;
	}

	/**
	 * Get comments string.
	 *
	 * @return the string
	 */
	public String getComments(){
		return comments;
	}

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
			"Material{" + 
			"comments = '" + comments + '\'' + 
			",name = '" + name + '\'' + 
			",id = '" + id + '\'' + 
			"}";
		}
}