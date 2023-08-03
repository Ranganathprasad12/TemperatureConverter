package com.Tempclient.TempClient.clients;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;
import org.springframework.stereotype.Component;
import org.springframework.ws.client.core.support.WebServiceGatewaySupport;
import org.springframework.ws.soap.client.core.SoapActionCallback;

import com.Tempclient.TempClient.Conversion.CelsiusToFahrenheit;
import com.Tempclient.TempClient.Conversion.CelsiusToFahrenheitResponse;
import com.Tempclient.TempClient.Conversion.FahrenheitToCelsius;
import com.Tempclient.TempClient.Conversion.FahrenheitToCelsiusResponse;

@Component
public class SaopClient extends WebServiceGatewaySupport{
	
	    @Autowired
	    private Jaxb2Marshaller marshaller;

	    public double celsiusToFahrenheit(double celsius) {
	    
	        String url = "https://www.w3schools.com/xml/tempconvert.asmx?WSDL";

	        CelsiusToFahrenheit request = new CelsiusToFahrenheit();
	        request.setCelsius(String.valueOf(celsius));

	        CelsiusToFahrenheitResponse response = (CelsiusToFahrenheitResponse) getWebServiceTemplate()
	        		.marshalSendAndReceive(url, request, new SoapActionCallback("https://www.w3schools.com/xml/CelsiusToFahrenheit"));
	        return Double.parseDouble(response.getCelsiusToFahrenheitResult());
	    }

	    public double fahrenheitToCelsius(double fahrenheit) {
	        // Replace the URL with your actual web service URL
	        String url = "https://www.w3schools.com/xml/tempconvert.asmx?WSDL";

	        FahrenheitToCelsius request = new FahrenheitToCelsius();
	        request.setFahrenheit(String.valueOf(fahrenheit));

	        FahrenheitToCelsiusResponse response = (FahrenheitToCelsiusResponse) getWebServiceTemplate()
	        		.marshalSendAndReceive(url, request, new SoapActionCallback("https://www.w3schools.com/xml/FahrenheitToCelsius"));
	        return Double.parseDouble(response.getFahrenheitToCelsiusResult());

	        	    }
	}

