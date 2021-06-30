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
        // create a `counter`
        int counter = 0;
        // while `counter` is less than length of array
        while (counter < this.personArray.length) { // begin loop
            Person currentPerson = this.personArray[counter]; // use `counter` to identify the `current Person` in the array
            String stringRepresentation = currentPerson.toString(); // get `string Representation` of `currentPerson`
            result += stringRepresentation; // append `stringRepresentation` to `result` variable
            counter++;
            // end loop
        }
        return result;
    }
    /*
    while (counter < personArray.length) {
    String currentPerson = personArray[counter].toString();
    result += currentPerson;
    counter++;
    }
    return result;
    }
     */

        public String forLoop () {
            String result = "";
            // identify initial value
            // identify terminal condition
            // identify increment

            // use the above clauses to declare for-loop signature
            // begin loop
            //for (int i = 0; i < personArray.length; i++) {

            //}
            // use `counter` to identify the `current Person` in the array
            // get `string Representation` of `currentPerson`
            // append `stringRepresentation` to `result` variable
            // end loop


            for (int i = 0; i < personArray.length; i++) {
                Person personNow = personArray[i];
                result += personNow.toString();
            }
            return result;
        }


        public String forEachLoop () {
            String result = "";
            // identify array's type
            // identify array's variable-name


            // use the above discoveries to declare for-each-loop signature
            // begin loop
            // get `string Representation` of `currentPerson`
            // append `stringRepresentation` to `result` variable
            // end loop
            for (Person person: personArray ) {
                String personNow = person.toString();
                result += personNow;
            }

            return result;
        }


        public Person[] getPersonArray () {
            return personArray;
        }
    }

