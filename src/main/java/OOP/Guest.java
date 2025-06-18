package OOP;

public class Guest extends User{
  private String email;

  public Guest(String name, int age, String phone, String email){
    super(name, age, phone);
    this.email = email;
  }

  @Override
  public void displayInfo(){
    System.out.println("Email: " + email);
  }

//  @Override
  public void welcomeMessage(){
    System.out.println("Welcome Guest: " + getName() + " limit feature access");
  }

  public void displayGuestInfo(){
    System.out.println("Email: " + email);
  }
}
