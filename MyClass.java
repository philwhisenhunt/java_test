public class MyClass{
    int x =5;
    static void myMethod() {
        System.out.println("I just got executed!");
    }

    public static void main(String[] args) {
        MyClass myObj = new MyClass();
        System.out.println(myObj.x);
    }
}