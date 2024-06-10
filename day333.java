class A{
int x;
private static int y;

void fun1(){
y=5;
}
 void fun2(){
System.out.println(y);
}
void fun3(){
y=8;
}
}

class day333{
public static void main(String args[]){
A a1=new A();
A a2=new A();
a1.fun1();//5
a2.fun3();//8
a1.fun2();
}
}
