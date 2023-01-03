package HW4;
// * В калькулятор добавьте возможность отменить последнюю операцию.
import java.util.Scanner;
import java.util.Vector;


public class task3 {
    private static Scanner sc = new Scanner(System.in);
    private static boolean goFuther = true;
    private static String action;
    public static Vector<Double> calculations = new Vector<>();

    public static void main(String[] args) {
        start();
    }

    public static void start(){
        System.out.println("Hello! You can start the calculations: ");
        while(goFuther == true){
            calculate();
        }
    }

    public static  String chooseOperation(){
        System.out.println("What to do?" +
            "\n + for add" +
            "\n - for minus" +
            "\n * for multiply" +
            "\n / for divide");
        
        String oper = sc.next();
        return oper;
    }

    public static double getFirstNumber(){
        System.out.println("Enter the first number: ");
        return sc.nextDouble();
    }

    public static double getSecondNumber(){
        System.out.println("Enter the second number: ");
        return sc.nextDouble();
    }

    public static void summa(double a, double b){
        calculations.addElement(a);
        calculations.addElement(b);
        calculations.addElement(a+b);
        System.out.println("Result is : " + (a+b));

    }

    public static void sub(double a, double b){
        calculations.addElement(a);
        calculations.addElement(b);
        calculations.addElement(a-b);
        System.out.println("Result is : " + (a-b));

    }

    public static void mult(double a, double b){
        calculations.addElement(a);
        calculations.addElement(b);
        calculations.addElement(a*b);
        System.out.println("Result is : " + (a*b));

    }

    public static void div(double a, double b){
        calculations.addElement(a);
        calculations.addElement(b);
        calculations.addElement(a/b);
        System.out.println("Result is : " + (a/b));

    }

    public static void getMenu(){
        int y = 0;
        while(y != 1){
            System.out.println("Enter the number with command, which you want to perform:");
            System.out.println("1. Calculate another operation");
            System.out.println("2. Show history");
            System.out.println("3. Exit");
            System.out.println("4. Cancel last operation. ");

            action = sc.next();
            if(action.equals("1")){
                y= 1;
                calculate();
            }else if(action.equals("2")){
                showHistory();
            }else if (action.equals("3")){
                y = 1;
                goFuther = false;
                exit();
            }else if(action.equals("4")){
                y = 1;
                cancelLast();
            }

        }
    }

    public static void showHistory(){
        for(int i = 0; i < calculations.size(); i++){
            System.out.println(calculations.get(i));
        }
    }

    public static void cancelLast(){
        calculations.removeElementAt(calculations.size()-3);
        calculations.removeElementAt(calculations.size()-2);
        calculations.removeElementAt(calculations.size()-1);
        System.out.println("The last operations was successfully deleted");
        for(double k : calculations){
            System.out.println(k);
        }
    }

    public static void exit(){
        System.out.println("Here is all results of operations that you done: ");
        for(int i = 0; i < calculations.size(); i++){
            System.out.println(calculations.get(i));
        }

        System.out.println("Goodbye!");
    }

    public static void calculate(){
        int x = 0; 
        String operation;
        while(x < 1){
            operation = chooseOperation();
            if(operation.equals("+")){
                double num1 = getFirstNumber();
                double num2 = getSecondNumber();
                summa(num1, num2);
                x = 1;
            }else if(operation.equals("-")){
                double num1 = getFirstNumber();
                double num2 = getSecondNumber();
                sub(num1, num2);
                x = 1; 
            }else if(operation.equals("*")){
                double num1 = getFirstNumber();
                double num2 = getSecondNumber();
                mult(num1, num2);
                x = 1; 
            }else if(operation.equals("/")){
                double num1 = getFirstNumber();
                double num2 = getSecondNumber();
                div(num1, num2);
                x = 1; 
            }
        }
        if(x == 1){
            getMenu();
        }
    }
}
