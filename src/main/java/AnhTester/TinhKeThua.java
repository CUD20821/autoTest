package AnhTester;

public class TinhKeThua extends PhamViTruyCap {

  protected void abc(){
    System.out.println("This is abc func at TinhKeThua");
  }

  public static void main(String[] args) {
    TinhKeThua obj = new TinhKeThua();
    System.out.println(obj.congHaiSo(1, 2));
  }
}
