package org.example;

import java.util.Scanner;

public class Baitap {
  public static void main(String[] args) {
    //req: viet chuong trinh tinh luong cho phep nguoi dung nhap vao ten, luong 1 ngay, tong so ngay lam va in ra man hinh
    Scanner sc = new Scanner(System.in);

//    System.out.println("Ten ban la: ");
//    String name = sc.nextLine();
//
//    System.out.println("Luong 1 ngay cua ban: ");
//    int wagePerDay = sc.nextInt();
//
//    System.out.println("Ten ban la: ");
//    int totalWorkDay = sc.nextInt();
//
//    int salary = wagePerDay * totalWorkDay;
//
//    System.out.println("Nhan vien ten: " + name);
//    System.out.println("Tong luong duoc nhan: " + salary + "k");

    System.out.println("Ten ban la: ");
    String name = sc.nextLine();

    System.out.println("Diem toan cua ban la: ");
    float mathScore = sc.nextFloat();

    System.out.println("Diem ly cua ban la: ");
    float physicScore = sc.nextFloat();

    System.out.println("Diem hoa cua ban la: ");
    float chemicalScore = sc.nextFloat();

    float averageScore = (mathScore + physicScore + chemicalScore) / 3;

    System.out.println("Hoc sinh ten: " + name);
    System.out.println("Diem trung binh 3 mon toan, ly, hoa la: " + averageScore);
  }
}
