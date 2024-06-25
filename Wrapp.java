import java.util.*;

class Wrapp{
public static void main(String args[]){
int y=Integer.parseInt("123");

Integer x=Integer.valueOf("1001",2);
int a=x.intValue();

Double A=Double.valueOf("56");
double ans=A.doubleValue();
System.out.println(ans);
System.out.println(a);
System.out.println(y);
}
}

