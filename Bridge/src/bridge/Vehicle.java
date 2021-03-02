/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bridge;

/**
 *
 * @author evonl
 */
public abstract class Vehicle {

    protected String regPlate;
    protected String color;
    protected int weight;
    protected int currentSpeed;
    protected int maxSpeed;
    protected int fuelLevel;

    public Vehicle() {
        //car2
    }

    public Vehicle(String newRegPlate) {
        this.regPlate = newRegPlate; //car1
    }

//    public Car(String color) {     This would not be allowed with the above constructor as the compiler will not be able to tell the difference between them  
//        this.color = color;           i.e. new Car("someString") will not know if "someString" is a regPlate or a color
//    }
    public Vehicle (String newRegPlate, String newColor, int newWeight, int newCurrentSpeed, int newMaxSpeed, int newFuelLevel) {
        this.regPlate = newRegPlate;
        this.color = newColor;
        this.weight = newWeight;
        this.currentSpeed = newCurrentSpeed;
        this.maxSpeed = newMaxSpeed;
        this.fuelLevel = newFuelLevel;
    }

    public String getRegPlate() {
        return regPlate;
    }

    public void setRegPlate(String newRegPlate) {
        this.regPlate = newRegPlate;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String newColor) {
        this.color = newColor;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int newWeight) {
        this.weight = newWeight;
    }

    public int getCurrentSpeed() {
        return currentSpeed;
    }

    public void setCurrentSpeed(int newCurrentSpeed) {
        this.currentSpeed = newCurrentSpeed;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int newMaxSpeed) {
        this.maxSpeed = newMaxSpeed;
    }

    public int getFuelLevel() {
        return fuelLevel;
    }

    public void setFuelLevel(int newFuelLevel) {
        this.fuelLevel = newFuelLevel;
    }

    public String toString() {
        return this.getRegPlate() + "," + this.getColor() + "," + this.getWeight() + "," + this.getCurrentSpeed() + "," + this.getMaxSpeed() + "," + this.getFuelLevel();
    }

    public void accelerate(int c) //taskk 1, week 3
    {
        fuelLevel = fuelLevel - 1;
        currentSpeed = currentSpeed + c;
        if (currentSpeed > maxSpeed) //task 3
        {
            currentSpeed = maxSpeed;
        }
        if (fuelLevel == 0) {
            currentSpeed = 0; //task 5
        }
    }

    public void brake(int x) //task 2
    {
        currentSpeed = currentSpeed - x;
        if (currentSpeed < 0) //task 4
        {
            currentSpeed = 0;
        }
    }

    public void refuel(int x) //task 6 
    {
        fuelLevel = fuelLevel + x;
        if (fuelLevel > 100) {
            fuelLevel = 100;
        }

    }
}
