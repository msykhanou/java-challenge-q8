public class Eagle extends Bird  implements  Fly{

    private boolean flying;
    private int altitude;

    public void setFlying(boolean flying) {
        this.flying = flying;
    }

    public void setAltitude(int altitude) {
        this.altitude = altitude;
    }

    public Eagle(String name) {
        super(name);
        this.flying = false;
        this.altitude = 0;
    }

    public int getAltitude() {
        return altitude;
    }

    public boolean isFlying() {
        return flying;
    }

    @Override
    public String sing() {
        return "Screech!";
    }

    @Override
    public void takeOff() {
        if (!this.flying && this.altitude == 0) {
            this.flying = true;
            System.out.printf("%s takes off in the sky.%n", this.getName());
        }
    }

    @Override
    public void ascend(int altitude) {
        if(flying ){
            this.altitude = altitude;
            System.out.printf("%s flies upward, altitude : %d%n", this.getName(), this.altitude);

        }

    }

    @Override
    public void glide() {
        if(flying) {
            System.out.println("glides into the air");
        }
    }

    @Override
    public void descend(int altitude) {
        if(flying && altitude > 0){
            this.altitude = altitude;
            System.out.printf("%s flies downward, altitude : %d%n", this.getName(), this.altitude);

        }
    }

    @Override
    public void land() {
        if(flying && altitude >1){
            System.out.printf("%s is too high , it' can't land.%n", this.getName());

        } else if (flying && altitude == 1 ) {
            flying = false;
            System.out.printf("%s lands on the ground.%n", this.getName());

        }
    }
}
