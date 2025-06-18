package BaiTap;

public class NhanVienVanPhong extends NhanVien{

  //Constructor
  public NhanVienVanPhong(String name, int id, double totalWork){
    super(name, id, totalWork);
  }

  @Override
  public double totalWork(){
    return getWorkHour() * 5000;
  }
}
