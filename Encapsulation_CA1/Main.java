package Encapsulation_CA1;
public class Main{
    public static void main(String[] args){
        Bank_account Account1=new Bank_account("Pinaki Banerjee", 1000);
        Account1.printDetails();
        Account1.name="Name Changed";   //Allowed becuase name is set public
        //Account1.balance=500000000    Not allowed as balance is set private
        Account1.depositMoney(500);     //New balance = 1500
        Account1.depositMoney(-1000);   //has no effect as value is negetive
        Account1.withdrawMoney(2000);   //has no effect as balance is 1500
        Account1.printDetails();
    }
}
class Bank_account {
    public String name;
    private double balance;
    public Bank_account(String name, double balance){
        this.name=name;
        setBalance(balance);
    }
    public void printDetails(){
        System.out.println("Name: "+name+"\tBalance: "+balance);
    }
    //setter method
    private void setBalance(double balance){
        if(balance>=0)
            this.balance=balance;
    }
    //mutator methods
    public void depositMoney(double change){
        if(change>0){
            balance+=change;
        }
    }
    public void withdrawMoney(double requested){
        if(requested>0  && requested<=balance){
            balance-=requested;
        }
    }
    //getter methods
    public String getName(){
        return name;
    }
    public double getBalance(){
        return balance;
    }
}
