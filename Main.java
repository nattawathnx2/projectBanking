package projectBanking;

public class Main {
    public static void main(String[] args){
       SavingsAccount aliceAcc = new SavingsAccount("1001");
       PassLock bobAcc = new PassLock("1002","654321");
       
       System.out.println("--- Money System ---");
       aliceAcc.deposit(1000.0);
       bobAcc.deposit(500.0);
       System.out.println();
       
       System.out.println("=== Case 1 Alice transfer Bob ===");
       aliceAcc.transfer(bobAcc, 400.0);
       System.out.println();
       
       System.out.println("=== Case 2 Bob transfer Alice for Locked ===");
       bobAcc.transfer(aliceAcc, 200.0);
       System.out.println();
       
       System.out.println("=== Case 3 Bob unlock Account on transfer Alice ===");
       bobAcc.unlockAccount("654321");
       bobAcc.transfer(aliceAcc, 200.0);
       System.out.println();
       
       System.out.println("=== Check History on Bob ===");
       bobAcc.printHistory();
    }
}   