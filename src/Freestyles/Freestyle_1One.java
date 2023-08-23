package Freestyles;

public class Freestyle_1One {
    public static void main(String[] args) {
        System.out.println("\n Hello Universe");
        String name = "James Baldwin";

        for(char i : name.toCharArray() ){
            System.out.printf("%nThis is the letter %c%n", i);
        }
    }
}
