

import java.util.*;
class Main{
public static void addition(int a,int b){
int Ans=a+b;
System.out.println("Addition of "+a+" and "+b+" = "+Ans);
}
public static void subtraction(int a,int b){ 
int Ans=a-b;
System.out.println("subtration of "+a+" and "+b+" = "+Ans);
}
public static void multiplication(int a,int b){ 
int Ans=a*b;
System.out.println("Multiplication of "+a+" and "+b+" = "+Ans);
}
public static void division(int a,int b){ 
int Ans=a/b;
System.out.println("Dvision of "+a+" and "+b+" = "+Ans);
}
public static void Modulus(int a,int b){ 
int Ans=a%b;
System.out.println("Modulus of "+a+" and "+b+" = "+Ans);
}

public static void main(String args[]){
Scanner  sc=new Scanner(System.in);
System.out.println("Enter the first input= ");
int a=sc.nextInt();

System.out.println("Enter the second  input= ");
int b=sc.nextInt();
Main.addition(a,b);
Main.subtraction(a,b);
Main.multiplication(a,b);
Main.division(a,b);
}}

