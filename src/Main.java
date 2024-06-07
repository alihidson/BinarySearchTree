public class Main {
    public static void main(String[] args) {

        BinarySearchTree BST = new BinarySearchTree();

        BST.insert(13);
        BST.insert(3);
        BST.insert(14);
        BST.insert(1);
        BST.insert(4);
        BST.insert(18);
        BST.insert(2);
        BST.insert(12);
        BST.insert(10);
        BST.insert(5);
        BST.insert(11);
        BST.insert(8);
        BST.insert(7);
        BST.insert(9);
        BST.insert(6);

        System.out.println("Contains 4: " + BST.contains(4));
        System.out.println("Contains 12: " + BST.contains(12));
        System.out.println("Contains 15: " + BST.contains(15));
        System.out.println("Contains 1: " + BST.contains(1));
        System.out.println("Contains 5: " + BST.contains(5));
        System.out.println();

        System.out.println("Minimum value: " + BST.min());
        System.out.println("Maximum value: " + BST.max());
        System.out.println();

        System.out.println("Size: " + BST.size());
        System.out.println("Height: " + BST.height());
        System.out.println("Number of leaves: " + BST.countLeaves());
        System.out.println();

        System.out.println("In-order (DFS): " + BST.toString());
        System.out.println();

    }
}