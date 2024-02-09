package src.seminar11.task2;

public class CaclController {
    private CalcModel calcModel;

    private CalcView calcView;

    public CaclController(CalcModel calcModel, CalcView calcView) {
        this.calcModel = calcModel;
        this.calcView = calcView;
    }

    public void runCalc() {
        System.out.println("Выберите операцию: \n+ - сложить\n- - вычесть\n* - умножить\n/ - разделить");
        String operation = calcView.getUserChois();
        double num1 = calcView.getUserInputNumber1();
        double num2 = calcView.getUserInputNumber2();
        switch (operation) {
            case "+":
                System.out.println(calcModel.summary(num1, num2));
                break;
            case "-":
                System.out.println(calcModel.difference(num1, num2));
                break;
            case "*":
                System.out.println(calcModel.multiplication(num1, num2));
                break;
            case "/":
                System.out.println(calcModel.division(num1, num2));
                break;
            default:
                System.out.println("Неверная операция");
        }
    }

    public static void main(String[] args) {
        CalcModel model = new CalcModel();
        CalcView view = new CalcView();
        CaclController controller = new CaclController(model, view);
        controller.runCalc();
    }

}
