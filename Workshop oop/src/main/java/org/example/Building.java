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

    public void removeSensor(Sensor sensor){
        listOfSensors.remove(sensor);
    }

    public void addActuator(Actuator actuator){
        listOfActuator.add(actuator);
    }

    public void removeActuator(Actuator actuator){
        listOfActuator.remove(actuator);
    }
    public ArrayList getSensorList(){
        return listOfSensors;
    }

    public ArrayList getActuatorList(){
        return listOfActuator;
    }

    public void printList(ArrayList listToPrint){
       for (int i = 0; i < listToPrint.size(); i++) {
           System.out.println(listToPrint.get(i));

       }

    }
}


