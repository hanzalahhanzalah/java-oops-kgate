
import java.util.Arrays;
import java.util.Scanner;



class Conditonal {
    public static void main(String[] args) {
        //while

        int a=0;
        while (a<=10){
            System.out.println(a);
            a++;

        }
  //for      
for (int b =0; b <= 10; b++) {
    System.out.println(b);
    
} 
Scanner sc=new Scanner(System.in);
//do while best example
String c="";
do{

    System.out.println("enter");
    
        c=sc.nextLine(); }
while (c.toLowerCase().equals("yes")||c.toLowerCase().equals("no")); 
   //for with best example
int[] my=new int[3];
for (int it=0 ;it<3;it++) {
    my[it]=sc.nextInt();
   
    
}
 System.out.println(Arrays.toString(my));
 int day;
switch( day=6)   {
 case (1): System.out.println("mon");
 break;
 case (2): System.out.println("tue");
 break;
 case (3): System.out.println("wed");
 break;
default:System.out.println("some other day");
}
//best ex of CONTINUE WITH WHILE LOOP
String[] std=new String[] {"uni1","scho","scho","uni2","uni3",};
int i=0 ;
while(i<std.length){
    
  
    
    if (std[i].equals("scho")){
    i++;
    continue;
} 
    System.out.println(std[i]);
    i++;

    

}
//for each loops not neccsarry
int[] sNO =new int[]{7,8,9,0,2};
for(int g:sNO){
    System.out.println(g);
}
 //urinary operator not imp

int no=59;
int no2;
if (no==59){
    no2=69;
    
    
} else no2=49;
System.out.println("normal if else: "+no2);
int k=59;
int m=k==59? 69 :49;
System.out.println("uniary :"+m);

}   

}
    

