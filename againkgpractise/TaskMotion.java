
import java.util.Scanner;

class TaskMotion {
    public static void main(String[] args) {
        //s=ut+1/2+at^2

        Scanner sc=new Scanner(System.in);
       float u;
        do{System.out.println("enter u");
        u=sc.nextFloat();} 
        while(u<0);
        System.out.println("enter t");
        float t=sc.nextFloat();
        System.out.println("enter a");
        float a=sc.nextFloat();
        float s= (u*t)+0.5f*(a)*(t*t);
        System.out.println("the distance is : " + s);

    }
    
}
