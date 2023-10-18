package air;

import products.IProduct;
import vehicles.IMotorised;
import vehicles.Vehicle;
import air.IJet;
import air.IAirVehicle;

public class Plane extends Vehicle implements IAirVehicle, IMotorised, IJet {
    private String wingType;

    private IMotorised engine;
    private IJet jet;

    public Plane(float weight, int maxSpeed, IProduct baseProduct, String wingType, IMotorised engine, IJet jet) {
        super(weight, maxSpeed, baseProduct);
        this.wingType = wingType;
        this.engine = engine;
        this.jet = jet;
    }

    @Override
    public String getWingType() {
        return this.wingType;
    }

    @Override
    public void setWingType(String wingType) {
        this.wingType = wingType;

    }

    @Override
    public void startJet() {
        this.jet.startJet();
    }

    @Override
    public void stopJet() {
        this.jet.stopJet();
    }

    @Override
    public void startEngine() {
        this.engine.startEngine();
    }

    @Override
    public void stopEngine() {
        this.engine.stopEngine();
    }

    @Override
    public int getHp() {
        return this.engine.getHp();
    }

    @Override
    public void setHp(int hp) {
        this.engine.setHp(hp);

    }

    @Override
    public int getFuel() {
        return this.engine.getFuel();
    }

    @Override
    public void setFuel(int fuel) {
        this.engine.setFuel(fuel);
    }


    public String getJetType(){
        return this.jet.getJetType();
    }
    public void setJetType(String jetType){
            this.setJetType(jetType);
        }
}
