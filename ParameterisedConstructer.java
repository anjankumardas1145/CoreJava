class Demo{
int x,y;
String s;
Demo(int x,String s){
System.out.println(this.x=x);
System.out.println(this.s=s);

}
Demo(int x,int y){
System.out.println(this.x=x);
System.out.println(this.y=y);

}
}
class ParameterisedConstructer{
public static void main(String args[]){
Demo D1=new Demo(3,"Ankita");
Demo D2=new Demo(4,5);
}
}


