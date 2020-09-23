package br.com.dh.lojaonline.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FirstController {
	@RequestMapping(method = RequestMethod.GET, path = "/boasVindas")
	
	public String hello() { 
	return "Hello";
	}
}
