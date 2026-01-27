class Student {
    String name;
    int age;

    Student(String name,int age) {
        this.name = name;
        this.age = age;
    }

    public void printinfo() {
        System.out.println("1");
        System.out.println(this.name);
        System.out.println(this.age);
    }

    public void printinfo(String name) {
        System.out.println("2");
        System.out.println(this.name);
    }

    public void printinfo(int age) {
        System.out.println("3");
        System.out.println(this.age);
    }

    public void printinfo(String name, int age) {
        System.out.println("4");
        System.out.println(this.name + " " + this.age);
    }

}

public class funoverloading {
    public static void main(String[] args) {
        Student s1 = new Student("Devansh", 20);

        s1.printinfo();
        s1.printinfo(s1.name);
        s1.printinfo(s1.age);
        s1.printinfo(s1.name,s1.age);
    }

}
