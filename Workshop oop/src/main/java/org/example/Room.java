package org.example;

public class Room extends Building{

    private String name;
    private float temp;
    private float CO2;

    private TempSensor roomTemp;


    public Room(String name, int rooms, float temp, float CO2){
        this.name = name;
        this.temp = temp;
        this.CO2 = CO2;
    }


    public void setTemp(float newTemp){
     roomTemp.SetValue(newTemp);
    }

    public void setRoomTemp(TempSensor tempSensor){
        this.roomTemp = tempSensor;
    }


    public void setCO2(float newCO2){
        this.CO2 = newCO2;
    }
}
