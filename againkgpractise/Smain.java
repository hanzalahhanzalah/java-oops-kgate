import java.util.Arrays;

class Smain{

    public static void main(String[] args){
//arrays
        int[] rollNo=new int[3];
        rollNo[0]=34;
        rollNo[1]=59;
        rollNo[2]=32;
        Arrays.sort(rollNo);
        System.out.println(rollNo[2]);
           
System.out.println(Arrays.toString(rollNo));
//or can be defined as
int[] sNo=new int[] {4,6,6,64,46};
//2d array
int[][] twoBatches=new int[3][3];
twoBatches[0][0]=45;
twoBatches[0][1]=34;
twoBatches[1][0]=53;
twoBatches[1][1]=67;
twoBatches[2][1]=68;
System.out.println(Arrays.deepToString(twoBatches));
//inc decre

int x=5;
int y=x++; //assign value of x to y then x increment 6 5
System.out.println(x);
System.out.println(y);
int c=5;
int d=++c;//incr value of d  to 1 then assign to d 
System.out.println(c);
System.out.println(d);
//casting
long g=10;
int h=(int)g; //typecasting here
System.out.println(h);
// byte>shortint>long>float>double
String hell="69";
Integer.parseInt(hell);// converting string to int //wrapper class
System.out.println(hell);

//Maths CLass
int num1=10;
int num2=30;
System.out.println(Math.max(num1, num2));// .round .ceil . floor
double Random=Math.random()*100;
System.out.println(Math.round(Random));



    }
    

}