package OOP;

public class User {
  // attributes - can phai khai bao private
  private String name;
  private int age;
  private String phone;

  //constructor - dung de khoi tao cac thuoc tinh ben trong class
  public User(String name, int age, String phone){
    this.name = name;
    this.age = age;
    this.phone = phone;
  }


  //methods
  //getter and setter
  public String getName(){
    return name;
  }

  public int getAge(){
    return age;
  }

  public String getPhone(){
    return phone;
  }

  public void setName(String name){
    this.name = name;
  }

  public void setAge(int age){
    this.age = age;
  }

  public void setPhone(String phone){
    this.phone = phone;
  }

  public void displayInfo(){
    System.out.println("User name: " + name + ", Age: " + age + " , Phone: " + phone);
  }
}
