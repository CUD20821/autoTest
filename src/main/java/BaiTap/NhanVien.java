package BaiTap;

public abstract class NhanVien {
  private String name;
  private int id;
  private double workHour;

  public NhanVien(String name, int id, double workHour){
    this.name = name;
    this.id = id;
    this.workHour = workHour;
  }

  public String getName(){
    return name;
  }

  public int getId(){
    return id;
  }

  public double getWorkHour(){
    return workHour;
  }

  public abstract double totalWork();

  public void displayEmployeeInfo(){
    System.out.println("Nhan vien: " + name + ", Id: " + id + ", Tong luong: " + totalWork());
  }
}
