 class Anjan{
static int sum(int a,int b){
return a+b;
}
static int sum(int a,int b,int c){
return a+b+c;
}
}
class Train{
public static void main(String args[]){
Anjan A=new Anjan();
System.out.println("the sum is:"+A.sum(8,9));
System.out.println("the sum is:"+A.sum(8,9,6));

}
}