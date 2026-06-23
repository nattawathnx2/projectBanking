package projectBanking;
import java.util.ArrayList;
public abstract class BankAccount {
    protected ArrayList<Transection> transectionHistory;
    
    protected String AccountNumber;
    protected double balance;
    
    public BankAccount(String InputNumber){
        AccountNumber = InputNumber;
        balance = 0.0;
        this.transectionHistory = new ArrayList<>();
    }
    
    protected void addTransection(String type, double amount){
        Transection t = new Transection(type,amount,this.balance);
        transectionHistory.add(t);
    }
    
    public void deposit(double amount){ 
        if(amount > 0){
            balance += amount;
            System.out.println("Diposited : "+ amount +" Bath. Current Balance : "+ balance +" Bath");  
            addTransection("Deposit",amount);
        }else{
            System.out.println("Invalid deposit amount!");
        }
    }
    
    public void printHistory(){
        System.out.println("---------- Transection History ----------");
        for(Transection t: transectionHistory){
            System.out.println(t.getDetail());
        }
        System.out.println("-----------------------------------------");
    }
    
    public abstract void withraw(double amount);
}   