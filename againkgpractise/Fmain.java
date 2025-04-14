import java.awt.Point;
class Fmain{
public static void main(String[] args){
//java basic    
System.out.println("hellow world");
//call by value
int a =32;
int b= a;
 a=59;
System.out.println(b);


//note in variables value will change
int vari=5;
vari=98;
System.out.println(vari);

//if we use final in varible value will not change
final float PI_IN_MA=3.142F;




//call by refernce
Point c = new Point(1,2);
Point d=c;
d.y=69;
System.out.println(d);
//String
//method call by var name and then . not by typing data type name like in math class
String e= new String();
e="value 4";
String name= "YeS";
System.out.println(name.contains("e"));
System.out.println(name.toLowerCase());
System.out.println(e.endsWith("4"));
System.out.println(e.indexOf("e"));
System.out.println(e.indexOf("8"));
System.out.println(e.charAt(0));
System.out.println(name.replace("YeS", "no"));//org string remains same immutable

}



}