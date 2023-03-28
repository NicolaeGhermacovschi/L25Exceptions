package person;

import javax.naming.InvalidNameException;

public class Person {
    private String firstName;
    private String lastName;
    private int age;

    public Person(String firstName, String lastName, int age) throws Exception {
        if(firstName == null || firstName == "") {
            throw  new InvalidNameException("First name cannot be null !!!");
        } else {
            this.firstName = firstName;
        }
        if(lastName == null || lastName == "") {
            throw  new InvalidNameException("Last name cannot be null !!!");
        } else {
            this.lastName = lastName;
        }
        if (age < 0 || age > 150 ){
            throw new IllegalArgumentException("Age cannot be less 0 and more 150"); //InvalidRangeException
        } else {
            this.age = age;
        }
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                '}';
    }
}
