package AnhTester;

class Student{
  public String name;
  public int age;
  public float height;

  public static String universityName = "Sample";
  public int total = 0;

  public Student(String name, int age, float height){
    this.name = name;
    this.age = age;
    this.height = height;
    total += 1;
  }
}

public class Static {
  public static void main(String[] args) {
    Student a = new Student("Duc", 28, 1.73f);
    System.out.println("University(from class): " + Student.universityName);
    System.out.println("University(from instance): " + a.universityName);
    System.out.println("Total(from class): " + a.total);

    Student b = new Student("Le", 28, 1.74f);
    System.out.println("Total(from instance): " + b.total);
  }
}
