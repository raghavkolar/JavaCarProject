package love.programming;

public class Ford extends Car {

    String bootSize;

    public Ford(String bT, String eT, int nOS, String dT, String bS) {
        super(bT, eT, nOS, dT);
        this.bootSize = bS;
    }

    public void setBootSize(String bootSize) {
        this.bootSize = bootSize;
    }

    public String getBootSize() {
        return bootSize;
    }

    @Override
    public void showDetails() {
        super.showDetails();
        System.out.println("Ford Car Feature with basic Specipacation Included " );

        System.out.println("Boot Size" +getBootSize());

    }
}


