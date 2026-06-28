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
    
    public void transfer(BankAccount targetAccount, double amount){
        System.out.println("--- Start Transfer ---");
        double balanceBeforeWithraw = this.balance;
        this.withraw(amount);
        if(this.balance < balanceBeforeWithraw){
            targetAccount.deposit(amount);
            this.addTransection("Transfer Out to : "+targetAccount.AccountNumber, amount);
            targetAccount.addTransection("Transfer In on : "+this.AccountNumber, amount);
            System.out.println("<--- Transfer Success! --->");
        }else{
            System.out.println("!--- Money transfer failed ---!");
        }   
    }
    
    public abstract void withraw(double amount);
}   