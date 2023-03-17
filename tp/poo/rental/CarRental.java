package tp.poo.rental;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class CarRental {
    private List<Object> vehicles;

    public CarRental() {
        this.vehicles = new ArrayList<>();
    }

    public void add(Object vehicle) {
        Objects.requireNonNull(vehicle, "On ne peut pas ajouter 'null' dans la liste");
        vehicles.add(vehicle);
    }

    public void remove(Object vehicle) {
        if (vehicles.isEmpty()) {
            throw new IllegalStateException() ;
        }
        vehicles.remove(vehicle);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < vehicles.size(); i++) {
            sb.append(vehicles.get(i).toString());
            if (i != vehicles.size() - 1) {
                sb.append("\n");
            }
        }
        return sb.toString();
    }

    public List<Object> toSell() {
        List<Object> vehiclesToSell = new ArrayList<>();
        int currentYear = LocalDate.now().getYear();

        for (Object vehicle : vehicles) {
            if (vehicle instanceof Car) {
                Car car = (Car) vehicle;
                if (currentYear - car.getDate() >= 2) {
                    vehiclesToSell.add(car);
                }
            } else if (vehicle instanceof Camel) {
                Camel camel = (Camel) vehicle;
                if (currentYear - camel.getDate() >= 2) {
                    vehiclesToSell.add(camel);
                }
            }

        }
        return vehiclesToSell;
    }




}