package bank;

class Account {
    public String name;
    protected String email;
    private String password;

    public void displayname() {
        System.out.println(this.name);
    }

    public void givememail(){
        System.out.println(this.email);
    }

    public void setpass(String password){
        this.password = password;
    } 

    public String getPass(){
        return this.password;
    }


}

public class Bank {
    public static void main(String[] args) {
        Account acc1 = new Account();
        acc1.name = "Apna";
        acc1.email = "evwd@gmai.com";
        // acc1.password = "cd";

        acc1.displayname();
        acc1.givememail();
        acc1.setpass("abcd");

        System.out.println(acc1.getPass());

    }
}
