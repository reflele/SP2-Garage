public class DieselCar extends Car{
    private boolean hasParticleFilter;
    private int kmPrL;


    public double greenTax() {
        double tax = 0;
//tax calculation
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
//countervailing charges
        if (this.kmPrL >=20 && this.kmPrL <= 50){
            tax += 130;}
        else if (this.kmPrL >=15 && this.kmPrL <= 20){
            tax += 1390;}
        else if (this.kmPrL >=10 && this.kmPrL <= 15){
            tax += 1850;}
        else if (this.kmPrL >=5 && this.kmPrL <= 10){
            tax += 2770;}
        else if (this.kmPrL <5){
            tax += 15260;}
//Particlefilter charges
        if(this.hasParticleFilter==false){
            tax += 1000;
        }

        return tax;
    }

    public boolean isHasParticleFilter() {
        return hasParticleFilter;
    }

    public void setHasParticleFilter(boolean hasParticleFilter) {
        this.hasParticleFilter = hasParticleFilter;
    }

    public int getKmPrL() {
        return kmPrL;
    }

    public void setKmPrL(int kmPrL) {
        this.kmPrL = kmPrL;
    }

    @Override
    public String toString() {
        return "DieselCar{" +
                "hasParticleFilter=" + hasParticleFilter +
                ", kmPrL=" + kmPrL +
                '}';
    }

    public DieselCar(String licenseNumber, String brand, String model, int year, int numberOfDoors, boolean hasParticleFilter, int kmPrL) {
        super(licenseNumber, brand, model, year, numberOfDoors);
        this.hasParticleFilter = hasParticleFilter;
        this.kmPrL = kmPrL;
    }
}
