package love.programming;

public class Vaxhall extends Car {

    String engineSize;

    public Vaxhall(String bT, String eT, int nOS, String dT, String engineSize) {
        super(bT, eT, nOS, dT);
        this.engineSize = engineSize;
    }


    public void setEngineSize(){

        this.engineSize=engineSize;
    }

    public String getEngineSize() {
        return engineSize;
    }

    @Override
    public void showDetails() {
        super.showDetails();

        System.out.println("Vaxhall Car Feature with basic Specipacation Included " );

        System.out.println("Engine Size" +getEngineSize());

    }
}
