/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bridge;

import java.util.ArrayList;

public class Bridge {

    private static ArrayList<Vehicle> bridge = new ArrayList<>();
    private static int maximumweight = 1500;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Car car1 = new Car("HJ12E"); //setting the regplate here so we do not have to use car1.setRegPlate, car is an extension of vehicle
        car1.setColor("Yellow");
        car1.setWeight(280);
        car1.setCurrentSpeed(220);
        car1.setMaxSpeed(300);
        car1.setFuelLevel(71);
        System.out.println(car1.getRegPlate() + "," + car1.getColor() + "," + car1.getWeight() + "," + car1.getCurrentSpeed() + "," + car1.getMaxSpeed() + "," + car1.getFuelLevel());

        Car car2 = new Car();
        car2.setRegPlate("UKI8W1");
        car2.setColor("Red");
        car2.setWeight(621);
        car2.setCurrentSpeed(320);
        car2.setMaxSpeed(300);
        car2.setFuelLevel(89);
        car2.brake(20);
        car2.refuel(20);
        System.out.println(car2.toString());

        Car car3 = new Car("WQU14E", "Blue", 330, 120, 240, 67);
        car3.setColor("Cyan");
        car3.accelerate(60);
        System.out.println(car3.toString());

        Lorry lorry1 = new Lorry();
        lorry1.setRegPlate("BGEYUW");
        lorry1.setColor("White");
        lorry1.setWeight(890);
        lorry1.setCurrentSpeed(120);
        lorry1.setMaxSpeed(200);
        lorry1.setFuelLevel(79);
        lorry1.setCargoWeight(100);
        System.out.println(lorry1.toString());

        Lorry lorry2 = new Lorry("ASXCHK", "Brown", 400, 130, 200, 82, 57);
        System.out.println(lorry2.toString());

        Lorry lorry3 = new Lorry("UQNCKW", "Yellow", 700, 122, 200, 53, 102);
        System.out.println(lorry3.toString());

        Motorcycle mc1 = new Motorcycle();
        mc1.setRegPlate("UNDKQP");
        mc1.setColor("Indigo");
        mc1.setWeight(349);
        mc1.setCurrentSpeed(119);
        mc1.setMaxSpeed(200);
        mc1.setFuelLevel(92);
        mc1.setHasSideCar(true);
        System.out.println(mc1.toString());

        Motorcycle mc2 = new Motorcycle("ZSLPWP", "Cream", 500, 141, 200, 87,true);
        System.out.println(mc2.toString());

        Motorcycle mc3 = new Motorcycle("QWZXJ", "Green", 561, 171, 200, 61,true);
        System.out.println(mc3.toString());

        //bridge.add(car3) 
        //bridge.add will not have the check involved in addCar method(weight check)
        addVehicle(car1);
        addVehicle(car2);
        addVehicle(car3);
        addVehicle(car1);
        System.out.println(bridge.size()); //length of the array/ count of things 
    }

    public static void addVehicle(Vehicle vehicle) {
        int totalweight = 0;
        for (Vehicle v : bridge) {
            totalweight = totalweight + v.getWeight(); //The first time it runs, it'll take car1's weight, add it to 0 and then assign it to total weight. When car 2 runs, the totalweight will be the weight of car 1, and when car3 runs the total weight will be the sum of weights of car 1 and 2

            //"car.getweight"the first time it runs, it'll get the weight of car1, the second time it'll get car2 and so on
            // System.out.println(car.getWeight());
        }
        if (totalweight + vehicle.getWeight() > maximumweight) // "+ car.getWeight()" -> total weight of the cars currently on the bridge plus the weight of the car that is going to be added
        {
            System.out.println("Bridge has reached max load");
            return; //it will end this method and not add a car
        }
        bridge.add(vehicle); //adding a car to the bridge
        System.out.println("The car has been added to the bridge");

    }

}
