package AnhTester;

//class privateA{
//  private int data = 40;
//
//  private void msg(){
//    System.out.println("Hello java");
//  }
//}


public class PhamViTruyCap {
    protected void msg() {
      System.out.println("This is msg func at PhamViTruyCap");
    }

    protected void msgSuccess(){
      System.out.println("This is msgSuccess func at PhamViTruyCap");
    }

    protected void msgError(){
      System.out.println("This is msgError func at PhamViTruyCap");
    }

    public int congHaiSo(int a, int b) {
      return a + b;
    }

    public static void main (String[]args){
//    privateA objPrivate = new privateA();
//    System.out.println(objPrivate.data);
//    objPrivate.msg();
      System.out.println("Hello");

      System.out.println("Hello2");
    }
  }
