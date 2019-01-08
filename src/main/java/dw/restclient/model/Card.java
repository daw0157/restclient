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
public class Card implements Serializable {

	private final static long serialVersionUID = 6203456183354582742L;
	
	private String type;
	private Long number;
	private ExpirationDate expirationDate;
	private String iban;
	private String swift;
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();
	
}
