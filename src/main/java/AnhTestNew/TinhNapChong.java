package AnhTestNew;

class Adder{
  // Là method cùng tên nhưng khác số lượng parameter hoặc khác kiểu dữ liệu
  static int add(int a, int b){
    return a + b;
  }

  static int add(int a, int b, int c){
    return a + b + c;
  }

  static String add(String a, String b){
    return a + b;
  }
}

public class TinhNapChong {
  public static void main(String[] args) {
    System.out.println(Adder.add(11, 11));
    System.out.println(Adder.add(11, 11, 11));
    System.out.println(Adder.add("11", "11"));
  }
}
