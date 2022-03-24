import java.util.Scanner;
class Multiple<T, V, X> {

T ob1;
V ob2;
X ob3;
Multiple(T o1, V o2, X o3){
 
ob1=o1;
ob2=o2;
ob3=o3;
}
 
void showTypes(){

System.out.println("first data type is " +ob1.getClass().getName());
System.out.println("second data type is " +ob2.getClass().getName());
System.out.println("third data type is " +ob3.getClass().getName());


}

T getob1(){
return ob1;
}

V getob2(){
return ob2;
}

X getob3(){
return ob3;
}

}

class generics{
public static void main(String args[]){

Scanner sc=new Scanner(System.in);
System.out.println("enter the string\n");
String st=sc.nextLine();
System.out.println("enter the integer\n");
int i=sc.nextInt();

//System.out.println("enter the string\n");
//String str=sc.nextLine();
System.out.println("enter the double\n");
Double d=sc.nextDouble();

Multiple<String,Integer,Double>tobj=new Multiple<String,Integer,Double>(st,i,d);
tobj.showTypes();

String st1= tobj.getob1();
System.out.println("data of first set is"+" " +st1);
int i1= tobj.getob2();
System.out.println("data of first set is"+" "+ i1);
Double i2= tobj.getob3();
System.out.println("data of first set is"+" "+ i2);
}
}






