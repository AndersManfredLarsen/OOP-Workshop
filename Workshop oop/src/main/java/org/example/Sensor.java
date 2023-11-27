package org.example;

public class Sensor
{
    public float GetValue()
    {
        System.out.println("Værdi for sensor");
        return 0.0f;
    }

    public void SetValue(float value)
    {
        System.out.println("This is just a sensor, no value to be set");
    }
}
