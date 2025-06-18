package BaiTap;

public class Main {
  public static void main(String[] args) {
    NhanVien nv1 = new NhanVienSanXuat("DucSX", 1, 20);
    nv1.displayEmployeeInfo();

    NhanVien nv2 = new NhanVienVanPhong("DucVP", 2, 28);
    nv2.displayEmployeeInfo();
  }
}
