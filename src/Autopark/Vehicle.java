package Autopark;

public class Vehicle {
    VehicleType type;
    String modelName;
    String registrationNumber;
    int weight;
    int manufactureYear;
    int mileage;
    Color color;
    int volumeTank;

    public Vehicle(VehicleType type, String modelName, String registrationNumber, int weight, int manufactureYear,
                   int mileage, Color color, int volumeTank) {
        this.type = type;
        this.modelName = modelName;
        this.registrationNumber = registrationNumber;
        this.weight = weight;
        this.manufactureYear = manufactureYear;
        this.mileage = mileage;
        this.color = color;
        this.volumeTank = volumeTank;
    }

    public Vehicle() {
    }

    public VehicleType getType() {
        return type;
    }

    public void setType(VehicleType type) {
        this.type = type;
    }

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public void setRegistrationNumber(String registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getManufactureYear() {
        return manufactureYear;
    }

    public void setManufactureYear(int manufactureYear) {
        this.manufactureYear = manufactureYear;
    }

    public int getMileage() {
        return mileage;
    }

    public void setMileage(int mileage) {
        this.mileage = mileage;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
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
        return GetCalcTaxPerMonth;
    }

    @Override
    public String toString() {
        return type + "," + modelName + "," + registrationNumber + "," + weight + "," + manufactureYear + ","
                + mileage + "," + color + "," + volumeTank + getCalcTaxPerMonth();

    }

    public void display(){
        System.out.println(this);
    }

    public int compareTo(Object secondObj){
        Vehicle secondVechicle = (Vehicle)secondObj;
        if(getCalcTaxPerMonth() < secondVechicle.getCalcTaxPerMonth()){
            return -1;
        }
        else{}
        return 0;
    }
}

enum Color{
    Red,
    White,
    Blue,
    Grey,
    Black,
    Green,
    Yellow,
    Gray;

    public String getColor() {
        return name();
    }
}

