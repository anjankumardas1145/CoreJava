class A{
int a;
public void show(){
System.out.println("A's Show");
}
class B{
public void config(){
System.out.println("B's shows");
}
}
}
public class InnerClass{
public static void main(String args[]){
A A1=new A();
A1.show();

A.B B1=A1.new B();//if we want to create an object of inner class i.e B we need to the object of A ,here the object is of A is A1
B1.config();
}
}
