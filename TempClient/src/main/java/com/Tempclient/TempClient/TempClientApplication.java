package com.Tempclient.TempClient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Primary;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;

import com.Tempclient.TempClient.clients.SaopClient;

@SpringBootApplication
@ComponentScan(basePackages = {"com.Tempclient.TempClient", "com.otherpackage"})
public class TempClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(TempClientApplication.class, args);
		
		
		
	}
	@Primary
		@Bean
	    public SaopClient saopClientforBean(Jaxb2Marshaller marshaller) {
	        SaopClient client = new SaopClient();
	        client.setDefaultUri("https://www.w3schools.com/xml/tempconvert.asmx"); 
	        client.setMarshaller(marshaller);
	        client.setUnmarshaller(marshaller);
	        return client;
	    }

//	    @Bean
//	    public Jaxb2Marshaller marshaller() {
//	        Jaxb2Marshaller marshaller = new Jaxb2Marshaller();
//	        marshaller.setPackagesToScan("com.Tempclient.TempClient.Conversion");
//	        return marshaller;
//	}

}
