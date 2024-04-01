package com.topsoutherncoders.ytgetmeout;

import com.vaadin.flow.server.auth.AnonymousAllowed;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@AnonymousAllowed
@SpringBootApplication
public class YtGetMeOutApplication {

	public static void main(String[] args) {

		SpringApplication.run(YtGetMeOutApplication.class, args);
	}

}
