package tp.poo.rental;

import java.util.Objects;

public class Car {

    private String model;
    private int date;

    public Car (String model, int date) {
        if (model == null) {
            throw new NullPointerException();
        }
        this.model = model;
        this.date = date;
    }

    public String getModel() {
        return model;
    }

    public int getDate() {
        return date;
    }

    public void setDate(int date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return model + ' ' + date;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return date == car.date && Objects.equals(model, car.model);
    }



}
