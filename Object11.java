class mahesh{
void fun1(){
System.out.println("A");
}


void fun2(){

System.out.println("b");
}
}

class manash{

static void fun1(){
System.out.println("Hey manash");
}

static void fun2(){
System.out.println("Function2");
}
}
class Manasi{
static void fun1(){
System.out.println("hey iam manasi");
}
}


class Object11{
static void fun1(){
System.out.println("gg");
}
public static void main(String args[])
{
mahesh m1=new mahesh();
m1.fun1();
m1.fun2();
fun1();
manash.fun1();
Manasi.fun1();


}

}