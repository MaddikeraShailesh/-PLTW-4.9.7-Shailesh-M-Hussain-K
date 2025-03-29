/*
 * Activity 4.9.7
 */ 
public class StudentRunner
{ 
  public static void main(String args[]) 
  { 
    Student s1 = new Student("Alice"); 
    Student s2 = new Student("Alice");
    Student s3 = new Student("Bob");

    // Below two statements are equivalent 
    System.out.println(s1); 
    System.out.println(s1.toString()); 
  } 
} 