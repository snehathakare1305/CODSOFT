import java.util.Scanner;
public class ATM {
    public static void main(String[] args) {
        BankAccount bankac=new BankAccount(1000);
        Scanner sc=new Scanner(System.in);
        int ammount;
        while(true){
        System.out.println("Welcome To ATM Machine.\n");
        
        System.out.println("1.Withdraw");
        System.out.println("2.Deposite");
        System.out.println("3.Check Balance");
        System.out.println("4.Exit");
        
        System.out.println("Choose Your Option:");
        int n=sc.nextInt();
        switch (n) {
            case 1:
            System.out.println("Enter the Amount to Withdrow");
            ammount=sc.nextInt();
               bankac.withdraw(ammount);
               break;
            case 2:
            System.out.println("Enter the amoount to deposite");
            ammount=sc.nextInt();
            bankac.Deposite(ammount);
            break;
            case 3:
        
           System.out.println("Your Balance is:"+bankac.checkbalance()+"\n");
           break;
           case 4:
           System.out.println("Thanks For Using ATM Machine\nHave a Nice Day.");
           return;
           default:
           System.out.println("Invaild Choosen Option:");
           break;
           }
        }
    }  
}
    
class BankAccount{
    int bal;
    BankAccount(int bal){
        this.bal=bal;
    }
   void withdraw(int ammount){
        if(bal>=ammount){
            bal= bal-ammount;
            System.out.println("Transation Completed\n");
        }
        else{
            System.out.println("Insufficient Account Balance.\n Transation Can not take place.");
        }
    }
    void Deposite(int ammount){
        bal+=ammount;
        System.out.println("Deposition Completed\n");
    }

    int checkbalance(){
        return bal;
    }
}
