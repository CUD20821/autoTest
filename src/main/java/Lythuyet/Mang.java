package Lythuyet;

import java.util.Arrays;

public class Mang {
  public static void main(String[] args) {
    Mang obj = new Mang();
    int[] numbers1 = {1, 2, 3, 0, -1, 4, -2};
    String[] name = {"Le", "Trung", "Duc"};

    int[][] numbers2 = {{1, 2, 3}, {4, 5, 6}};

//    System.out.println(obj.getLowest(numbers1));
//    obj.twoDimensionLoop(numbers2);
//    obj.backwardLoop(numbers1);
    System.out.println(obj.recursion1param(5));
    System.out.println(obj.recursion2params(5, 7));

  }

  public int getLowest(int[] numbers){
    int lowest = numbers[0];
    for (int number: numbers){
      if (lowest > number){
        lowest = number;
      }
    }
    return lowest;
  }

  public void twoDimensionLoop(int[][] twoDimensionArray){
    for(int[] row : twoDimensionArray){
      System.out.println(Arrays.toString(row));
      for(int i : row){
        System.out.println(i);
      }
    }
  }

  public void backwardLoop(int[] numbers){
    for (int index = numbers.length - 1; index >= 0; index--){
      System.out.println(numbers[index]);
    }
  }

  public int recursion1param(int number){
    if(number > 0){
      return number + recursion1param(number - 1);
    } else {
      return 0;
    }
  }

  public int recursion2params(int a, int b){
    if(b > a){
      return b + recursion2params(a, b -1);
    } else {
      return b;
    }
  }
}

/*
mô hình IPO
  input
  process
  output
 */
