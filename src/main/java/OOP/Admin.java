package OOP;

public class Admin extends User{
  private String role;

  //constructor
  public Admin(String name, int age, String phone, String role){
    super(name, age, phone);
    this.role = role;
  }

  //method get & set
  public String getRole(){
    return role;
  }

  public void setRole(String role){
    this.role = role;
  }

  public void displayAdminInfo(){
    System.out.println("Role: " + role);
  }

}
