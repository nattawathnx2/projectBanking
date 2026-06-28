package projectBanking;

public class Main {
    public static void main(String[] args){
        Bank myBank = new Bank();

        myBank.openAccount(new SavingsAccount("1001")); 
        myBank.openAccount(new PassLock("1002", "654321"));

        BankAccount sender = myBank.findAccount("1001");
        BankAccount receiver = myBank.findAccount("1002");

        if(sender != null && receiver != null) {
            sender.deposit(1000.0);
            sender.transfer(receiver, 400.0);
        }
    }
}