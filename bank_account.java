public class bank_account
{
    String name;
    int acc_num;
    String acc_type;
    int amount;

    
    public bank_account()
    {
        name= "";
        acc_num= 0 ;
        acc_type = "";
       amount = 0 ;
    }
    void bankaccount(String name1,int acc_num1, String acc_type1,int amount1)
    {
        name= name1;
        acc_num= acc_num1;
        acc_type = acc_type1;
        amount= amount1;
        System.out.println(" Name of the account holder: " + name +"\n"+ " Account number: " + acc_num + "\n"+ "Type: "+ acc_type + "\n"+ " Amount: "+ amount );
    }
    void deposit(int deposit)
    {
        amount = amount+deposit;
        System.out.println(" The money deposited: "+ deposit);
        System.out.println(" The total money in account: " + amount);
    }
    void withdraw( int withdraw)
    {
        System.out.println("Total amount to be withdrawn:"+ withdraw );
        if(withdraw<=amount)
        {
            amount= amount- withdraw;
        }
        else
        {
            System.out.println(" Amount to be withdrawn is too large");
        }
        System.out.println( "The total balance: "+ amount);
    }
    public static void main()
    {
        bank_account obj= new bank_account();
        obj.bankaccount("Kanishka",79558419,"Saving",76000);
        obj.deposit(4000);
        obj.withdraw(500000);
    }
}
    