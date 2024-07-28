class Human{
private int age=22;
private String name="Anjan";
public int getAge(){
return age;
}
public String getName(){
return name;
}
}
public class Encapsulation01{
public static void main(String args[]){
Human H1=new Human();
System.out.println(H1.getAge() + " : " +H1.getName());
}
}


