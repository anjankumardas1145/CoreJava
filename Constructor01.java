class Demo{
int x,y;
Demo(){
x=11;
y=04;
}
void f1(){
x=05;
y=06;
}
}
// guess the out put of the program
class Constructor01{
public static void main(String args[]){
Demo D1=new Demo();
D1.f1();
System.out.println(D1.x);
System.out.println(D1.y);
}
}
