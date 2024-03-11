import java.util.Scanner;

public class Input {
    public static void main(String[] args){
        String s1 = new String("kjhkjh");
        Scanner s = new Scanner(System.in);
        System.out.println("Put symbol");
        s1 = s.nextLine();
        System.out.println("Input was "+s1);
    }
}
