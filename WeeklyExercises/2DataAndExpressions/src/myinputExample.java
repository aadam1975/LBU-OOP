import java.util.Scanner;

public class myinputExample{

}


    public static void main(String[] args) {
        System.out.println("Please Enter your name: ");

        Scanner scan = new Scanner(System.in);
        String personName = scan.nextLine();

        System.out.println("Hello" + personName);

        scan.close()
    }
}