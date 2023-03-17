package tp.poo.rental;

public class Camel {

    private int date;

    public Camel (int date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "camel " + date;
    }

    public int getDate() {
        return date;
    }

    public void setDate(int date) {
        this.date = date;
    }
}
