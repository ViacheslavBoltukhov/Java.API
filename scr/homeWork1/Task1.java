package scr.homeWork1;
public class Task1 {
    public static void main(String[] args) {
        int num = 5;
        System.out.println(countNTriangle(num));
    }
    static int countNTriangle(int n){
        int summa = 0;
        for (int i = 1; i < n + 1; i++) {
            summa += i;
        }
        return summa;
    }
}   
