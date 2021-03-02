
package bridge;

public class Motorcycle extends Vehicle {

    private boolean hasSideCar;
    public Motorcycle() {
        super();
    }

    public Motorcycle(String newRegPlate, String newColor, int newWeight, int newCurrentSpeed, int newMaxSpeed, int newFuelLevel, boolean newHasSideCar) {
        super(newRegPlate, newColor, newWeight, newCurrentSpeed, newMaxSpeed, newFuelLevel); //calls superclass constructor, after this it is going to add this.hasSideCar
        this.hasSideCar = newHasSideCar;
        //mc2, mc3
    }

    public boolean getHasSideCar() {
        return hasSideCar;
    }

    public void setHasSideCar(boolean newHasSideCar) {
        this.hasSideCar = newHasSideCar;
    }

    @Override
    public String toString() {
        return this.getRegPlate() + "," + this.getColor() + "," + this.getWeight() + "," + this.getCurrentSpeed() + "," + this.getMaxSpeed() + "," + this.getFuelLevel() + "," + this.getHasSideCar();
    }

}
