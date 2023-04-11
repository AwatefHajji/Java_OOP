public class TestBankAccount{
    public static void main(String[] args){
        BankAccount account1 = new BankAccount(5,6);
        account1.deposit("saving",10);
        account1.deposit("cheking",5);
        System.out.println(BankAccount.totalAmount);
        account1.withdraw("saving",5);
        System.out.println(account1.totalBalance());

    }

}