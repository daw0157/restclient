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
public class Job implements Serializable {

	private final static long serialVersionUID = -4985150429002262656L;
	
	private String title;
	private String company;
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();

}
