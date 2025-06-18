package OOP;

public abstract class BaseUser {
  private String name;
  private int age;

  public BaseUser(String name, int age){
    this.name = name;
    this.age = age;
  }

  public String getName(){
    return name;
  }

  public abstract void showMessage();
}
