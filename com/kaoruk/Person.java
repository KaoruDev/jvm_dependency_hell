package com.kaoruk;

import com.kaoruk.Cat;
import java.util.Objects;

class Person {
  private final String name;
  private Cat cat;

  public Person(String name) {
    this.name = name;
  }

  public void adoptCat() {
    this.cat = new Cat();
  }

  public String sayHello() {
    if (Objects.isNull(cat)) {
      return this.name + ": Life has no meaning with a cat";
    } else {
      return this.name + ": Oh hai, I haz kitty! " + cat.sayHello();
    }
  }
}
