package projectBanking;

public class testBanking {
    public static void main(String[] args){
        PassLock myAcc = new PassLock("WAVE-125","000000");
       
        myAcc.deposit(6000);
        myAcc.unlockAccount("000000");
        
        myAcc.withraw(1000);
        
        myAcc.unlockAccount("123456");
        myAcc.deposit(4000);
        
        myAcc.deposit(2000);
        
        myAcc.deposit(1000);
        myAcc.printHistory();
    }
}   