class A{
int a;
public void show(){
System.out.println("A's Show");
}
 static class B{
public void config(){
System.out.println("B's shows");
}
}
}
public class StaticInnerClass{
public static void main(String args[]){
A A1=new A();
A1.show();

A.B B1=new A.B();//here the inner class is static,i.estatic class B, so we donot need the object of A
//N:B-we donot make class A is static
B1.config();
}
}