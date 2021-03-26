public class PetrolCar extends Car {

   private int octane;
   private  int kmPrL;

    public double greenTax() {
        double tax = 0;

        if (this.kmPrL >=20 && this.kmPrL <= 50){
            tax = 330;
        } else if (this.kmPrL >=15 && this.kmPrL <= 20){
            tax = 1050;
        } else if (this.kmPrL >=10 && this.kmPrL <= 15){
            tax = 2340;
        } else if (this.kmPrL >=5 && this.kmPrL <= 10){
            tax = 5500;
        } else if (this.kmPrL <5){
            tax = 10470;
        }

        return tax;
    }

    public int getOctane() {
        return octane;
    }

    public void setOctane(int octane) {
        this.octane = octane;
    }

    public int getKmPrL() {
        return kmPrL;
    }

    public void setKmPrL(int kmPrL) {
        this.kmPrL = kmPrL;
    }



    @Override
    public String toString() {
        return "PetrolCar{" +
                "octane=" + octane +
                ", kmPrL=" + kmPrL +
                '}';
    }

    public PetrolCar(String licenseNumber, String brand, String model, int year, int numberOfDoors, int octane, int kmPrL) {
        super(licenseNumber, brand, model, year, numberOfDoors);
        this.octane = octane;
        this.kmPrL = kmPrL;
    }

}
