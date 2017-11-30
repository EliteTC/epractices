public class Main {

    public static void main(String [] args){


       for(Season x : Season.values()){
           System.out.println(x.name() + " : "+ x.ordinal());
       }
    }
}
