package hateoas;

import static org.springframework.hateoas.mvc.ControllerLinkBuilder.linkTo;
import static org.springframework.hateoas.mvc.ControllerLinkBuilder.methodOn;

import org.springframework.http.HttpHeaders;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApplicationController {

	@RequestMapping("/")
	public Greeting root(@RequestHeader HttpHeaders headers) {
		Greeting customer = new Greeting(headers);
		customer.add(linkTo(methodOn(ApplicationController.class).root(headers)).withSelfRel());
		return customer;
	}
	
	@RequestMapping("/greeting")
	public Greeting greeting() {
		Greeting customer = new Greeting();
		customer.add(linkTo(methodOn(ApplicationController.class).greeting()).withSelfRel());
		return customer;
	}
	
	@RequestMapping("/greeting/{name}")
	public Greeting greeting(@PathVariable(value = "name") String name) {
		Greeting customer = new Greeting(name);
		customer.add(linkTo(methodOn(ApplicationController.class).greeting(name)).withSelfRel());
		return customer;
	}
}