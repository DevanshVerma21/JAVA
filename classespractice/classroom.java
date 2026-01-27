class Student{
    public String name;
    public int age;

    Student(){
        System.out.println("constructor");
    }

    Student(String name,int age){
        System.out.println("param constructor");
        this.name = name;
        this.age = age;
    }

    Student(Student s2){
        System.out.println("copy constructor");
        this.name = s2.name;
        this.age = s2.age;
    }

    public void printInfo(){
        System.out.println(this.name);
        System.out.println(this.age);
    }

    public void printInfo(String name){
        System.out.println(this.name);
    }

    public void printInfo(int age){
        System.out.println(this.age);
    }

    public void printInfo(String name,int age){
        System.out.println(this.name +" " +this.age);
    }

}
public class classroom {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "Dev";
        s1.age = 20;

        // s1.printInfo();

        // Student s2 = new Student("Devansh",21);
        // s2.printInfo();

        // Student s3 = new Student(s2);
        // s3.printInfo();

        s1.printInfo();
        s1.printInfo(s1.name);
        s1.printInfo(s1.age);
        s1.printInfo(s1.name,s1.age);


    }
}
