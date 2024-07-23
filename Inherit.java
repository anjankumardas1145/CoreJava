class Anjan{
int a,b;
void fun1(){
System .out.println ("Anjan Kumar Das");

}
void fun2(){

}
}
class Ranjan extends Anjan{
void fun3(){
System .out.println ("Anjan Kumar Das");
}
}
class Inherit{
public static void main(String args[]){
Ranjan R1=new Ranjan();
R1.fun1();
}
}
