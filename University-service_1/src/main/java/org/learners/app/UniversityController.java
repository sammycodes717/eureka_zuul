package org.learners.app;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

@RestController
@RequestMapping("/api")
@PropertySource("{college}")
public class UniversityController {
	
	@Autowired
	RestTemplate restTemplate;
	
	@Value("{url}")
	String url;

	@GetMapping(value = "/get")
	public String createUser() throws JsonParseException, JsonMappingException, IOException {
		
		//Feign Problem 1
		//calling Rest Service of college with Rest Template
		
		String data = restTemplate.getForObject(url, String.class);
		
		//calling 
		Object obj = new ObjectMapper().readValue(data, Object.class);
		
		return "created User";
		
	}
}
