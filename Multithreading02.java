class Process1 extends Thread{
public void run(){
for(int i=0;i<=10;i++){
System.out.println("Process1: " +i);
}
}
}

class Process2 extends Thread{
public void run(){
for(int i=0;i<=10;i++){
System.out.println("Process2: " +i);
}
}
}
class Process3 extends Thread{
public void run(){
for(int i=0;i<=10;i++){
System.out.println("Process3: " +i);
}
}
}


class Multithreading02{
public static void main(String args[]){
Process1 p1=new Process1();
Process2 p2=new Process2();
Process3 p3=new Process3();


p1.start();//here Thread is the parent class so we can access its all method and data member 
p2.start();
p3.start();
}
}

