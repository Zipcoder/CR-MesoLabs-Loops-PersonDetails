package com.zipcodewilmington;

/**
 * Created by leon on 1/24/18.
 */
public class Person {
    private final String firstName;
    private final String lastName;

    //our person constructor
    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }
    //our getter method that returns a String type of first name
    public String getFirstName() {

        return firstName;

    }
    //our getter method that returns a String type of first name
    public String getLastName() {

        return lastName;
    }

// Person brian = new Person("Brian", "He");

/*since brian is an object of Person class, to use any method in the person class, start with the object name, then use
the . plus method(). see below:


Wondering if you need to put anything in the parentheses? Just look back at the original getter method!
brian.getFirstName();

*/

    @Override
    public String toString() {
        return new StringBuilder()
                .append("\nMy first name is " + firstName)
                .append("\nMy last name is " + lastName)
                .toString();
    }
}
