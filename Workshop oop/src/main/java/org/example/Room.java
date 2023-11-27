package org.example;

public class Room extends Building{
    private float temp;
    private float CO2;


    public Room(float temp, float CO2){
        this.temp = temp;
        this.CO2 = CO2;
    }

    public float getTemp(){
        return temp;
    }
    public void setTemp(float newTemp){
     this.temp =  newTemp;
    }

    public float getCO2(){
        return  CO2;
    }

    public void setCO2(float newCO2){
        this.CO2 = newCO2;
    }
}
