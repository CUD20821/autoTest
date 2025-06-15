package AnhTestNew;

import AnhTester.TinhKeThua;

public class DaKeThua extends TinhKeThua {

  public void abcd(){
    System.out.println("Test");
  };

  public static void main(String[] args) {
    DaKeThua daKeThua = new DaKeThua();
    daKeThua.msg();
    daKeThua.msgSuccess();
    daKeThua.msgError();
    daKeThua.abc();
    daKeThua.abcd();
  }
}
