package org.example;

public class CO2Sensor extends Sensor
{
    private float CO2;

    public CO2Sensor(float CO2)
    {
        this.CO2 = CO2;
    }

    @Override
    public void SetValue(float CO2)
    {
        this.CO2 = CO2;
    }

    @Override
    public float GetValue()
    {
        return this.CO2;
    }
}
