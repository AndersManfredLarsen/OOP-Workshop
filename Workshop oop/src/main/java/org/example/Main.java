package org.example;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

    Building building1 = new Building("The White House", 7, 15.7f,0.07f);
    TempSensor tempSensor1 = new TempSensor(24.7f);
    TempSensor tempSensor2 = new TempSensor(28.9f);
    building1.addSensor(tempSensor1);
    building1.addSensor(tempSensor2);

    System.out.println(tempSensor1.GetValue());
    building1.printSensor();

    }
}