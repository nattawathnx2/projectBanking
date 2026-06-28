package projectBanking;

public class FeeAccount extends BankAccount {
    private int fee = 20;
    public FeeAccount(String InputNumber){
        super(InputNumber);
    }
    
    @Override public void withraw(double amount){
        double totalAmount = amount + fee;
        if(totalAmount > balance){
            System.out.println("\nError! There are insufficient funds in the account to withdraw.");
        }else{
            balance -= totalAmount;
            System.out.println("Withdraw money : "+amount+" Bath (Fee: "+fee+" Bath)\n"+
                             "Remaining balance : "+balance+" Bath");
            addTransection("withraw (Ine.Fee)",totalAmount);
            System.out.println("-----------------------------------------------------");
        }
    }
}