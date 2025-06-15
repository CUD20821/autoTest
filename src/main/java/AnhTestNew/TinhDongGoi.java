package AnhTestNew;

public class TinhDongGoi {

  private String name;

  public String getName(){
    return name;
  }

  public void setName(String name){
    this.name = name;
  }

  public static void main(String[] args) {
    TinhDongGoi tinhDongGoi = new TinhDongGoi();

    tinhDongGoi.setName("Duc");
    System.out.println(tinhDongGoi.getName());

    tinhDongGoi.setName("Duc test");
    System.out.println(tinhDongGoi.getName());
  }
}
