package com.sample.kfp.controller;

import org.apache.kafka.clients.producer.Producer;
import org.apache.kafka.clients.producer.ProducerConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApiController {

	
	@Autowired
	private KafkaTemplate<String, String> template;
	
	
	@GetMapping(path = "/send/{msg}")
	public void sendMsg(@PathVariable String msg) {
		this.template.send("test", msg);
	}
	
}
