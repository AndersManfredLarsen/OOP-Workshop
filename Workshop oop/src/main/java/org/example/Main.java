package org.example;

import javax.swing.tree.RowMapper;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

    Building building1 = new Building("The White House", 7, 15.7f,0.07f);
    TempSensor tempSensor1 = new TempSensor(24.7f);
    TempSensor tempSensor2 = new TempSensor(28.9f);

    Actuator actuator1 = new Actuator(35);
    Actuator actuator2 = new Actuator(57);
    Actuator actuator3 = new Actuator(46);

    building1.addSensor(tempSensor1);
    building1.addSensor(tempSensor2);

    building1.addActuator(actuator1);
    building1.addActuator(actuator2);
    building1.addActuator(actuator3);

    building1.removeActuator(actuator2);


    System.out.println(tempSensor1.GetValue());

    building1.printList(building1.getSensorList());
    building1.printList(building1.getActuatorList());

    Room kitchen = new Room("Kitchen", 0, 26.4f, 0.08f);
    TempSensor kitchenTemp = new TempSensor(24);
    kitchen.setRoomTemp(kitchenTemp);
    kitchen.setTemp(28);

    System.out.println(kitchenTemp.GetValue());



    }
}