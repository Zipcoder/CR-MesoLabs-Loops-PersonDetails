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
        //String result = "";
        // create a `counter`
        // while `counter` is less than length of array
            // begin loop
        int counter=0;

        StringBuilder array = new StringBuilder();

            while(counter< personArray.length){
//
                array.append(personArray[counter]);
                counter++;
            //array.append(System.lineSeparator());
        }

                // use `counter` to identify the `current Person` in the array
                // get `string Representation` of `currentPerson`
                // append `stringRepresentation` to `result` variable

            // end loop
        return array.toString();
    }



    public String forLoop() {
        String result = "";
        // identify initial value
        // identify terminal condition
        // identify increment
        //int counter=0;
        StringBuilder array = new StringBuilder();
        for(int counter=0;counter< personArray.length;counter++)
        {
            array.append(personArray[counter]);
        }
        return array.toString();
        // use the above clauses to declare for-loop signature
            // begin loop
                // use `counter` to identify the `current Person` in the array
                // get `string Representation` of `currentPerson`
                // append `stringRepresentation` to `result` variable
            // end loop
    }



    public String forEachLoop() {
        String result = "";
        // identify array's type
        // identify array's variable-name
int counter=0;
StringBuilder array = new StringBuilder();
for()
        // use the above discoveries to declare for-each-loop signature
            // begin loop
                // get `string Representation` of `currentPerson`
                // append `stringRepresentation` to `result` variable
            // end loop


    }


    public Person[] getPersonArray() {
        return personArray;
    }
}
