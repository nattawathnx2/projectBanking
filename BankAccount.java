package projectBanking;

public abstract class BankAccount {
    protected String AccountNumber;
    protected double balance;
    public BankAccount(String InputNumber){
        AccountNumber = InputNumber;
        balance = 0.0;
    }
    
    public void deposit(double amount){
        if(amount > 0){
            balance += amount;
            System.out.println("Diposited : "+ amount +" Bath. Current Balance : "+ balance +" Bath");  
        }else{
            System.out.println("Invalid deposit amount!");
        }
    }
    
    public abstract void withraw(double amount);
}   