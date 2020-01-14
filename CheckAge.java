public class CheckAge{
    static void checkAge(int age){
        if(age < 18){
            System.out.println("Under 18");
        }
        else {
            System.out.println("over 18");
        }

    }

    public static void main(String[] args) {
        checkAge(19);
    }
}