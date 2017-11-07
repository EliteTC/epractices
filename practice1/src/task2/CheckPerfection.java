package task2;

public class CheckPerfection {
    static boolean check(int number){
        int sum = 1;
        for(int i=2; i <= number>>1 ; i++){
            if(number%i == 0) sum+=i;
        }
        return sum == number;
    }
}
