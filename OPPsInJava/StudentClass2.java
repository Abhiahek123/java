
public class StudentClass2 {
   

    public static void  fun(Student x) {
        System.out.println(x.name);
        return ;
        
      


    }
    public static void main (String [] args) {
        
        Student x = new Student();
        x.name= "Abhishek";
        x.age = 25;
        // x.setAge(76);
        x.per=95.5;

        fun( x);
        // System.out.println(x.getAge());

       

    }
}
