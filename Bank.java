package projectBanking;
import java.util.ArrayList;

public class Bank {
    private ArrayList<BankAccount> allAccount = new ArrayList<>();
    public void openAccount(BankAccount account){
        allAccount.add(account);
        System.out.println("Account : "+account.AccountNumber+" registered successfully.");
    }
    public BankAccount findAccount(String accountNumber){
        for(BankAccount acc: allAccount){
            if(acc.AccountNumber.equals(accountNumber)){
                return acc;
            }
        }
        System.out.println("Error: Account number "+accountNumber+" Not found!");
        return null;
    }
}