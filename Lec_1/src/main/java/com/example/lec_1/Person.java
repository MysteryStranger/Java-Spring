package com.example.lec_1;

public class Person implements Comparable<Person> {
    //props
    private String firstname;

    private String lastname;

    //constructors

    public Person(String firstname, String lastname) {
        this.firstname = firstname;
        this.lastname = lastname;
    }

    //methods

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                '}';
    }

    @Override
    public int compareTo(Person o) {
        // return positive number, negative number or 0
        var dif = this.firstname.compareTo(o.firstname);

        // if 0 => return by lastName
        if(dif == 0) {
            return this.lastname.compareTo(o.lastname);
        }
        return dif;
    }
}
