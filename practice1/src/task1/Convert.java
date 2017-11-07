package task1;

public class Convert {
    public static void convertTo(int input,int base){
        if(input < 1){
            System.out.println("Invalid input");
            return;
        }
       System.out.println(convert(input, base));
    }
    private static char[] convert(int input, int base){
        char [] converted = new char [100];
        int counter = 0;
        int currentIndex=0;
        while(input>=1){
            int x = input%base;
            if(base==16) {
                if (x == 10) converted[currentIndex++]='A';
                else if (x == 11) converted[currentIndex++]='B';
                else if (x == 12) converted[currentIndex++]='C';
                else if (x == 13) converted[currentIndex++]='D';
                else if (x == 14) converted[currentIndex++]='E';
                else if (x == 15) converted[currentIndex++]='F';
                else converted[currentIndex++]= (char)((input%base)+'0');
            }
            else converted[currentIndex++]= (char)((input%base)+'0');
            input/=base;
            counter++;
        }

        return reverse(converted,counter);
    }

   private  static char[] reverse (char[] input, int size){
        char [] reversed = new char [size];
        for(int i=0; i< size;i++){
            reversed[i] = input[size-i-1];
        }
        return reversed;
    }
}
