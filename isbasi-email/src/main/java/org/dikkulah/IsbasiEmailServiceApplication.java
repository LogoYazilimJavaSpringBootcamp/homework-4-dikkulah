package org.dikkulah;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class IsbasiEmailServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(IsbasiEmailServiceApplication.class, args);


	}

}
