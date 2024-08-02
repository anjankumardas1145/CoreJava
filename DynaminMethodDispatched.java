class A{
public void show(){
System.out.println("Iam A 's Show");
}
}
class B extends A{
public void show(){
System.out.println("Iam B 's Show");
}
}
class C extends A{
public void show(){
System.out.println("Iam C's Show");
}
}
public class DynaminMethodDispatched{// it is also called run time polymorphism
public static void main(String args[]){
A obj=new A();
obj.show();
obj=new B();
obj.show();
 obj=new C();
obj.show();
}
}
//N:B:-point to remember here is irrespective of what type of object you hava or what type of variable you create it depends upon what type of object you have ..
// and another thing is it is only possible when we use inheritance