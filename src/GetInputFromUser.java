import java.util.Scanner;

public class GetInputFromUser {
    public static void main(String[] args){
        // Using Scanner for Getting Input from User//
        Scanner in = new Scanner(System.in);
        String a = in.nextLine();
        System.out.println("Entered string  is :" + a);
        int num = in.nextInt();
        System.out.println("Entered number is:" + num);

        //Note that this program does not work on IDEs as
        // System.console() may require console
        String name= System.console().readLine();
        System.out.println("Entered name is:" + name);


    }
}
