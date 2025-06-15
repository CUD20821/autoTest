package Lythuyet;

import java.util.Scanner;

public class Vonglap {
//  public String[] pubArrayStringTest = new String[3];
  public int[] pubArrayIntTest = new int[4];
  public String[] pubArrayString = {"Le", "Trung", "Duc"};
  public int[] pubArrayInt = {1, 2, 3, 4};

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    Vonglap info = new Vonglap();
//    info.basicLoop(info.pubArrayInt);
//    info.enhancedLoop(info.pubArrayString);
//    info.convertStringToInt("1");
//    info.addData(info.pubArrayIntTest, 10);
//    info.getData(info.pubArrayIntTest);

    // vòng lặp do while
//    int index = 1;
//    do{
//      System.out.println("Gia tri i: " + index);
//      index++;
//    } while(index <= 5);
//
//    // vòng lặp for
//    for(int j = 0; j <= 3; j++){
//      System.out.println("Gia tri i: " + j);
//    }


    System.out.println("Nhap so bat ky");
    int number = scanner.nextInt();
    System.out.println("Tổng từ 1 đến " + number + " là: " + info.calculateTotal(number));
    System.out.println("Tổng số chẵn từ 0 đến " + number + " là: " + info.totalEvenNumber(number));
  }

  public int[] basicLoop(int[] arrayInt) {
    for (int i = 0; i < arrayInt.length; i++) {
      arrayInt[i] = i;
    }
    return arrayInt;
  }

  public void enhancedLoop(String[] arrayString){
    for (String i : arrayString){
      System.out.println(i);
    }
  }

  public void convertStringToInt(String a){
    int number0 = Integer.valueOf(a).intValue();
    System.out.println(number0);
  }

  public void addData(int[] arrayInt, int number){
    for (int i = 0; i < arrayInt.length; i++){
      arrayInt[i] = number;
    }
  }

  public void getData(int[] arrayInt){
    for (int i = 0; i < arrayInt.length; i++){
      System.out.println("Index " + i + " co gia tri la " + arrayInt[i]);
    }
  }

  public int calculateTotal(int number){
    int total = 0;
    for(int i = 1; i <= number; i++) {
      total += i;
    }
    return total;
  }

  public int totalEvenNumber(int number){
    int totalEvenNumber = 0;
    for(int i = 0; i <= number; i+=2){
      if (i%2 == 0) {
        totalEvenNumber += i;
      }
    }
    return totalEvenNumber;
    /*
    tổng chẵn
    for(int z = 0; z <= number; z+=2){total += z};

    tổng lẻ
    for(int z = 1; z <= number; z+=2){total += z};

    chia het cho 3
    for(int z = 3; z <= number; z+=3){total += z};
     */
  }
}
