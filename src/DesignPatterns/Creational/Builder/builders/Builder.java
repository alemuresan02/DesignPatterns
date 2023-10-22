package DesignPatterns.Creational.Builder.builders;

import DesignPatterns.Creational.Builder.cars.CarType;
import DesignPatterns.Creational.Builder.components.Engine;
import DesignPatterns.Creational.Builder.components.GPSNavigator;
import DesignPatterns.Creational.Builder.components.Transmission;
import DesignPatterns.Creational.Builder.components.TripComputer;

public interface Builder {
    void setCarType(CarType type);
    void setSeats(int seats);
    void setEngine(Engine engine);
    void setTransmission(Transmission transmission);
    void setTripComputer(TripComputer tripComputer);
    void setGPSNavigator(GPSNavigator gpsNavigator);
}
