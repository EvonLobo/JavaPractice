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
public class Lorry extends Vehicle {

    private int cargoWeight;

    public Lorry() {
        super(); //lorry1        
    }

    public Lorry(String newRegPlate, String newColor, int newWeight, int newCurrentSpeed, int newMaxSpeed, int newFuelLevel, int newCargoWeight) {
        super(newRegPlate, newColor, newWeight, newCurrentSpeed, newMaxSpeed, newFuelLevel);
        this.cargoWeight = newCargoWeight;
        //lorry2, lorry3
    }

    @Override //override from vehicle
    public int getWeight() {
        return cargoWeight + weight;
    }

    public int getCargoWeight() {
        return cargoWeight;
    }

    public void setCargoWeight(int newCargoWeight) {
        this.cargoWeight = newCargoWeight;
    }

    @Override
    public String toString() {
        return this.getRegPlate() + "," + this.getColor() + "," + this.getWeight() + "," + this.getCurrentSpeed() + "," + this.getMaxSpeed() + "," + this.getFuelLevel() + "," + this.getCargoWeight();
    }
}
