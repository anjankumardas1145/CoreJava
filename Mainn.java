class Calculator{
public final void show(){
System.out.println("Hey iam show function");
}
}
class advCalculator extends Calculator{
public  void show01(){
System.out.println("I am show01 fun if sub class");
}
}
 public class Mainn{
public static void main(String args[]){

advCalculator a=new advCalculator();
a.show();
}
}
//final method can not be override