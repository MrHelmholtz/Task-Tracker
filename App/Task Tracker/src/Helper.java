import java.util.Scanner;

public class Helper {
    static Scanner scan = new Scanner(System.in);
    static boolean yesOrNoMenu(String question){
        int looper = -1;
        byte counter = 0;
        System.out.println(question);
        System.out.println("1)Yes");
        System.out.println("2)No");
        while(looper != 1 && looper != 2){
            looper = scan.nextInt();
            if(counter % 5 == 0){
                System.out.println("Well, you could forget, what the question was...");
                System.out.println(question);
                System.out.println("1)Yes");
                System.out.println("2)No");
            }
            counter++;
        }
        return looper == 1;
    }
}
