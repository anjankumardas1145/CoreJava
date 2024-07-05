class Example{
private int x;
private int y;
void fun1(int x,int y){
this.x=x;
this.y=y;
System.out.println(x);
System.out.println(y);
}
}
class ActualThisKeyWordUse{
// in the ThisKey1 program check about this key word
public static void main(String args[]){
Example E1=new Example();
E1.fun1(2,7);
}
}
