public class King {
    public static void main(String[] args) {
        System.out.println("Hello World! I am A \nKing");
        System.out.println("Hello World!");
        
        int num = (char) '5';
        System.out.println(num);
        System.out.println((num));
        int res = ~num;
        System.out.printf("%n%d",res);

        int range = 30;
        int [] prime;
        for (int i = 0; i < range; i++){
            // if(i>1 &i)

        }

    }

    public class PrimeNumbers {
        public static void main(String[] args) {
            int start = 1;
            int end = 30;

            System.out.println("Prime numbers between " + start + " and " + end + ":");
            for (int num = start; num <= end; num++) {
                if (isPrime(num)) {
                    System.out.print(num + " ");
                }
            }
        }

        // Function to check if a number is prime
        static boolean isPrime(int num) {
            if (num <= 1) {
                return false;
            }
            for (int i = 2; i <= Math.sqrt(num); i++) {
                if (num % i == 0) {
                    return false;
                }
            }
            return true;
        }
    }

}
