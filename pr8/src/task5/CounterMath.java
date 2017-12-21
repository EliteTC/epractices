package task5;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;

public class CounterMath implements Callable<String> {
     class Node{
        String file;
        int quantity;

        public Node(String file, int quantity) {
            this.file = file;
            this.quantity = quantity;
        }

        public void increment(){
            this.quantity++;
        }
    }
    private File dir; private String word; private Node result;
    public CounterMath(File dir, String word) {
        this.dir = dir;
        this.word = word;
        this.result = new Node(dir.toString(),0);
    }
    public Node search(File ff) {
        try  {
            Scanner sc = new Scanner(new FileInputStream(ff));
            Node result = new Node(ff.toString(),0);
            boolean flag = false;
            while ( !flag && sc.hasNextLine()) {
                String str = sc.nextLine();
                String [] words = str.split(" ");
                for(String s : words)
                     if (str.startsWith(word)) {
                         flag = true;
                          result.increment();
                     }

            }
            return result;
        } catch (IOException e) { return null; }
    }

    public String call() {
      //  int count = 0;
        StringBuilder sb = new StringBuilder() ;
        try {
            File[] files = dir.listFiles();
            ArrayList<Future<String>> result = new ArrayList<>();

            for (File ff : files)
                if (ff.isDirectory()) {
                    CounterMath counter = new CounterMath(ff, word);
                    FutureTask<String> task = new FutureTask<>(counter);
                    result.add(task);
                    System.out.println("Starting new thread");
                    new Thread(task).start();
                }
                else {
                    System.out.println("Searching in file "+ff.toString());
                    Node node = search(ff);
                    if(node != null && node.quantity > 0) sb.append(node.file + ", quantity: "+ node.quantity+"\n");
                }
                  //  count++;
            for (Future<String> rez : result)
                sb.append(rez.get());
        } catch (ExecutionException | InterruptedException e) {
            e.printStackTrace();
        }
        return sb.toString();
        }
    }