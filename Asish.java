class Anjan{
int a;//instance(object) member variable
int b;//instance(object) member variable
void fun1(){//instance(object) member function
System.out.println("Jay Shree Ram");
}
void fun2(){
System.out.println("Anjan kumar Das");
}
}
class Asish{
public static void main(String args[]){
Anjan A=new Anjan();
A.a=5;
System.out.println(A.a);
A.fun1();//here if i write Anjan.fun1(),it show me error bcz main function is a static function and fun1() is not a static //  
               //function,so here  i need to call throw object
A.fun2();
}
}