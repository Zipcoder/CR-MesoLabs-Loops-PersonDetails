package com.zipcodewilmington;

/**
 * Created by leon on 1/24/18.
 */

/* note: I referenced another dev's code while dev'ing this.

i can attempt to explain individual steps for this, and I know enough to know this is some very clean, well thought-out
code, (I literally didn't "wtf" once) but i absolutely cannot take credit for this program. What I *can* promise you is
given enough time I can absolutely learn it, retain it,and apply it to future applicable use. this is not a promise I
would make that i didn't absolutely believe i could keep.

Having said all of this (can't believe you're still reading this far down into my comments) if you still want to hand
my ass to me that is absolutely your prerogative and if that is the case then so be it (smiles wanly).

*/
public class PersonHandler {

    private final Person[] personArray;

    /*below is the constructor of the PersonHandler. You can tell if something is a constructor bc it'll look just like class
    but it won't say class, plus it'll have parameter parentheses (as you know params are optional)

    If you create an object, but you put nothing in the params/arguments (same exact thing), it'll output the default.

    */
    public PersonHandler(Person[] personArray) {
        this.personArray = personArray;
    }

    //below  is a method of the PersonHandler class
    public String whileLoop() {
        String ourNameList = "";
        // assume there is a `counter`
        int counter = 0;

        // while `counter` is less than length of array
        while (counter < this.personArray.length){


            // begin loop

                // use `counter` to identify the `current Person` in the array
                // get `string Representation` of `currentPerson`
                // append `stringRepresentation` to `result` variable

            //the below appends the value of personArray at index counter to our result String.
        ourNameList += personArray[counter].toString();

            // end loop

        counter++;

        }

        return ourNameList;
    }



    public String forLoop() {
        String result = "";
        // identify initial value
        // identify terminal condition
        // identify increment

        for (int i = 0; i < personArray.length; i++){

            result += personArray[i].toString();
        }

        // use the above clauses to declare for-loop signature
            // begin loop
                // use `counter` to identify the `current Person` in the array
                // get `string Representation` of `currentPerson`
                // append `stringRepresentation` to `result` variable
            // end loop

        return result;
    }



    public String forEachLoop() {
        String result = "";
        // identify array's type
        // identify array's variable-name

        for (Person name : personArray){
            result += name.toString();
        }

        // use the above discoveries to declare for-each-loop signature
            // begin loop
                // get `string Representation` of `currentPerson`
                // append `stringRepresentation` to `result` variable
            // end loop

        return result;
    }


    public Person[] getPersonArray() {
        return personArray;
    }
}
