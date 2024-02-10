public class Main {
    public static void main(String[] args) {

        for (int a = 1; a < 1000; a++) {

            int sumDivisorsA = 0;

            for (int i = 1; i < a; i++) {
                if (a % i == 0) {
                    sumDivisorsA += i;
                }
            }

            for (int b = 1; b < a; b++) {

                int sumDivisorsB = 0;

                for (int j = 1; j < b; j++) {
                    if (b % j == 0) {
                        sumDivisorsB += j;
                    }
                }

                if (a == sumDivisorsB && b == sumDivisorsA) {
                    System.out.println("a = " + a + " | b = " + b);
                    break;  // Break the inner loop when a match is found
                }
            }
        }
    }
}

