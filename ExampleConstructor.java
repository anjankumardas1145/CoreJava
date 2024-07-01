class Demo{
int x,y;
String s;
Demo(int x,int y){
System.out.println(this.x=x);
System.out.println(this.y=y);
}
Demo(){
System.out.println("Anjan Kumar Das");
}
void fun1(){
int x=10;
System.out.println("the value of x is: " +x);
}
Demo(int x,String s,int y){
System.out.println((this.x=x )+ " "+( this.s=s)+ "  " + (this.y=y));
}
}
class ExampleConstructor{
public static void main(String args[]){
Demo D1=new Demo();//op is :Anjan kumar Das
Demo D2=new Demo(1,2);//first constructor is two interger argument passed
Demo D3=new Demo(4,"Anuska", 5);
//Demo D4=new Demo();
D3.fun1();
D1.fun1();
D2.fun1	();
}
}
