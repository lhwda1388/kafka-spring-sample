package com.sample.kfc.listener;

import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class ApiListener {
	
	@KafkaListener(id = "test-group", topics = "test")
	public void listen(String data) {
		System.out.println("test : " + data);
	}
	
	
}
