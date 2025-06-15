package AnhTester;

import java.util.Scanner;

class Student1{
  public String name;
  public int age;

  public void display(){
    System.out.println("Name: " + name);
    System.out.println("Age: " + age);
  }

  public void getInformation(Scanner scanner){
    System.out.println("Ten cua ban la: ");
    name = scanner.nextLine();

    System.out.println("Tuoi cua ban la: ");
    age = scanner.nextInt();
  }
}

public class ClassAndObject {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    Student1 student = new Student1();

    student.getInformation(scanner);

    System.out.println("Thong tin ban vua nhap la: ");
    student.display();
  }
}
