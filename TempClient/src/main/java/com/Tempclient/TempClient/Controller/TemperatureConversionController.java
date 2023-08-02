package com.Tempclient.TempClient.Controller;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.Tempclient.TempClient.clients.SaopClient;

@RestController
public class TemperatureConversionController {

    @Autowired
    private SaopClient soapClient;

    @GetMapping("/convert/celsius-to-fahrenheit")
    public double convertCelsiusToFahrenheit(@RequestParam double celsius) {
        return soapClient.celsiusToFahrenheit(celsius);
    }

    @GetMapping("/convert/fahrenheit-to-celsius")
    public double convertFahrenheitToCelsius(@RequestParam double fahrenheit) {
        return soapClient.fahrenheitToCelsius(fahrenheit);
    }
}


