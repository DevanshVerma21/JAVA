class Student {
    String name;
    int age;

    Student() {
        System.out.println("np Constructor");
    }

    Student(String name) {
        System.out.println("1-p Constructor");
        this.name = name;
    }

    Student(String name, int age) {
        System.out.println("2-p Constructor");

        this.name = name;
        this.age = age;
    }

    Student(Student s1){
        System.out.println("Copy Constructor");
        this.name = s1.name;
        this.age = s1.age;
    }

    public void StudentInfo() {
        System.out.println(this.name);
        System.out.println(this.age);
    }

}

public class studentclass {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "Dev";
        s1.age = 20;

        s1.StudentInfo();

        Student s2 = new Student("Ansh");
        s2.age = 21;
        s2.StudentInfo();

        Student s3 = new Student("Shio", 23);
        s3.StudentInfo();

        Student s4 = new Student(s1);
        s4.StudentInfo();

    }
}
