package task3;

public class BuildPyramide {
    static void build(int high){
        if (high < 1 || high > 9){
            System.out.println("Invalid input");
            return;
        }

        for(int i = 1; i<= high; i++){
            for(int k = high-i; k>0; k--){
                System.out.print(' ');
            }
            for(int j=1; j<=i;j++){
                System.out.print(j);
            }
            for(int j=i-1; j>=1;j--){
                System.out.print(j);
            }
            System.out.print('\n');

        }
    }
}
