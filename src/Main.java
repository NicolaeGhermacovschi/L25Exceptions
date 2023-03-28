import checkNr.CheckNr;
import checkNr.InvalidRangeException;
import numbers.Numbers;
import person.Person;

import java.nio.file.attribute.UserPrincipalNotFoundException;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws Exception, InvalidRangeException {

        System.out.println("====1====");
        ArrayList<Person> persons = new ArrayList<>();
        try {
            persons.add(new Person("Nicolae","Ghermacovschi",22));
            persons.add(new Person("Andrei", "An", 24));
        } catch (Exception e) {
            System.out.println(" Error at " + e.getMessage());
        }
        try {
            persons.add(new Person("","Moroz",42));
        } catch (Exception e) {
            System.out.println(" Error at " + e.getMessage());
        }
        try {
            persons.add(new Person("","Moroz",42));

        } catch (Exception e) {
            System.out.println(" Error at " + e.getMessage());
        }
        try {
            persons.add(new Person("Andrei","Moroz",242));

        } catch (Exception e) {
            System.out.println(" Error at " + e.getMessage());
        }
        for (Person per : persons ) {
            System.out.println(per);
        }
        System.out.println("====2====");
        Numbers nr = new Numbers();
        nr.divideBy(5);
        nr.divideBy(8);
       // nr.divideBy(0);
        System.out.println("====3====");
        CheckNr check = new CheckNr();
        System.out.println("Count nr divisible by 7 : " + check.countDivisibleBy7Numbers(6,150));
        System.out.println("Count nr divisible by 7 : " + check.countDivisibleBy7Numbers(16,15));


    }
}