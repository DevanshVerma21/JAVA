import java.util.Arrays;

public class arr {
    public static void main(String[] args){
        int[] arr = new int[3];
        arr[0] = 21;
        arr[1] = 22;
        // arr[2] = 23;
        // in this we havent assigned any value to the arr[2] so in this i=case it will give zero value which is by default

        // System.out.println(arr[0]);
        // System.out.println(arr[1]);
        // System.out.println(arr[2]);

        boolean[] name = new boolean[3];
        // System.out.println(name[0]);
        // int his case it will give us false

        char[] ch = new char[26];
        // System.out.println(ch[5]);
        //by default it doesnt show anything as it is by feault a unicode value

        int[] marks = new int[3];
        marks[0] = 99;
        marks[1] = 95;
        marks[2] = 100;

        int size = marks.length;

        //sort
        System.out.println(marks[0]);
        Arrays.sort(marks);
        System.out.println(marks[0]);
    }
}
