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
public class Billing implements Serializable {

	private final static long serialVersionUID = 6577338081290507077L;
	
	private Card card;
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();
	
}
