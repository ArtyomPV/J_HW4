import java.io.IOException;
import java.util.Scanner;
import java.util.Stack;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class Htask3 {

    double result = 0;
    char action;
    double number1;
    double number2;
    boolean flag = true;
    String[] texts = {"\nВведите первое число: ",
            "\nВведите действие (+, -, *, /): ",
            "\nВведите второе число: "};
    Scanner sc = new Scanner(System.in);

    Htask3() throws IOException {
        startCalculate();
    }


    private void startCalculate() throws IOException {
        result = enterNumber(texts[0]);

        action = enterAction(texts[1]);
        number2 = enterNumber(texts[2]);
    }
    private double enterNumber(String text) throws IOException {
        double number;
        Logger logger = startLogger();
        FileHandler file =  startFileHandler(logger);

        System.out.print(text);
        number = sc.nextDouble();
        logger.info("Введено первое число: " + number);
        closeFileHandler(file);

        return number;
    }

    private char enterAction(String text) throws IOException {
        char symbol;
        Logger logger = startLogger();
        FileHandler file =  startFileHandler(logger);

        System.out.print(text);
        symbol = sc.next().charAt(0);
        logger.info("Введено первое число: " + symbol);
        closeFileHandler(file);

        return symbol;
    }

    private void Operations() throws IOException {


        Logger logger = startLogger();
        FileHandler file =  startFileHandler(logger);
        if (action == '+') {
            System.out.printf("\n%.2f %c %.2f = %.2f", result, action, number2, result = result + number2);
            logger.info(String.valueOf(result) + '+' + (number2) + '=' + (number1 + number2));
        } else if (action == '-') {
            System.out.printf("\n%.2f %c %.2f = %.2f", result, action, number2, result = result - number2);
            logger.info(String.valueOf(result) + '-' + (number2) + '=' + (number1 - number2));
        } else if (action == '*') {
            System.out.printf("\n%.2f %c %.2f = %.2f", result, action, number2, result = result * number2);
            logger.info(String.valueOf(result) + '*' + number2 + '=' + number1 * number2);
        } else if (action == '/') {
            if (number2 != 0) {
                System.out.printf("\n%.2f %c %.2f = %.2f", result, action, number2, result = result / number2);
                logger.info(String.valueOf(result) + '/' + number2 + '=' + result / number2);
            } else {
                System.out.print("\nНа ноль делить нельзя");
                logger.info("На ноль делить нельзя.");
            }
//        } else if (action == 'Q') {
//            flag = false;
//        } else if(action == '!'){
//            System.out.println("Удаленное значение: " + stack.pop());
//            action = enterAction(texts[1]);
//            number2 = enterNumber(texts[2]);

        }  else {
            System.out.print("Действие не распознано.");
            logger.info("Действие не распознано.");
        }
        System.out.println();
        closeFileHandler(file);


    }

    public void Calculate() throws IOException {
        Stack<Double> stack = new Stack<>();
        stack.push(result);
        Operations();
        stack.push(result);
        while(flag){
            action= enterAction("""
                                    Введите N для продолжения вычисления
                                    Введите S для нового вычисления
                                    Введите Q для выхода из программы
                                    Введите ! для отмены последней операции
                                    """);
            switch (action) {
                case '!' -> {
                    stack.pop();
                    result = stack.peek();
                    System.out.println("последнея операция отменена! Первое значение: " + result);
                    action = enterAction(texts[1]);
                    number2 = enterNumber(texts[2]);
                    Operations();
                    stack.push(result);
                }
                case 'Q' -> flag = false;
                case 'S' -> startCalculate();
                case 'N' -> {
                    action = enterAction(texts[1]);
                    number2 = enterNumber(texts[2]);
                    Operations();
                    stack.push(result);
                }
            }
        }

    }



    private Logger startLogger(){
        Logger logger = Logger.getLogger(Htask3.class.getName());
        logger.setLevel(Level.INFO);
        return logger;
    }

    private FileHandler startFileHandler(Logger logger) throws IOException {
        FileHandler file = new FileHandler("Task4log.txt", true);
        logger.addHandler(file);
        file.setFormatter(new SimpleFormatter());
        return file;
    }
    private void closeFileHandler(FileHandler file) {
        file.close();
    }

}