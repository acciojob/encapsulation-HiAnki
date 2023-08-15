package com.driver;


public class Main {
  public static void main(String[] args) {
    RWOnly rw = new RWOnly();
//    rw.name = "Ankita";
    // name has private access in com.driver.RWOnly
    rw.setName("anki");
    rw.getName();

    System.out.println(rw.getName());

  }
}