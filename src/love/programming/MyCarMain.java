package love.programming;

public class MyCarMain {

    public static void main(String[] args) {

        Car myCar= new Car("Hatch back","petrol",5,"mannual");
        myCar.showDetails();

        Vaxhall myVaxhall = new Vaxhall("Estate","Hybrid",6,"Auto","1.6L");
        myVaxhall.showDetails();

        Ford myFrod= new Ford("Estate","Hybrid",6,"Auto","1.8");
        myFrod.showDetails();

    }
}
