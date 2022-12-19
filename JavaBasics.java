import java.util.Scanner;

public class JavaBasics{
    public static void main(String[] args) {
        //output->
        System.out.println("Hello World!");
        System.out.println("****");
        System.out.println("***");
        System.out.println("**");
        System.out.println("*");
        //variables->
        int a=10;
        System.out.println("a"); //---prints a
        System.out.println(a); //----prints the value of a
        //Input->
        Scanner sc = new Scanner(System.in);
        String input = sc.next(); //upto space
        String i2 = sc.nextLine(); //upto line end
        int n = sc.nextInt();
        float p = sc.nextFloat();
    }
}
//boilerplate code (template/used in every program)
/*
  Data Types-
  1. Primitive-> byte,short,char,boolean,int,long,float,double
  2. Non-Primitive-> String, Array, Class, Object, Interface
  Typed languages-> We have to specify the data type at definition. eg: Java, C, C++
  Size:
    byte: 1 byte, -128 to 127
    short: 2 bytes
    char: 2 bytes
    boolean: 1 byte, true or false
    int: 4 bytes, -2 Bilion to +2 Billion
    long: 8 bytes
    float: 4 bytes
    double: 8 bytes 

  Type Conversion-
  byte->short->int->float->long->double (Widening/Implicit Conversion)
  If we want to do reverse then we have to type cast.
  int m = (int)(99.99f) (Narrowing/Explicit Conversion)

  Type Promotion-
  1. Java automatically promotes each byte, short, or char operand to int when evaluating an expression.
  2. If one operand is long, float or double the whole expression is promoted to long, float, double respectively.
  
  Square root: Math.sqrt();
 */