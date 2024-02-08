import java.util.Scanner;
class Random{
    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);
        int i,n=10;
        int num=(int)(Math.random()*100);
        int mynum=0;
        System.out.println("** NUMBER GAME **\n");
        System.out.println("Enter the random number between 1 to 100:");
        for( i=1;i<=10;i++){
            mynum=sc.nextInt();
            if(mynum==num){
                System.out.println("The number you gauss is correct.");
                break;
            }
        else if(mynum>num){
            System.out.println("The number you gauss is greater than the actual number");
        }
           else {
            System.out.println("The number you gauss is smaller than the actual number");
           }
        if(i==10){
            System.out.println("The number of Trials are Over!");
            break;
        } 
        n--;
        System.out.println("please enter again:");
        }
        System.out.println("The actual ramdon number is "+num);
        System.out.println("Your Score is:"+n+" Out of 10");
       }
    }
   