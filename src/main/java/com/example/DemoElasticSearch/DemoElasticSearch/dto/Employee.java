package com.example.DemoElasticSearch.DemoElasticSearch.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Employee {
	 @JsonProperty("FirstName")
	    private String firstName;

	    @JsonProperty("LastName")
	    private String lastName;

	    @JsonProperty("Designation")
	    private String designation;

	    @JsonProperty("Salary")
	    private float salary;

	    @JsonProperty("DateOfJoining")
	    private String dateOfJoining;

	    @JsonProperty("Address")
	    private String address;

	    @JsonProperty("Gender")
	    private String gender;

	    @JsonProperty("Age")
	    private Integer age;

	    @JsonProperty("MaritalStatus")
	    private String maritalStatus;

	    @JsonProperty("Interests")
	    private String interests;

	    @JsonProperty("id")
	    private Integer id;

}
