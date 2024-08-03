class A{
int a;
public void show(){
System.out.println("A's Show");
}
}
public class AnnonimousClass{
public static void main(String args[]){

A A1=new A(){
public void show(){
System.out.println("main's Show");
}
};
A1.show();
}
}