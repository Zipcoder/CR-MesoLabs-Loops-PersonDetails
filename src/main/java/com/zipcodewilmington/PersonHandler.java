package com.zipcodewilmington;

/**
 * Created by leon on 1/24/18.
 */
public class PersonHandler {
    private final Person[] personArray;

    public PersonHandler(Person[] personArray) {
        this.personArray = personArray;
    }

    public String whileLoop() {
        String result = "";
        // assume there is a `counter`
        int counter = 0;
        StringBuilder myString = new StringBuilder();

        while (counter < personArray.length) {
            result = "\nMy first name is " + personArray[counter].getFirstName() + "\nMy last name is " + personArray[counter].getLastName();

            myString.append(result);

            counter++;
        }

        // while `counter` is less than length of array
        // begin loop

        // use `counter` to identify the `current Person` in the array
        // get `string Representation` of `currentPerson`
        // append `stringRepresentation` to `result` variable

        // end loop
        return myString.toString();
    }


    public String forLoop() {
        String result = "";
        int counter = 0;
        StringBuilder myString = new StringBuilder();
        for (counter = 0; counter < personArray.length; counter++) {

            result = "\nMy first name is " + personArray[counter].getFirstName() + "\nMy last name is " + personArray[counter].getLastName();

            myString.append(result);
        }
        // identify initial value
        // identify terminal condition
        // identify increment

        // use the above clauses to declare for-loop signature
        // begin loop
        // use `counter` to identify the `current Person` in the array
        // get `string Representation` of `currentPerson`
        // append `stringRepresentation` to `result` variable
        // end loop

        return myString.toString();
    }


    public String forEachLoop() {
        String result = "";
        // identify array's type
        // identify array's variable-name

        int counter = 0;
        StringBuilder myString = new StringBuilder();
        for (Person element : personArray) {

            result = "\nMy first name is " + personArray[counter].getFirstName() + "\nMy last name is " + personArray[counter].getLastName();

            myString.append(result);

            counter++;
        }


        // use the above discoveries to declare for-each-loop signature
        // begin loop
        // get `string Representation` of `currentPerson`
        // append `stringRepresentation` to `result` variable
        // end loop

        return myString.toString();
    }


    public Person[] getPersonArray() {
        return personArray;
    }
}
