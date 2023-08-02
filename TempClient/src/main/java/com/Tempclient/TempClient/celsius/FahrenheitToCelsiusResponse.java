package com.Tempclient.TempClient.celsius;



import javax.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "FahrenheitToCelsiusResponse")
public class FahrenheitToCelsiusResponse {

    @XmlElement(name = "FahrenheitToCelsiusResult")
    private double fahrenheitToCelsiusResult;

    public double getFahrenheitToCelsiusResult() {
        return fahrenheitToCelsiusResult;
    }

    public void setFahrenheitToCelsiusResult(double fahrenheitToCelsiusResult) {
        this.fahrenheitToCelsiusResult = fahrenheitToCelsiusResult;
    }
}

