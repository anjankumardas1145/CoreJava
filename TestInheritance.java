class India{
int ricePrice;
int wheatPrice;
void fun1(){
System.out.println("Function one executed");
}
void fun2(){
System.out.println("Function two executed");
}
}
class Odisha extends India{
void fun3(){
System.out.println("Function 3 executed");
}
}
class TestInheritance{
public static void main(String args[]){
Odisha bls=new Odisha();
India Delhi=new India();
Delhi.fun2();
bls.fun1();
bls.fun2();
bls.fun3();
}
}
