package hateoas;

import java.net.InetAddress;
import java.net.UnknownHostException;

import org.springframework.hateoas.ResourceSupport;
import org.springframework.http.HttpHeaders;

public class Greeting extends ResourceSupport {
	private String name;
	private HttpHeaders headers;

	public Greeting() {
		name = "World!";
	}
	
	public Greeting(String name) {
		this.name = name;
	}

	public Greeting(HttpHeaders headers) {
		this();
		this.headers = headers;
	}

	public String getGreeting() {
		return "Hello " + name;
	}

	public String getHost() throws UnknownHostException {
		return InetAddress.getLocalHost().getHostAddress();
	}

	public HttpHeaders getHeaders() {
		return headers;
	}
}