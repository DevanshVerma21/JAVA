//primitive types

public class variables2 {
        // byte - 1 {-128 to 128}
        // short - 2
        // int - 4 {1,2,3,...}
        // long - 8
        // float - 4 {3.14..}
        // double - 8
        // char - 2 {a,b,c,d..}
        // boolean - 1 {true/false}
    public static void main(String[] args){
        // the complier by default if any number is given considers it an integer even if we mention float or double in front of it
        // we always need to write a F or L to make complier know at the end of the int value
        byte age = 30;
        int phone = 1234567890;
        //but now if we add any another number to it it will give us a red line indicating it is exceeding its capacity
        // long phone2 = 12345678900;
        //  it will still give error so we add a L at the end of it to make it look like a long type
        long phone2 = 12345678900L;
        float pi = 3.14F;
        char letter = 'A';
        boolean isadult = false;

        System.out.println(age);
        System.out.println(phone);
        System.out.println(phone2);
        System.out.println(pi);
        System.out.println(letter);
        System.out.println(isadult);
    }
}
