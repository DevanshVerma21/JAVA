package classes.bank;

class Account {
    public String name;
    protected String email;
    private String password;

    //getter and setters
    public String getpass(){
        return this.password;
    }

    public void setPass(String password){
        this.password = password;
    }


}
public class Bank {
    public static void main(String[] args) {
        Account account1 = new Account();
        account1.name = "Devansh";
        account1.email = "dev@gmail.com";

        account1.setPass("abcd");

        System.out.println(account1.getpass());


    }
    
}
