
public class BST {
    Node root;
    int count = 0;
    boolean flag; // don't init here

    public boolean add(int key) {
        flag = true; // FIX 1: Reset flag for every add call
        root = add(key, root);
        return flag;
    }

    private Node add(int key, Node n) {
        if (n == null) {
            count++;
            return new Node(key);
        }
        if (key < n.key) {
            n.left = add(key, n.left);
        } else if (key > n.key) {
            n.right = add(key, n.right);
        } else {
            flag = false; // FIX 2: duplicate found
        }
        return n;
    }

    public int size() {
        return count;
    }

    public void post_order()
    {
        Post_order(root);
    }
    public void pre_order()
    {
        Pre_order(root);
    }
    public void in_order()
    {
        In_order(root);
    }

    public void Post_order(Node n)
    {
        if(n==null)
        {
            return;
        }
        Post_order(n.left);
        Post_order(n.right);
        System.out.println(n.key+" ");
    }

    public void Pre_order(Node n)
    {
        if(n==null)
        {
            return;
        }
        System.out.println(n.key+" ");
        Pre_order(n.left);
        Pre_order(n.right);
    }
    public void In_order(Node n)
    {
        if(n==null)
        {
            return;
        }
        In_order(n.left);
        System.out.println(n.key+" ");
        In_order(n.right);
    }
}