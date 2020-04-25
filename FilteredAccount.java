/**View Problem
https://practiceit.cs.washington.edu/problem/view/bjp4/chapter9/e11-FilteredAccount*/

public class FilteredAccount extends Account{
     private int total = 0;
    private int zero = 0;
    public FilteredAccount(Client c) {
        super(c);
    }
    
    public boolean process(Transaction t){
     total++; 
        if(t.value()==0){
            zero++; 
            return true;
        } 
        return super.process(t);
    }
    public double percentFiltered(){
   if(total == 0){
   return 0.0;
   }
        return ((double) zero) * 100 / total;
    }	
}

