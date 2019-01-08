package dw.restclient.model;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Location implements Serializable {

	private final static long serialVersionUID = -3532048267747973846L;
	
	private String street;
	private String city;
	private String state;
	private String postcode;
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();
	
}
