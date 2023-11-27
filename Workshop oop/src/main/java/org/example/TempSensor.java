package org.example;

public class TempSensor extends Sensor
{
    private float temp;

    public TempSensor(float temp)
    {
        this.temp = temp;
    }

    @Override
    public void SetValue(float temp)
    {
        this.temp = temp;
    }

    @Override
    public float GetValue()
    {
        return this.temp;
    }

    @Override
    public String toString()
    {
        return new String("TempSensor");
    }
}
