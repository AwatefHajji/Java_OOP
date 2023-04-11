public class BankAccount{
    private double checking_balance;
    private double savings_balance;
    public static int numberOfAccount = 0;
    public static double totalAmount = 0;
    //constractor 
    public BankAccount(double checking_balance,double savings_balance){
       this.checking_balance = checking_balance;
       this.savings_balance = savings_balance; 
       numberOfAccount++;
       totalAmount = checking_balance + savings_balance;
    }
    public void deposit(String accountType,double amount){
        if(accountType.equals("checking")){
            setCheckingBalance(getCheckingBalance()+amount);}
        else if(accountType.equals("saving")){
            setSavingBalance(getSavingBalance()+amount);
        }
        totalAmount += amount;
        }
    
    public void  withdraw(String accountType,double amount){
        if(accountType.equals("checking")){
        if(amount <= getCheckingBalance()){
            setCheckingBalance(getCheckingBalance()-amount);
            totalAmount -= amount;}
        else{
            System.out.println("Insufficient funds");}
        }else if(accountType.equals("saving")){
            if(amount <= getSavingBalance()){
                setSavingBalance(getSavingBalance()-amount);
                totalAmount -= amount;}
        else{
            System.out.println("Insufficient funds");}
        }
        }
        public double totalBalance() {
            return totalAmount;
        }

    // getters & setters
    public double getCheckingBalance(){
        return this.checking_balance;
    }
    public double getSavingBalance(){
        return this.savings_balance;
    }
    public void setCheckingBalance(double checking_balance){
        this.checking_balance = checking_balance;
    }
    public void setSavingBalance(double savings_balance){
        this.savings_balance = savings_balance;
    }


}