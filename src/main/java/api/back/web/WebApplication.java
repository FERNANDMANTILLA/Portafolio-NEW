package api.back.web;

import com.mongodb.client.*;
import com.mongodb.client.MongoDatabase;

import org.apache.catalina.session.StandardSession;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.core.MongoAdmin;

@SpringBootApplication
@EnableAutoConfiguration
public class WebApplication {

	public static void main(String[] args) {
		SpringApplication.run(WebApplication.class, args);

	}

}
