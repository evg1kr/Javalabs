import java.io.*;
import java.text.*;
public class Main {
    public static void main(String[] args) throws IOException {
        try{
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        String line = br.readLine();
        double x = Integer.parseInt(line);
        line = br.readLine();
        double k = Double.parseDouble(line);
        Calculator a = new Calculator();
        a.Calculate(k,x);
    }
        catch (IOException e)
        {
            System.out.println("Ошибка чтения с клавиатуры");
        }
    }
}