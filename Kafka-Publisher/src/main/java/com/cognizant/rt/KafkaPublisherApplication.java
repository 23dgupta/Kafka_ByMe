package com.cognizant.rt;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.kafka.annotation.EnableKafka;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class KafkaPublisherApplication {
	
	@Autowired
	private KafkaTemplate<String,Object> template;
	
	private String topic="spring-kafka";
	
	//http://localhost:9091/publish/dk

	@GetMapping("publish/{name}")
	public String publishMessage(@PathVariable String  name)
	{
		
		//template.send("spring-kafka","Hi"+name);
		template.send(topic,"Hi , Welcome to Kafka World : "+name);//
		return "Data has been published";
	}
	
	
	@GetMapping("/publishjson")
	public String publishMessage()
	{
		User user=new User(101,"Durgeshkumar",new String[] {"Mumbai","Central mumbai","Thane"});
		//template.send("spring-kafka","Hi"+name);
		template.send(topic, user);//
		return "User Data has been published";
	}
	public static void main(String[] args) {
		SpringApplication.run(KafkaPublisherApplication.class, args);
	}

}
