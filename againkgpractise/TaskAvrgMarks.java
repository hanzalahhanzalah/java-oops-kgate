
import java.util.Scanner;

 class TaskAvrgMarks {
     
    public static void main(String[] args){
        //*/📌 Task: Basic Average Calculator
//The program will ask the user to enter marks for 5 subjects.
////It will calculate the total and average./////
//It will display the reslut
Scanner sc=new Scanner(System.in);
int[] marks=new int[5];
System.out.println("Enter sub marks");
marks[0]=sc.nextInt();
System.out.println("Enter sub marks");
marks[1]=sc.nextInt();
System.out.println("Enter sub marks");
marks[2]=sc.nextInt();
System.out.println("Enter sub marks");
marks[3]=sc.nextInt();
System.out.println("Enter sub marks");
marks[4]=sc.nextInt();
int total=marks[0]+marks[1]+marks[2]+marks[3]+marks[4];
System.out.println("total" +"" +total);
System.out.println("average" +""+(marks[0]+marks[1]+marks[2]+marks[3]+marks[4])/5);



}
 }