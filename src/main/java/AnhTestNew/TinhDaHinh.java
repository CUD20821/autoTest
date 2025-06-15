package AnhTestNew;

class Bike{
  void run(){
    System.out.println("Bike run");
  }

}

public class TinhDaHinh extends Bike {

  void run() {
    System.out.println("TinhDaHinh run");
  }

  void stop(){
    System.out.println("TinhDaHinh stop");
  }

  public static void main(String[] args) {
      Bike obj1 = new Bike();
      obj1.run(); // Vì hàm này trùng với hàm trên lớp cha mới gọi được
      //obj1.stop(); // Là hàm của con mà không có thằng con nên không call được

    // => Cha có thì con có, con có thì cha chưa chắc có
      TinhDaHinh obj2 = new TinhDaHinh();
      obj2.run();
      obj2.stop();

      Bike obj3 = new Bike();
      obj3.run();
  }
}

/*Thực tế sử dụng thì sẽ kế thừa từ cha và khai báo hàm con rồi sử dụng
Trường hơp khai báo lớp cha nhưng khởi tạo là giá trị của con thì sẽ có trường hợp
trùng với cha, lúc đó hàm con sẽ ghi đè của cha => tạo ra khái niệm đa hình
Nhưng thực tế ít ai sử dụng kiểu này vì gây rối

 */