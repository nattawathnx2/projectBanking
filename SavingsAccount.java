package projectBanking;

public class SavingsAccount extends BankAccount {
    private double isterestRate = 0.2;
    public SavingsAccount(String InputNumber){
        super(InputNumber);
    }
    
    public void applyInteres(){
        double sum_interest = balance * isterestRate;
        balance += sum_interest;
        System.out.println("isteresRate 0.2% Your earn interest : "+sum_interest+" Current Balance : "+balance+" Bath");
    }
    
    @Override public void withraw(double amount){
        if(amount > balance){
            System.out.println("\nError! There are insufficient funds in the account to withdraw.");
        }else{
            balance -= amount;
            System.out.println("Withdraw money : "+amount+" Bath\n"+
                             "Remaining balance : "+balance+" Bath");
            System.out.println("-----------------------------------------------------");
        }
    }
}