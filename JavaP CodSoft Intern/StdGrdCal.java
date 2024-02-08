import java.util.Scanner;
class GradCal{
    int total;
    int n;
    String grade;
    GradCal(int total,int n){
        this.total=total;
        this.n=n;
    }
    double avrage(){
      
        return (double)total/n;
    }
void assignGrade(){
    double avr=avrage();

    if(avr>=90){
        grade="Grade A+";
}
else if(avr>=80){
        grade="Grade A";
}
else if(avr>=70){
        grade="Grade B";
}
else if(avr>=60){
        grade="Grade C";
}
else if(avr>=50){
        grade="Grade D";
}
else {
        grade="Grade F";
}
}
public void displayResult(){
    System.out.println("Total Marks:"+total);
    System.out.println("Average Percentage:"+avrage());
    System.out.println("Grade:"+grade);
}
}


public class StdGrdCal {
    public static void main(String ard[]){
    Scanner sc=new Scanner(System.in);
        System.out.println("Btech 4th Semister Exam");
        System.out.println("Computer Science & Engineering");
        System.out.println("Enter te Name of Student:");
        String name=sc.nextLine();
        System.out.println("Enter the marks of each Subject out of 100:");
        String sub[]={"Discrete Mathematics and Graph Theory","Data Structure and Program Design","Database Managements Systems","Computer Networks","Theory of Computation","System Programming"};
        int marks[]=new int[6];
    int i;
    int total=0;
    for(i=0;i<sub.length;i++){
    System.out.println(i+1+"."+sub[i]+":");
    marks[i]=sc.nextInt();
    total=total+marks[i];
    }
    int n= sub.length;
    GradCal cal= new GradCal(total,n);
    cal.avrage();
    cal.assignGrade();
    cal.displayResult();
    }
    
}
