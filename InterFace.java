	interface A{
void show();//by default in interface every method is "abstract public"
void drive();
//int age;error bcz variable in bydefault final and static so we need to declare the value
int age=22;
}
class B implements A{
//here we are mendatory to use the method of A
public void show(){
System.out.println("Shoe function");
}
public void drive(){
System.out.println("Drive function");
}
}
public class InterFace{
public static void main(String args[]){
A b1=new B();
b1.show();
b1.drive();
}
}
//we can not create object of interface