package com.kysylytsia;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) {

        Person[] array = new Person[3];

        array [0] = new Student("Andrii");
        array [1] = new Teacher("Mykola");
        array [2] = new Cleaner("Robot");

        for (Person person: array){
            person.print();
            if(person instanceof Staff) {
                ((Staff)person).salary();
            }
            System.out.println();
        }

    }
}
