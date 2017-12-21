package task5;

import java.io.*;
import java.util.Scanner;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter directory -> ");
        String dir = sc.next();
        System.out.print("Enter keyword -> ");
        String word = sc.next();
        CounterMath counter = new CounterMath(new File(dir), word);

        FutureTask<String> task = new FutureTask <> (counter);
        new Thread(task).start();
        try (Writer writer = new BufferedWriter(new OutputStreamWriter(
                    new FileOutputStream("result.txt"), "utf-8"))) {
                writer.write(task.get());
                System.out.println(task.get());
        } catch (UnsupportedEncodingException e1) {
            e1.printStackTrace();
        } catch (IOException e1) {
            System.out.println("Wrong input, try again!+\n");
            main(args);
        } catch (ExecutionException | InterruptedException e) {
            System.out.println("Wrong input, try again!+\n");
            main(args);
        }
    }
}
