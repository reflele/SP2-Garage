public class Main {
    public static void main(String[] args){
        PetrolCar petrolCar1 = new PetrolCar("YY 12 123", "Volvo", "V60", 2021, 5, 100, 1337);
        DieselCar dieselCar1 = new DieselCar("SW 56 195", "Toyota", "Yaris", 2021, 0, false, 69);
        ElectricCar electricCar1 = new ElectricCar("JL 12 345", "Tesla", "S", 2021, 1, 70, 500, 420);

        System.out.println(petrolCar1.greenTax());
        System.out.println(dieselCar1.greenTax());
        System.out.println(electricCar1.greenTax());
    }
}
