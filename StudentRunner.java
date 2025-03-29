// StudentRunner.java
/*
 * Activity 4.9.7
 */
public class StudentRunner
{
  public static void main(String args[])
  {
    Student s1 = new Student("Alice", 1234, 9);
    Student s2 = new Student("Alice", 1234, 9);
    Student s3 = new Student("Bob", 5678, 10);
    Student s4 = new Student("Charlie", 9012, 11);

    // Below two statements are equivalent, now will print the overridden toString
    System.out.println(s1);
    System.out.println(s1.toString());

    System.out.println("\nTesting equals method:");
    System.out.println("s1.equals(s2): " + s1.equals(s2)); // Should be true (same ID)
    System.out.println("s1.equals(s3): " + s1.equals(s3)); // Should be false (different ID)
    System.out.println("s1.equals(s4): " + s1.equals(s4)); // Should be false (different ID)
    System.out.println("s3.equals(s4): " + s3.equals(s4)); // Should be false (different ID)
  }
}