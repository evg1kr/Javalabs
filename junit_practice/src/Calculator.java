import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.NumberFormat;

public class Calculator {
    static double Calculate(double k, double x){
        try
        {
            /* чтение строки из буфера; метод readLine() требует обработки возможной ошибки при вводе c консоли в блоке try */
            //пробуем перевести строку в число
            double result = 0;
            double e = Math.pow(10,-k);
            double temp  = 1;
            int i = 0;
            while(temp>e) {
                result += temp;
                temp*=(x/(i+1));
                i++;
            }
            NumberFormat formatter = NumberFormat.getNumberInstance();
            formatter.setMaximumFractionDigits(3);
            System.out.println(formatter.format(result));
            return result;
        }
        catch (NumberFormatException e) //введено НЕ число, преобразовать к типу int нельзя
        {
            System.out.println("Не целое число");
            return 0;
        }
    }
    Calculator(){
    }
}
