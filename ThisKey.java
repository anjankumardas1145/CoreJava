class Example{
private int x;
private int y;
void fun1(int p,int q){
x=p;
y=q;
System.out.println(x);
System.out.println(y);
}
}
class ThisKey{
// in the ThisKey1 program check about this key word
public static void main(String args[]){
Example E1=new Example();
E1.fun1(2,7);
}
}
