import java.util.Scanner;

public class калькулятор {
    public static void main(String[] args) {
        String[] actions = {"-", "+", "*", "/"};
        String[] regexActions = {"-", "\\+", "\\*", "/"};
        Scanner scn = new Scanner(System.in);
        System.out.println("Введите выражение");
        String exp = scn.nextLine();
        int actionIndex=-1;
        for (int i = 0; i < actions.length; i++){
            if(exp.contains(actions[i])){
                actionIndex = i;
                break;
            }
        }
        if (actionIndex==-1){
            System.out.println("Некорректное значение");
            return;
        }
        String[] data = exp.split(regexActions[actionIndex]);
        int a,b;

        a = Integer.parseInt(data[0]);
        b = Integer.parseInt(data[1]);

        int result;
        switch (actions[actionIndex]){
            case "+":
                result = a+b;
                break;
            case "-":
                result = a-b;
                break;
            case "*":
                result = a*b;
                break;
            default:
                result = a/b;
                break;
        }
        System.out.println(result);
    }
}
