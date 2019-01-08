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
public class User implements Serializable {
	
	private final static long serialVersionUID = 270727596527329664L;
	
	private String gender;
	private Name name;
	private Location location;
	private String email;
	private Login login;
	private String phone;
	private Job job;
	private Billing billing;
	private String language;
	private String currency;
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();
}
