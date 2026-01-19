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
            counter++;
            looper = scan.nextInt();
            if(counter % 5 == 0){
                System.out.println("Well, you could forget, what the question was...");
                System.out.println(question);
                System.out.println("1)Yes");
                System.out.println("2)No");
            }
        }
        scan.nextLine(); // Remove '\r' after scan.nextInt()
        return looper == 1;
    }

    static int selectOption(String question, String ...options){
        int looper = -1;
        byte counter = 0;
        System.out.println(question);
        showOptions(options);
        while(looper < 1 || looper > options.length+1){
            counter++;
            looper = scan.nextInt();
            if(counter % 5 == 0){
                System.out.println("Well, you could forget, what the question was...");
                System.out.println(question);
                for (int i = 0; i < options.length; i++) {
                    System.out.println(i + 1 + ")" + options[i]);
                }
            }
        }



        scan.nextLine(); // Remove '\r' after scan.nextInt()
        return looper-1;
    }

    static void showOptions(String ...options){
        if (options.length == 0){
            System.out.println("No available options");
        }
        for (int i = 0; i < options.length; i++) {
            System.out.println(i + 1 + ")" + options[i]);
        }
        System.out.println(options.length+1+")"+"Exit");
    }

    public void

    static int adjustMenu(String question){
        int looper = -1;
        byte counter = 0;
        System.out.println(question);
        System.out.println("1)Name");
        System.out.println("2)Description");
        System.out.println("3)Data");
        while(looper < 1 || looper > 3){
            counter++;
            looper = scan.nextInt();
            if(counter % 5 == 0){
                System.out.println("Well, you could forget, what the question was...");
                System.out.println(question);
                System.out.println("1)Name");
                System.out.println("2)Description");
                System.out.println("3)Data");
            }
        }
        scan.nextLine(); // Remove '\r' after scan.nextInt()
        return looper;
    }
}
