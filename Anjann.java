class Demo{
int y;
private static int x;
 void fun1(){
y=5;

}
void fun2(){
System.out.println(y);
}
void fun3(){
y=45;
}
}
class Anjann{
public static void main(String args[]){
Demo d=new Demo();
Demo d1=new Demo();

d.fun1();
d1.fun3();
d1.fun2();


}
}