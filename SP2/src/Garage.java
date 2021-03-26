import java.util.ArrayList;

public class Garage {
    public static void main(String[] args) {

        PetrolCar petrolCar2 = new PetrolCar("YY 12 124", "Volvo2", "V60", 2021, 5, 100, 1337);
        DieselCar dieselCar2 = new DieselCar("SW 56 145", "Toyota2", "Yaris", 2021, 0, true, 69);
        ElectricCar electricCar2 = new ElectricCar("JL 14 345", "Tesla2", "S", 2021, 1, 70, 500, 420);

        ArrayList<Car> garage = new ArrayList<Car>();
        garage.add(petrolCar2);
        garage.add(dieselCar2);
        garage.add(electricCar2);



    }
}
