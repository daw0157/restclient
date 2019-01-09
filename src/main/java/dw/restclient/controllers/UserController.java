package dw.restclient.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.server.ServerWebExchange;

import dw.restclient.service.ApiService;

@Controller
public class UserController {
	
	private ApiService apiService;

	public UserController(ApiService apiService) {
		super();
		this.apiService = apiService;
	}
	
	@GetMapping({"", "/", "/index"})
	public String index() {
		return "index";
	}
	
	@PostMapping("/users")
	public String formPost(Model model, ServerWebExchange serverWebExchange) {
		model.addAttribute("users", apiService.getUsers(serverWebExchange
													.getFormData()
													.map(data -> new Integer(data.getFirst("limit")))));
		
		return "userlist";
	}

}
