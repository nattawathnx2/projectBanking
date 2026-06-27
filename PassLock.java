package projectBanking;
public class PassLock extends BankAccount {
    private String pass;
    private int logicAttempts = 0;
    private boolean block;
    public PassLock(String InputNumber,String InputPass){
        super(InputNumber);
        block = true;
        setPass(InputPass);
    }
    
    public String getPass(){
        return pass;
    }
    
    public void setPass(String newPass){
        if(newPass.length() != 6){
            pass = "123456";
            System.out.println("Error Password not 6 number | Set default = 123456");
        }else{
            pass = newPass;
            System.out.println("Current Password!");
        }
    }
    
    @Override public void withraw(double amount){
        if(block == true){
            System.out.println("Can't withdraw money");
        }else{
            System.out.println("Your identity has been verified.");
            if(amount > balance){
                System.out.println("\nError! There are insufficient funds in the account to withdraw.");
            }else{
                balance -= amount;
                block = true;
                System.out.println("Withdraw money : "+amount+" Bath\n"+
                             "Remaining balance : "+balance+" Bath");
                addTransection("withraw",amount);
                System.out.println("-----------------------------------------------------");
            }
        }
    }
    
    public void unlockAccount(String inputPass){
        if(logicAttempts >= 3){
            System.out.println("!--- Your Account on Block ---!");
            return;
        }
        if(inputPass.equals(pass)){
            block = false;
            logicAttempts = 0;
            System.out.println("Your identity has been verified.");
        }else{
            logicAttempts++;
            System.out.println("Error: Incorrect Password!");
            System.out.println("Enter the wrong password : "+logicAttempts+" /3");
        }
    }
}