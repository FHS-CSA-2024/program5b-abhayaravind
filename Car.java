public class Car{
    private String carName = "";
    private double mileDriven = 0.0;
    private double gallonsUsed = 0.0;

    public Car(){
        this.carName = carName;
        this.mileDriven = mileDriven;
        this.gallonsUsed = gallonsUsed;
    }

    public Car(String newName, double newMiles, double newGallons){
        this.carName = newName;
        this.mileDriven = newMiles;
        this.gallonsUsed = newGallons;
    }

    public String getName(){
        return carName;
    }

    public double getMileDriven(){
        return mileDriven;
    }

    public double getGallonsUsed(){
        return gallonsUsed;
    }

    
    public void setName(String newName){
        this.carName = newName;
    }

    public void setMile(double newMiles){
        this.mileDriven = newMiles;
    }

    public void setGallons(double newGallons){
        this.gallonsUsed = newGallons;
    }

    public double calculateAverage(){
        double average = mileDriven/gallonsUsed*10;
        int average1 = (int) average;
        double finalAverage = (double) average1/10;

        return finalAverage;
    }

    public String toString(){
        String output = carName + " averaged " + calculateAverage() + " m/g";
        return output;
    }
}

