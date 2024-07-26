class ExaConstructor{
int x,y;
void fun(){
System.out.println("Function 1");
}
ExaConstructor(){
System.out.println("Parent class constructor");
}
}
class SubCon extends ExaConstructor{
int z;
void fun2(){
System.out.println("Function 2");
}
SubCon(){
System.out.println("child class constructor");
}
}
class Constructor2{
public static void main(String args[]){
SubCon sb=new SubCon();
}
}
