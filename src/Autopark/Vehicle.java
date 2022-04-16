package Autopark;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Objects;

import static Autopark.level3.TechnicalSpecialist.*;

public class Vehicle {
    private /*final*/ VehicleType type;
    private /*final*/  String modelName;
    private String registrationNumber;
    private int weight;
    private /*final*/  int manufactureYear;
    private int mileage;
    private Color color;
    private int volumeTank;

    public Vehicle(VehicleType type, String modelName, String registrationNumber, int weight, int manufactureYear,
                   int mileage, Color color, int volumeTank) {
            if(!validateVehicleType(type)){
                this.type = "type name"; //как тут обойти?
            }
            else{
                this.type = type;
            }

            if(!validateModelName(modelName)){
                this.modelName = "mode name";
            }
            else{
                this.modelName = modelName;
            }

            this.registrationNumber = registrationNumber;
            this.weight = weight;

            if(!validateManufactureYear(manufactureYear)){
                this.manufactureYear = "number Year";
            }
            else{
                this.manufactureYear = manufactureYear;
            }

            this.mileage = mileage;
            this.color = color;
            this.volumeTank = volumeTank;

    }

    public Vehicle() {
    }

    public VehicleType getType() {
        return type;
    }

    /*public void setType(VehicleType type) {
        if(validateVehicleType(type))
        this.type = type;
    }*/

    public String getModelName() {
        return modelName;
    }

    /*public void setModelName(String modelName) {
        if(validateModelName(modelName))
        this.modelName = modelName;
    }*/

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public void setRegistrationNumber(String registrationNumber) {
        if (validateRegistrationNumber(registrationNumber)) {
            this.registrationNumber = registrationNumber;
        }
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        if (validateWeight(weight)) {
            this.weight = weight;
        }
    }

    public int getManufactureYear() {
        return manufactureYear;
    }

    /*public void setManufactureYear(int manufactureYear) {
        if(validateManufactureYear(manufactureYear))
        this.manufactureYear = manufactureYear;
    }*/

    public int getMileage() {
        return mileage;
    }

    public void setMileage(int mileage) {
        if (validateMileage(mileage)) {
            this.mileage = mileage;
        }
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        if (validateColor(color)) {
            this.color = color;
        }
    }

    public int getVolumeTank() {
        return volumeTank;
    }

    public void setVolumeTank(int volumeTank) {
        this.volumeTank = volumeTank;
    }

    public double getCalcTaxPerMonth(){
        VehicleType vehicleType = new VehicleType();
        double GetCalcTaxPerMonth = getWeight() * 0.0013 + vehicleType.taxCoefficient * 30 + 5;
        return new BigDecimal(GetCalcTaxPerMonth).setScale(2, RoundingMode.HALF_EVEN).doubleValue();
    }

    @Override
    public String toString() {
        return type + "," + modelName + "," + registrationNumber + "," + weight + "," + manufactureYear + ","
                + mileage + "," + color + "," + volumeTank + "," + getCalcTaxPerMonth();

    }

    public void display(){
        System.out.println(this);
    }

    public int compareTo(Vehicle obj){
        if (manufactureYear > obj.manufactureYear) {
            return 1;
        }
        else    if (manufactureYear < obj.manufactureYear) {
            return -1;
        }
                else {
                    if (mileage > obj.mileage) {
                        return 1;
                    }
                    else if (mileage < obj.mileage) {
                        return -1;
                    }
                }
        return 0;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Vehicle vehicle = (Vehicle) o;
        return type.equals(vehicle.type) && modelName.equals(vehicle.modelName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, modelName);
    }
}



