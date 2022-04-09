package Autopark;

import static Autopark.Color.*;

public class Main2 {
    public static void main (String[] args){
        Vehicle[] vehicle = new Vehicle[]{
                new Vehicle(0, "Volkswagen Crafter", "5427 AX-7", 2022,
                        2015, 376000, Color Blue),
                new Vehicle(0, "Volkswagen Crafter", "6427 AA-7", 2500,
                        2014, 227010, Color White),
                new Vehicle(0, "ElectricBus","6785 ВA-7", 12080,
                        2019, 20451, Color Green),
                new Vehicle(1, "Golf 5", "8682 AX-7", 1200,
                        2006, 230451, 1.2, Color Gray),
                new Vehicle(1, "TestaModel S70D", "0001 AA-7", 2200,
                        2019, 10454, Color White),
                new Vehicle(2, "Hamm HD", null, 3000,
                        2016, 122, Color Yellow),
                new Vehicle(3, "MT3", "1145 AB-7", 1200,
                        2020, 109, Color Red)
        };
    }
}
