package Assignments;

public class BankAccount {
    int acc_no ;
    String Cust_Name, acc_Type;
    float balance;


    public BankAccount(int acc_no,String cust_Name,String acc_Type,float balance)
    {
        if (balance<0) {
            try {
                throw new NegativeAmountException(" Negative Balance:");
            } catch (NegativeAmountException e) {
                System.out.println("Exception:" + e.getMessage());
            }

        }else if(acc_Type.equals("saving")&& balance<5000)
        {
            try
            {
                throw new InsufficientFunds("Minimun balance required is rs: 5000");

            }catch (InsufficientFunds e)
            {
                System.out.println("Exception: "+e.getMessage());
            }
        }
        else if (acc_Type.equals("Current")&& balance<1000)
        {
            try {
                throw new InsufficientFunds("Minimun balance required is rs: 1000");
            }
            catch (InsufficientFunds e)
            {
                System.out.println("Exception: "+e.getMessage());
            }
        }
        else {
            this.acc_no = acc_no;
            this.Cust_Name = cust_Name;
            this.acc_Type = acc_Type;
            this.balance = balance;
        }
    }

    void deposit(float amt)
    {
        if(amt<0)
        {
            try{
                throw new NegativeAmountException("Amount not be negative:");
            }
            catch (NegativeAmountException e)
            {
                System.out.println("Exception: "+e.getMessage());
            }
        }
        else
        {
            this.balance += amt;
            System.out.println("*************");
            System.out.println("Amount creadited to your account:");
            System.out.println("Your Account balace is:"+this.balance);
            System.out.println("*************");
        }
    }

    void Withdraw(float amt)
    {
        if(amt<0)
        {
            try
            {
                throw new NegativeAmountException("Amount not be negative:");
            }
            catch (NegativeAmountException e)
            {
                System.out.println("Exception: "+e.getMessage());
            }
        }
        else if ((this.acc_Type.equals("Saving")&& (this.balance<5000)) || (this.acc_Type.equals("Current") && (this.balance <1000)))
        {
            try {
                throw new InsufficientFunds("Low account balance: ");
            } catch (InsufficientFunds e) {
                System.out.println("Exception: " + e.getMessage());
            }
        }
        else{
            this.balance -= amt;
            System.out.println("*************");
            System.out.println("Amount debited from your account:");
            System.out.println("Your Account balace is:"+this.balance);
            System.out.println("*************");
        }
    }

    float getBalance(){
        if((this.acc_Type.equals("Saving") && this.balance<5000) || (this.acc_Type.equals("Current") && this.balance <1000))
        {
            try {
                throw new LowBalanceException("Your account balance is less than your balance limit:");
            }
            catch (LowBalanceException e)
            {
                System.out.println("Exception: "+e.getMessage());
            }
        }
        System.out.println("*************");
        System.out.println("Account Holder name : "+this.Cust_Name);
        System.out.println("Account Number: "+this.acc_no);
        System.out.println("Account Type: "+this.acc_Type);
        return this.balance;

    }
}
