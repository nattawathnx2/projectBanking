package projectBanking;

public class Transection{
    private String type;
    private double amount;
    private double currentBalance;
    
    
    public Transection(String type, double amount ,double currentBalance){
        this.type = type;
        this.amount = amount;
        this.currentBalance = currentBalance;
    }
    
    
    public String getDetail(){
        return "type: "+type+" | amount: "+amount+" | currentBalance: "+currentBalance+" Bath";
    }
}