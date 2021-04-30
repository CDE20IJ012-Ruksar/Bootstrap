package com.cognizant.portfoliomanagement.WebPortal.Model;


import org.springframework.stereotype.Component;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Data
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Component
public class Asset {
	
	
	private int tid;
	
	
	
	private String assetid;
	
	private int portfolioid;
	
	private String type;
	
	private int units;
	
	
	

}
