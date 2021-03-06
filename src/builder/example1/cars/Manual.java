package builder.example1.cars;

import builder.example1.components.Engine;
import builder.example1.components.GPSNavigator;
import builder.example1.components.Transmission;
import builder.example1.components.TripComputer;

/**
 * Руководство автомобиля — это второй продукт. Заметьте, что руководство и сам
 * автомобиль не имеют общего родительского класса. По сути, они независимы.
 */
public class Manual {
    private final Type type;
    private final int seats;
    private final Engine engine;
    private final Transmission transmission;
    private final TripComputer tripComputer;
    private final GPSNavigator gpsNavigator;

    public Manual(Type type, int seats, Engine engine, Transmission transmission, TripComputer tripComputer, GPSNavigator gpsNavigator) {
        this.type = type;
        this.seats = seats;
        this.engine = engine;
        this.transmission = transmission;
        this.tripComputer = tripComputer;
        this.gpsNavigator = gpsNavigator;
    }

    public String print() {
        String info = "";
        info += "Type of car: " + type + "\n";
        info += "Count of seats: " + seats + "\n";
        //info += "Engine: volume - ";
        info += "Transmission: " + transmission + "\n";
        if (this.tripComputer != null) {
            info += "Trip computer: Functional " + "\n";
        } else {
            info += "Trip computer: N/A" + "\n";
        }
        if(this.gpsNavigator != null){
            info += "GPS Navigator: Functional" + "\n";
        } else{
            info += "GPS Navigator: N/A" + "\n";
        }
        return info;
    }
}

