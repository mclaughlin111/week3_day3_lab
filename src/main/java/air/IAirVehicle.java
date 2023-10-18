package air;

import vehicles.IVehicle;

public interface IAirVehicle extends IVehicle {
    String getWingType();
    void setWingType(String wingType);
    
}
