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
        int c = 0;
        while(c < getLength()) {
            result = result + getPersonArray()[c].toString();
            c++;
        }
        return result;
    }



    public String forLoop() {
        String result = "";
        for (int i=0;i<getLength();i++) {
            result = result + getPersonArray()[i].toString();
        }
        return result;
    }



    public String forEachLoop() {
        String result = "";
        for (Person person : getPersonArray()) {
            result = result + person.toString();
        }
        return result;
    }


    public Person[] getPersonArray() {
        return personArray;
    }

    public int getLength() {
        return getPersonArray().length;
    }
}
