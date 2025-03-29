// Student.java
/*
 * Activity 4.9.7
 */
public class Student
{
  private String name;
  private int id;
  private int year;

  Student(String name, int id, int year)
  {
    this.name = name;
    this.id = id;
    this.year = year;
  }

  /**
   *  toString method
   *  @return a string representation of the object
   */
  public String toString()
  {
    return "Name: " + name + ", ID: " + id + ", Year: " + year;
  }

  /**
   *  equals method
   *  @param other the object to compare to
   *  @return true if the objects are equal, false otherwise
   */
  public boolean equals(Object other)
  {
    if (other == null || !(other instanceof Student))
    {
      return false;
    }
    Student otherStudent = (Student) other;
    return this.id == otherStudent.id;
  }
}