package AnhTester;

import Lythuyet.*;
import java.util.Arrays;

public class ForTest {

  public static void main(String[] args) {
  Vonglap vongLap = new Vonglap();

    ForTest info = new ForTest();
    int[] arrayTest = {0,0,0};
    int[] result = vongLap.basicLoop(arrayTest);
    System.out.println(Arrays.toString(result));
  }
}
