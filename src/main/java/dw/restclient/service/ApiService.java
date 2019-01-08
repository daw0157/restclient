package dw.restclient.service;

import java.util.List;

import dw.restclient.model.User;

public interface ApiService {

	List<User> getUsers(Integer limit);
	
}
