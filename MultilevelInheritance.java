class India{
int a,b;
void fun1(){
System.out.println("function one Executed");
}
void fun2(){
System.out.println("Function two Executed");
}
}
class Odisha extends India{
int x=8;
void fun3(){
System.out.println("Function three Executed");
}
}
class Balasore extends Odisha{
void fun4(){
System.out.println("Function four Executed");
}
}
class MultilevelInheritance{
public static void main(String args[]){
Balasore Jls=new Balasore();
System.out.println(Jls.x);
Jls.fun3();
Jls.fun2();
}}
