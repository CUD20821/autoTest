package org.example;

public class Toantu {
  public String a = "duc";
  public static String b = "le";


  public void getInfo(){
    System.out.println(a);
  }

  public static void main(String[] args) {
    String c = "Duc";
    Toantu info = new Toantu();
    info.getInfo();
    System.out.println(b);
    }
}

