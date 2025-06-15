package Lythuyet;

import java.util.Scanner;

import AnhTester.*;

public class CauDieuKien {
  public static void main(String[] args) {
    //If condition
//    if (2 > 1){
//      System.out.println("Dung");

    // Viet chuong trinh kiem tra nguoi dung da du 18 tuoi hay chua
    Scanner scanner = new Scanner(System.in);

    /*
      System.out.println("Ten ban la: ");
      String name = scanner.nextLine();

    System.out.println("Diem toan cua ban la: ");
    float mathScore = scanner.nextFloat();

    System.out.println("Diem ly cua ban la: ");
    float physicScore = scanner.nextFloat();

    System.out.println("Diem hoa cua ban la: ");
    float chemicalScore = scanner.nextFloat();

    float averageScore = (mathScore + physicScore + chemicalScore) / 3;

    if (averageScore > 0 && averageScore <= 5) {
      System.out.println("Diem trung binh cua ban la: " + averageScore + "=> Hoc ky nay ban la hs trung binh");
    } else if (averageScore > 5 && averageScore <= 7) {
      System.out.println("Diem trung binh cua ban la: " + averageScore + "=> Hoc ky nay ban la hs kha");
    } else if (averageScore > 7 && averageScore <= 8) {
      System.out.println("Diem trung binh cua ban la: " + averageScore + "=> Hoc ky nay ban la hs gioi");
    } else {
      System.out.println("Diem trung binh cua ban la: " + averageScore + " => Hoc ky nay ban la hs xuat sac");
    }

  Tinh toan so tieu thu dien
    System.out.println("So kw dien ban da su dung: ");
    float soDien = scanner.nextFloat();

    float hanMuc = 50;
    float tienDien = 0;

    if (soDien > 0 && soDien <=50){
      tienDien = soDien * 500;
    } else if (soDien > 50 && soDien<= 100){
      tienDien = hanMuc * 500 + (soDien - hanMuc) * 650;
    } else if (soDien > 100 && soDien<= 200){
      tienDien = hanMuc * 500 + hanMuc * 650 + (soDien - 100) * 850;
    } else if (soDien > 200 && soDien<= 350){
      tienDien = hanMuc * 500 + hanMuc * 650 + hanMuc*2 * 850 + (soDien - 150) * 1100;
    } else if (soDien > 350) {
      tienDien = hanMuc * 500 + hanMuc * 650 + hanMuc*2 * 850 + hanMuc*3 * 1100 + (soDien - 350)*1300;
    } else {
      System.out.println("Vui long nhap lai so tien");
      return;
    }

    soDien * (650 + 850) - hanMuc * (650 + 2*850 + 3*1100)
    System.out.println("So dien ban da tieu thu: " + soDien + " kwh");
    System.out.println("So tien ban can phai tra la: " + tienDien + " dong");
  }
}

      if (age >= 18) {
        System.out.println("Ban da du tuoi hoc dai hoc");
      } else {
        System.out.println("Ban chua du tuoi hoc dai hoc");
      }

      toan tu 3 ngoi
      String result = ( age >= 18) ? "Ban da du tuoi hoc dai hoc" : "Ban chua du tuoi hoc dai hoc";
      System.out.println(result);

      int c = 10;
      if (c == 10){
        System.out.println("so 10");
      } else if (c == 11) {
        System.out.println("so 11");
      } else {
        System.out.println("Vui long dung so khasc");
      }
    }
  }
}

    int d = 5;
    switch (d){
      case 5:
        System.out.println("So 5");
        break;
      case 6:
        System.out.println("So 5");
        break;
      default:
        System.out.println("Vui long kiem tra lai");
    }
*/
    System.out.println("So lan ban can in ra man hinh: ");
    int input = scanner.nextInt();
//    int i = 1;
//    while(i <= input){
//      System.out.println("Hello Testing05");
//      i++;
//    }

    for (int z = 1; z <= input; z++){
      System.out.println("Hello Testing05");
    }

    // Luu y khi dung switch: nen dung switch case khi co gia tri cu the, dieu kien don gian
  }
}