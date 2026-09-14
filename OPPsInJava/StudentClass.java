public class StudentClass {
    // Create a new data type using a nested class
    public static class Student {
        String name;
        int age;
        double percentage;
    }

    public static void main(String[] args) {
        Student x = new Student();
        x.name = "Abhishek";
        x.age = 25;
        x.percentage = 95.5;

        System.out.println("Student name: " + x.name);
      
    }
}