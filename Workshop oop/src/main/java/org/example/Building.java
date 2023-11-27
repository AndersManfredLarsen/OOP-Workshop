package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Building {


    private String name;
    private int rooms;
    private float temp;
    private float CO2;

    public Building(String name, int rooms, float temp, float CO2){
        this.name = name;
        this.rooms = rooms;
        this.temp = temp;
        this.CO2 = CO2;

    }

    private ArrayList<Sensor> listOfSensors = new ArrayList<>();
    private ArrayList<Actuator> listOfActuator = new ArrayList<>();
    Room[] arrayOfRoms;

    public Building() {
    }

    public void addSensor(Sensor sensor){
        listOfSensors.add(sensor);
    }

    public void removeSensor(String sensorName){

    }

    public void addActuator(String actuatorName){

    }

    public void removeActuator(String actuatorName){

    }
    public ArrayList getSensorList(){
        return listOfSensors;
    }

    public void printSensor(){
       for (int i = 0; i < listOfSensors.size(); i++) {
           System.out.println(listOfSensors.get(i));

       }
    }
}


