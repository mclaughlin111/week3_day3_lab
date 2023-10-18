package vehicles;

public class Engine implements IMotorised {
    //saw what class needed by looking at the method...
    private int fuel;
    private int hp;

    public Engine(int fuel, int hp) {
        this.fuel = fuel;
        this.hp = hp;
    }

    @Override
    public int getFuel() {
        return fuel;
    }

    @Override
    public void setFuel(int fuel) {
        this.fuel = fuel;
    }

    @Override
    public int getHp() {
        return hp;
    }

    @Override
    public void setHp(int hp) {
        this.hp = hp;
    }

    public void startEngine() {
        System.out.println("engine started");
    }

    public void stopEngine() {
        System.out.println("engine stopped");
    }

}
