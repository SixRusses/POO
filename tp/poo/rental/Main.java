package tp.poo.rental;

import exercices.mortgage.Console;
import exercices.mortgage.MortgageCalculator;
import exercices.mortgage.MortgeReport;

public class Main {

    public static void main(String[] args) {

        CarRental rental = new CarRental();

        Car test1 = new Car("ford mustang", 2014);
        Car test2 = new Car("BMW", 2020);
        Car test3 = new Car("Uniqlo", 2018);
        Car test4 = new Car("Renault", 2016);
        Car test5 = new Car("Tesla", 2022);

        Camel camel = new Camel(2000);

        rental.add(test1);
        rental.add(test2);
        rental.add(test3);
        rental.add(test4);
        rental.add(test5);
        rental.add(camel);


        rental.remove(test3);

        System.out.println(rental);

        System.out.println(rental.toSell());




    }
}
