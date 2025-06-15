package org.example;

import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        //output
        System.out.println("Duc");
        //input
        Scanner sc = new Scanner(System.in);

        // req: cho phep nguoi dung nhap ten va hien thi tren man hinh
        System.out.println("User name: ");
        // lay thong tin user va gan vao bien
//        String name = sc.nextLine();
        //print to screen
//        System.out.println("Xin chao" + " " + name);

        // req: cho phep nguoi dung nhap ten, lop va tuoi(sanner.nextInt()), sau do hien thi tren man hinh
        System.out.println("ten gi? ");
        String name = sc.nextLine();

        System.out.println("lop nao? ");
        String classes = sc.nextLine();

        System.out.println("bao nhieu tuoi?");
        int age = sc.nextInt();

        System.out.println("ten: " + name);
        System.out.println("lop: " + classes);
        System.out.println("tuoi: " + age);
    }
}
