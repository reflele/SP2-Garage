public class ElectricCar extends Car{

   private int batteryCapacityKWh;
   private int maxKm;
   private int whPrKm;

    public double greenTax() {
        double kmPrL = 0;
        double tax = 0;

        kmPrL = 100 / (this.whPrKm / 91.25);

        if (kmPrL >=20 && kmPrL <= 50){
            tax = 330;
        } else if (kmPrL >=15 && kmPrL <= 20){
            tax = 1050;
        } else if (kmPrL >=10 && kmPrL <= 15){
            tax = 2340;
        } else if (kmPrL >=5 && kmPrL <= 10){
            tax = 5500;
        } else if (kmPrL <5){
            tax = 10470;
        }

        return tax;
    }

    public int getBatteryCapacityKWh() {
        return batteryCapacityKWh;
    }

    public void setBatteryCapacityKWh(int batteryCapacityKWh) {
        this.batteryCapacityKWh = batteryCapacityKWh;
    }

    public int getMaxKm() {
        return maxKm;
    }

    public void setMaxKm(int maxKm) {
        this.maxKm = maxKm;
    }

    public int getWhPrKm() {
        return whPrKm;
    }

    public void setWhPrKm(int whPrKm) {
        this.whPrKm = whPrKm;
    }

    @Override
    public String toString() {
        return "ElectricCar{" +
                "batteryCapacityKWh=" + batteryCapacityKWh +
                ", maxKm=" + maxKm +
                ", whPrKm=" + whPrKm +
                '}';
    }

    public ElectricCar(String licenseNumber, String brand, String model, int year, int numberOfDoors, int batteryCapacityKWh, int maxKm, int whPrKm) {
        super(licenseNumber, brand, model, year, numberOfDoors);
        this.batteryCapacityKWh = batteryCapacityKWh;
        this.maxKm = maxKm;
        this.whPrKm = whPrKm;
    }
}
