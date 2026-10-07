public class UserImpl
{
    public static void main(String[] args) {
        BST bst = new BST();
        System.out.println(bst.add(10)); // true
        System.out.println(bst.add(5));  // true
        System.out.println(bst.add(10)); // false - duplicate
        System.out.println(bst.add(15)); // true - this was returning false in your code
        System.out.println(bst.size());
        System.out.println("----");// 3
        bst.pre_order();
        System.out.println("----");
        bst.post_order();
        System.out.println("----");
        bst.in_order();
    }
}
