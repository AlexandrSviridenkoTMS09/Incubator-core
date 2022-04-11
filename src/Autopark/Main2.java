package Autopark;

import static Autopark.Color.*;

public class Main2 {
    public static final int SIZE_VEHICLES = 7;
    public static void main (String[] args){
        VehicleType[] vehicleTypes = new VehicleType[]{ new VehicleType("Bus", 1.2),
                new VehicleType("Car", 1),
                new VehicleType("Rink", 1.5),
                new VehicleType("Tractor", 1.2)};
        Vehicle[] vehicle = new Vehicle[]{
                new Vehicle(vehicleTypes[0], "Volkswagen Crafter", "5427 AX-7", 2022,
                        2015, 376000, Color.BLUE, 75),
                new Vehicle(vehicleTypes[0], "Volkswagen Crafter", "6427 AA-7", 2500,
                        2014, 227010, Color.WHITE, 75),
                new Vehicle(vehicleTypes[0], "ElectricBus","6785 ВA-7", 12080,
                        2019, 20451, Color.GREEN, 100),
                new Vehicle(vehicleTypes[0], "Golf 5", "8682 AX-7", 1200,
                        2006, 230451, Color.GRAY,  55),
                new Vehicle(vehicleTypes[0], "TestaModel S70D", "0001 AA-7", 2200,
                        2019, 10454, Color.WHITE, 70),
                new Vehicle(vehicleTypes[2], "Hamm HD", null, 3000,
                        2016, 122, Color.YELLOW, 135),
                new Vehicle(vehicleTypes[3], "MT3", "1145 AB-7", 1200,
                        2020, 109, Color.RED, 130)
        };
        System.out.println("Unsorted vehicles: ");
        Helper.displayArr(vehicle);

        for (int i = 0; i < SIZE_VEHICLES; i++) {

            for (int j = 0; j < SIZE_VEHICLES - 1; j++) {
                if (vehicle[j].compareTo(vehicle[j + 1]) > 0) {

                    Vehicle temp = vehicle[j + 1];
                    vehicle[j + 1] = vehicle[j];
                    vehicle[j] = temp;
                }
            }
        }

        System.out.println("\nSorted vehicles: ");
        Helper.displayArr(vehicle);

        System.out.println("\nMax mileage car: ");
        System.out.println(findMaxMileageVehicle(vehicle));

        System.out.println("\nMin mileage car: ");
        System.out.println(findMinMileageVehicle(vehicle));

        System.out.println("\nThe following vehicles are equal:");
        displayEqual(vehicle);

    }
    public static Vehicle findMinMileageVehicle(Vehicle[] vehicles) {
        int minMileage;
        Vehicle minMileageVehicle;

        minMileageVehicle = vehicles[0];
        minMileage = vehicles[0].getMileage();

        for (int i = 0; i < SIZE_VEHICLES; i++) {

            int mileage = vehicles[i].getMileage();

            if (mileage < minMileage) {
                minMileage = mileage;
                minMileageVehicle = vehicles[i];
            }
        }

        return minMileageVehicle;
    }

    public static Vehicle findMaxMileageVehicle(Vehicle[] vehicles) {
        int maxMileage;
        Vehicle maxMileageVehicle;

        maxMileageVehicle = vehicles[0];
        maxMileage = vehicles[0].getMileage();

        for (int i = 0; i < SIZE_VEHICLES; i++) {

            int mileage = vehicles[i].getMileage();

            if (mileage > maxMileage) {
                maxMileage = mileage;
                maxMileageVehicle = vehicles[i];
            }
        }

        return maxMileageVehicle;
    }


    public static void displayEqual(Vehicle[] vehicles) {
        int counter = 0;

        for (int i = 0; i < SIZE_VEHICLES; i++) {

            for (int j = i + 1; j < SIZE_VEHICLES; j++) {

                if (vehicles[i].equals(vehicles[j])) {
                    counter++;
                    System.out.println(vehicles[i] + " and " + vehicles[j]);
                }
            }
        }

        if (counter == 0) {
            System.out.println("Neither of vehicles are equal");
        }
    }



    static class Helper {
        public static <T> void displayArr(T[] elements) {
            for (T element:
                    elements) {
                System.out.println(element.toString());
            }
            System.out.println();
        }
    }
}

