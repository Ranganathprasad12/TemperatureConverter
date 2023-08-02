package com.Tempclient.TempClient.celsius;



import javax.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "FahrenheitToCelsius")
public class FahrenheitToCelsius {

    @XmlElement(name = "Fahrenheit")
    private double fahrenheit;

    public double getFahrenheit() {
        return fahrenheit;
    }

    public void setFahrenheit(double fahrenheit) {
        this.fahrenheit = fahrenheit;
    }
}

