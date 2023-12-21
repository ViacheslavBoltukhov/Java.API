package scr.homeWork1;

public class Task2 {
    public static void main(String[] args) {
        printPrimeNums();
    }
    static void printPrimeNums(){
        int[] prime = new int[1000];
        for (int i = 0; i < 1000; i++) {
            prime[i] = i;
        }
        prime[1] = 0;
        for (int i = 2; i < prime.length; i++) {
            for (int j = i + i; j < prime.length; j += i) {
                prime[j] = 0;
            }
            
        }
        for (int i = 0; i < prime.length; i++) {
            if (prime[i] > 0){
                System.out.println(prime[i]);
            }
        }
    }
}
