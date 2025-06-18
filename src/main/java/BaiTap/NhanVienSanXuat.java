package BaiTap;

//Constructor
public class NhanVienSanXuat extends NhanVien{
  public NhanVienSanXuat(String name, int id, double workHour){
    super(name, id, workHour);
  }

  @Override
  public double totalWork(){
    return getWorkHour() * 2000;
  }
}
