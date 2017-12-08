package task3;

import java.util.Stack;

public class RBT<Key extends Comparable<Key>,Value> {
    private static final boolean RED = true;
    private static final boolean BLACK = false;

    private class Node {
        Key key;
        Value val;
        Node left, right;
        int N;
        boolean color;

        Node(Key key, Value val, int N, boolean color) {
            this.key = key;
            this.val = val;
            this.N = N;
            this.color = color;
        }
    }
    private boolean isRed(Node x){
        if(x == null) return false;
        return x.color == RED;
    }

   private Node rotateLeft(Node x){
        Node y = x.right;
        x.right = y.left;
        y.left = x;
        y.color = x.color;
        x.color = RED;
        y.N = x.N;
        x.N = 1 + size(x.left)+size(x.right);
        return y;
    }

   private Node rotateRight(Node x){
        Node y = x.left;
        x.left = y.right;
        y.right = x;
        y.color = x.color;
        x.color = RED;
        y.N = x.N;
        x.N = 1 + size(x.left)+size(x.right);
        return y;
    }
    public int size(){
        return size(root);
    }
    private int size(Node x){
        if(x == null) return 0;
        return x.N;
    }

   private void flipColors(Node x){
        x.color = RED;
        x.left.color = BLACK;
        x.right.color = BLACK;
    }
    private Node root;

    public void put(Key key,Value val){
        root = put(root,key,val);
        root.color = BLACK;
        this.printTree();
    }
    private Node put(Node h,Key key,Value val){
        if(h == null)
            return new Node(key,val,1,RED);

        int cmp = key.compareTo(h.key);
        if(cmp<0) h.left = put(h.left,key,val);
        else if(cmp>0) h.right = put(h.right,key,val);
        else h.val = val;

        if(isRed(h.right) && !isRed(h.left)) h = rotateLeft(h);
        if(isRed(h.left) && isRed(h.left.left)) h = rotateRight(h);
        if(isRed(h.left) && isRed(h.right)) flipColors(h);

        h.N = size(h.left) + size(h.right) +1;
        return h;
    }

    public void printTree(){
        printTree(root);
    }
    private void printTree(Node n) {
        Stack<Node> stack = new Stack<> ();
        while (n!=null || !stack.empty()){
            if (!stack.empty()){
                n=stack.pop();
            }
            while (n!=null){
                System.out.print(n.val);
                if (n.right!=null) stack.push(n.right);
                n=n.left;
            }
        }
        System.out.println();
    }
}
