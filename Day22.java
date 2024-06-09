class Example{
int x;
int y;

void fun1(){
System .out.println("Anjan");
}
void fun2(){
System.out.println("abcde");
}
}




class Day22{
public static void main(String[] args){
Day2 D=new Day2();
Example e=new Example();
e.fun1();
e.fun2();
e.x=5;
System.out.println(e.x);
D.fun3();
}
void fun3(){
System.out.println("Ankita");
}
}