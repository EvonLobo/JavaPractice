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
public class Car extends Vehicle {

    public Car() {
        super(); //car2
    }

    public Car(String newRegPlate) {
        super(newRegPlate); //car1
    }

//    public Car(String color) {     This would not be allowed with the above constructor as the compiler will not be able to tell the difference between them  
//        this.color = color;           i.e. new Car("someString") will not know if "someString" is a regPlate or a color
//    }
    public Car(String newRegPlate, String newColor, int newWeight, int newCurrentSpeed, int newMaxSpeed, int newFuelLevel) {
        super(newRegPlate, newColor, newWeight, newCurrentSpeed, newMaxSpeed, newFuelLevel);
    }
}
