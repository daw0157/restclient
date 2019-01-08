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
public class Name implements Serializable {

	private final static long serialVersionUID = 420620315591775395L;
	
	private String title;
	private String first;
	private String last;
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();
	
}
