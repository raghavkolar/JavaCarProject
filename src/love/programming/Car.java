package love.programming;

public class Car {

    public String bodyType;
    public String engineType;
    public int numberOfSeats;
    public String driveType;


    /*Constractor defination for Car

     */

    public Car(String bT, String eT, int nOS, String dT) {

        this.bodyType = bT;
        this.engineType = eT;
        this.numberOfSeats = nOS;
        this.driveType = dT;

    }

    public Car() {
    }


    public void setBodyType() {

        this.bodyType = bodyType;
    }

    public void setEngineType() {

        this.engineType = engineType;
    }

    public void setNumberOfSeats() {
        this.numberOfSeats = numberOfSeats;
    }

    public void setDriveType() {

        this.driveType = driveType;
    }

    public String getBodyType() {

        return bodyType;
    }

    public String getEngineType() {
        return engineType;
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    public String getDriveType() {
        return driveType;
    }

    public void showDetails() {

        System.out.println("CAR BODY FEATURES :" +this.bodyType + " " +this.engineType + "_" +this.numberOfSeats + "_" +this.driveType);

    }


}

