class Nokia{
private int mic;
private int cam;
 void setValue(){

mic=2;
cam=45;

}
void display(){
System.out.println(mic + "and"+ cam);

}
}



 class classesAndObjects
{
public static void main(String args[])
{
Nokia N1=new Nokia();
N1.display();
N1.setValue();
N1.display();

}
}
