package HomeWork1;
public class Task3 {
    public static void main(String[] args) {
        int a = 7;
        char op = '/';
        int b = 8;
        System.out.println(calculate(op, a, b));
    }
    static int calculate(char op, int a, int b) {
        switch (op) {
            case '+':
                return a + b;
            case '-':
                return a - b;
            case '*':
                return a * b;      
            default:
                return a / b;
        }
      }
}   
