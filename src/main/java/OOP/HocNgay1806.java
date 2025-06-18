package OOP;

public class HocNgay1806 {
  public static void main(String[] args) {
    User user = new User("duc", 28, "0931925157");
//    user.displayInfo();
//    user.setAge(29);
//    user.setName("Le Trung Duc");
//    user.setPhone("123123123");
//    user.displayInfo();

    Guest guest = new Guest("Duc", 28, "123", "duc@gmail.com");
    guest.displayInfo();
//    guest.displayGuestInfo();
    user.displayInfo();

    BaseUser user1 = new NormalUser("Ducc", 28);
    user1.showMessage();

  }
}
