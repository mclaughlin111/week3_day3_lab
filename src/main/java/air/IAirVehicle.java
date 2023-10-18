package air;

import products.IProduct;
import vehicles.IMotorised;
import vehicles.IVehicle;

public interface IAirVehicle extends IVehicle {
    String getJetType();
    void setJetType(String wingType);
    

}
