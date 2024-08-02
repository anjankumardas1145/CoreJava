// Final class
 final class  FinalMain{
    // Method in final class
    public void display() {
        System.out.println("This is a method in a final class.");
    }
}

// Attempting to subclass a final class will result in a compilation error
// Uncommenting the following code will cause an error
/*
class SubClass extends FinalMain {
    // This will cause a compilation error
}
*/

public class  FinalClass {
    public static void main(String[] args) {
      FinalMain   obj = new FinalMain();
        obj.display();
    }
}
