class Human{
private int age;
private String name;
public int getAge(){
return age;
}
public void setAge(int a){
age=a;
}
public void setName(String nm){
name=nm;
}
public String getName(){
return name;
}
}
public class Encapsulation02{
public static void main(String args[]){
Human H1=new Human();
H1.setAge(22);
H1.setName("Anjan");

System.out.println(H1.getAge() + " : " +H1.getName());
}
}


