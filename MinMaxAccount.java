/**
View Problem here: https://practiceit.cs.washington.edu/problem/view/bjp4/chapter9/e9-MinMaxAccount
*/ 

public class MinMaxAccount extends BankingAccount {
    private int minBalance;
    private int maxBalance;
    
    public MinMaxAccount(Startup s) {
        super(s);
        minBalance = getBalance();
        maxBalance = getBalance();
    }
    
    public void debit(Debit d) {
        super.debit(d);
        
        int balance = getBalance();
        
        if(balance < minBalance)
            minBalance = balance;
        
        if(balance > maxBalance)
            maxBalance = balance;
    }
    
    public void credit(Credit c) {
        super.credit(c);
        
        int balance = getBalance();
        
        if(balance < minBalance)
            minBalance = balance;
        
        if(balance > maxBalance)
            maxBalance = balance;
    }
    
    public int getMin() {
        return minBalance;
    }
    
    public int getMax() {
        return maxBalance;
    }
}
