abstract class Car {



    public static void main(String[] args) {

    }


  //  public abstract greenTax(int price){

    public String getLicenseNumber() {
        return licenseNumber;
    }

    public void setLicenseNumber(String licenseNumber) {
        this.licenseNumber = licenseNumber;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getNumberOfDoors() {
        return numberOfDoors;
    }

    public void setNumberOfDoors(int numberOfDoors) {
        this.numberOfDoors = numberOfDoors;
    }

    public abstract double greenTax();

    @Override
    public String toString() {
        return "Car{" +
                "licenseNumber='" + licenseNumber + '\'' +
                ", brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                ", numberOfDoors=" + numberOfDoors +
                '}';
    }

    private String licenseNumber;
    private String brand;
    private String model;
    private int year;
    private int numberOfDoors;


    public Car(String licenseNumber, String brand, String model, int year, int numberOfDoors) {
        this.licenseNumber = licenseNumber;
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.numberOfDoors = numberOfDoors;
    }



}
