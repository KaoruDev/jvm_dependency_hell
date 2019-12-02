package com.kaoruk;

import com.kaoruk.Person;

class Life {
  public static void main(String args[]) {
    Person person = new Person("Kaoru");
    if (args.length > 0) {
    	person.adoptCat();
    }
    System.out.println(person.sayHello());
  }
}
