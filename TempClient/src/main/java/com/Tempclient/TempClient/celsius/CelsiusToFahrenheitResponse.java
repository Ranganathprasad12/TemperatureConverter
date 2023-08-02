package com.Tempclient.TempClient.celsius;



import javax.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "CelsiusToFahrenheitResponse")
public class CelsiusToFahrenheitResponse {

    @XmlElement(name = "CelsiusToFahrenheitResult")
    private double celsiusToFahrenheitResult;

    public double getCelsiusToFahrenheitResult() {
        return celsiusToFahrenheitResult;
    }

    public void setCelsiusToFahrenheitResult(double celsiusToFahrenheitResult) {
        this.celsiusToFahrenheitResult = celsiusToFahrenheitResult;
    }
}
