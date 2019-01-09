package dw.restclient.service;

import java.util.List;

import dw.restclient.model.User;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface ApiService {

	List<User> getUsers(Integer limit);
	
	Flux<User> getUsers(Mono<Integer> limit);
	
}
