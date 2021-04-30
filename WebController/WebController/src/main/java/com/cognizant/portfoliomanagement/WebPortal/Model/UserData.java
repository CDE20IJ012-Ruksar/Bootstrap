package com.cognizant.portfoliomanagement.WebPortal.Model;

import org.springframework.stereotype.Component;



/** Model class for the business details */

import lombok.AllArgsConstructor;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;



@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Component
public class UserData {

	private String userid;
	
	private String upassword;
	
	private String uname;
	
	private String authToken;

	
}
