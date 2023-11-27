package org.example;

import java.util.ArrayList;

public class BuildingsAdministrator {
    ArrayList<Building> listOfBuilding = new ArrayList<>();

    public void addBuilding(Building building){
        listOfBuilding.add(building);
    }

    public void removeBuilding(Building building){
        listOfBuilding.remove(building);
    }

    public void printListOfBuilding(){
        System.out.println(listOfBuilding.toString());
    }
}
