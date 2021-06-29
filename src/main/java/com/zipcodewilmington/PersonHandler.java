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

        StringBuilder sbForArray = new StringBuilder();

            while(counter< personArray.length){
//
                sbForArray.append(personArray[counter]);
                counter++;
            //array.append(System.lineSeparator());
        }

                // use `counter` to identify the `current Person` in the array
                // get `string Representation` of `currentPerson`
                // append `stringRepresentation` to `result` variable

            // end loop
        return sbForArray.toString();
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

StringBuilder sbForArray = new StringBuilder();
        for (Person name:personArray
             ) {
            sbForArray.append(name);
        };
        // use the above discoveries to declare for-each-loop signature
            // begin loop
                // get `string Representation` of `currentPerson`
                // append `stringRepresentation` to `result` variable
            // end loop
    return sbForArray.toString();

    }


    public Person[] getPersonArray() {
        return personArray;
    }
}
