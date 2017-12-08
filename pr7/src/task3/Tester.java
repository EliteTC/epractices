package task3;

public class Tester {

    public static void main(String[] args) {
      RBT<Integer,Integer> tree = new RBT<>();
        tree.put(1,1);
        tree.put(2,2);
        tree.put(3,3);
        tree.put(4,4);
        tree.put(5,5);
        tree.put(6,6);
        tree.put(7,7);
        tree.put(8,8);
        tree.put(9,9);
        tree.put(10,10);

        RBT<Integer,Integer> tree2 = new RBT<>();
        tree2.put(2,2);
        tree2.put(4,4);
        tree2.put(1,1);
        tree2.put(5,5);
        tree2.put(3,3);
        tree2.put(7,7);
        tree2.put(6,6);
        tree2.put(9,9);
        tree2.put(8,8);
        tree2.put(10,10);



    }
}
