package org.example;

public class Actuator
{
    private double value;

    public Actuator(double value)
    {
        this.value = value;
    }

    public double GetValue()
    {
        return this.value;
    }

    public void setValue(double value)
    {
        this.value = value;
    }

    @Override
    public String toString()
    {
        return new String("This actuators value is " + value);
    }
}
