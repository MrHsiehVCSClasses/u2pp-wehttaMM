package u2pp;

/**
 * This class represents a car‘s gas intake and consumption
 * 
 * @author YOUR NAME HERE
 */
 
public class Car {
    private double gas=0.0; //The amount of gas in the tank

    private double mpg=0.0; //The fuel efficiency of the car in miles per gallon
    private String make; //The make of the car
    private String model; //The model of the car
    
    /**
     * YOUR COMMENT HERE
     * 
     * @param anEfficiency - the efficiency of the Car
     * @param aMake - the make of the Car
     * @param aModel - the model of the Car
     */ 
    public Car(double anEfficiency, String aMake, String aModel) {
       //YOUR CODE HERE
        this.mpg = anEfficiency;
        this.make = aMake;
        this.model = aModel;
    }
    
    /**
     * YOUR COMMENT HERE
     * @param amount - the amount of gas to add to the tank
     */
    public void addGas (double amount) {
        //YOUR CODE HERE
        this.gas = this.gas + amount;
    }
    
    /**
     * YOUR COMMENT HERE
     * @param distance - the distance that the car has driven
     */
    public void drive (double distance) {
        //YOUR CODE HERE
        this.gas = this.gas - (distance/this.mpg);
    }
    
    /**
     * @return The amount of gas currently in the tank
     */
    public double getGasInTank() {
        //YOUR CODE HERE
        return this.gas;

    }
    
    /**
     * @return The make and model of the car
     */
     public String getMakeAndModel() {
       return make + " " + model;

     }
    
    /**
     * @return The efficiency of the car. Used for testing purposes
     */
    public double getMpg() {
        return mpg;
    }
}