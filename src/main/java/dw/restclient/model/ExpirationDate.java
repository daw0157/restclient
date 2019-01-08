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
public class ExpirationDate implements Serializable {

	private final static long serialVersionUID = 4661228813349752965L;
	
	private String date;
	private Integer timezoneType;
	private String timezone;
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();
	
}
