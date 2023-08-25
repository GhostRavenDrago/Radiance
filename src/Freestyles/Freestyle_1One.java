package Freestyles;

import java.util.Random;

public class Freestyle_1One {

    public static void main(String[] args) {
        System.out.printf("Hello Universe%n");
        String name = "James Baldwin";
        Random rand = new Random();
        int N = rand.nextInt(20);
        for (char i : name.toCharArray()) {
            System.out.printf("%nThis is the letter %c-> %d%n", i, N);
        }
        jupiter(N);
        String Dunking = new String (Manipulation());
        System.out.println(Dunking.toUpperCase());
    }

    static int[] jupiter(int N) {
        int[] fib = new int[N];
        fib[0] = 0;
        fib[1] = 1;
        for (int i = 2; i < N; i++) {
            fib[i] = fib[i - 1] + fib[i - 2];
            System.out.println(fib[i] + "\n");
        }
        return fib;
    }

    static String Manipulation(){
        String saint = new String ("Jungle is King");
        return saint;
    }
}
