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

        // assume there is a `counter`
        // while `counter` is less than length of array
        // begin loop

        // use `counter` to identify the `current Person` in the array
        // get `string Representation` of `currentPerson`
        // append `stringRepresentation` to `result` variable

        // end loop
        String result = "";
        StringBuilder name = new StringBuilder();

        int counter = 0;    // assume there is a `counter`
        while (counter < personArray.length) { // while `counter` is less than length of array

            result = "\nMy first name is " + personArray[counter].getFirstName() + "\nMy last name is " + personArray[counter].getLastName();
            name.append(result);
            counter++;

        }
        // end loop
        System.out.println(name);
        return name.toString();
    }


    public String forLoop() {

        String result = "";
        StringBuilder name = new StringBuilder();
        int counter = 0;

        for (int i = 0; i < personArray.length; i++) {
            result = "\nMy first name is " + personArray[counter].getFirstName() + "\nMy last name is " + personArray[counter].getLastName();
            name.append(result);
            counter++;
        }

        System.out.println(name);
        return name.toString();
    }


    public String forEachLoop() {
        String result = "";
        StringBuilder name = new StringBuilder();
        int counter = 0;
        // identify array's type
        // identify array's variable-name

        for (Person i: personArray) {

            result = "\nMy first name is " + personArray[counter].getFirstName() + "\nMy last name is " + personArray[counter].getLastName();
            name.append(result);
            counter++;
        }
        return name.toString();
    }
}
