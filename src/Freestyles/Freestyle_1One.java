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
    }
}
