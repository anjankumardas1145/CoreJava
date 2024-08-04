	interface A{
void show();  //by default in interface every method is "abstract public"
void drive();
                          //int age;error bcz variable in bydefault final and static so we need to declare the value
int age=22;
}
interface C{
/*void run(){
System.out.println("Running function of interface C");
}*/
      void display();


int age=21;
String name="Anjan";
}
class B implements A,C{//A class can implement multiple interface
//here we are mendatory to use the method of A
public void show(){
System.out.println("Shoe function");
}
public void drive(){
System.out.println("Drive function");
}
public void display(){
System.out.println("Iam the Display function");
}

}
public class InterFace{
public static void main(String args[]){
B b1=new B();
b1.show();
b1.drive();
b1.display();
System.out.println("My age is " +C.age);
}
}
//we can not create object of interface