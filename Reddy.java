class Mobile{
int value;
 static String name;
String brand;
void display(){
System.out.println(name+"  , "+ brand+" ,  "  +value);
}
}
class Reddy{
public static void main(String args[]){
Mobile obj1=new Mobile();
Mobile.name="Realme";
obj1.brand="RealmeX12";
obj1.value=12000;
Mobile obj2=new Mobile();
Mobile.name="Realme";
obj2.brand="Realme 8 5G";
obj2.value=13000;
obj1.display();
obj2.display();
}
}
