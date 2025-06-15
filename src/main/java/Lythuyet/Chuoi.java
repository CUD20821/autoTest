package Lythuyet;

public class Chuoi {
  public static void main(String[] args) {
    String greet = "Hello Duc";
    System.out.println(greet.length());

    // Chuyen doi sang chu hoa
    System.out.println(greet.toUpperCase());
    System.out.println(greet.toLowerCase());

    // Noi chuoi
    System.out.println("Loi chao " + greet);
    System.out.println("Loi chao ".concat(greet));
  }
}
