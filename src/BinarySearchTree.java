class Node {
    int value;
    Node left, right;

    public Node(int value) {
        this.value = value;

        right = null;
        left = null;
    }
}

public class BinarySearchTree {
    public Node root;

    public void insert(int value) {
        root = insert(root, value);
    }

    private Node insert(Node root, int value) {
        if(root == null) {
            root = new Node(value);
            return root;
        }
        else if (value < root.value)
            root.left = insert(root.left, value);

        else if (value > root.value)
            root.right = insert(root.right, value);

        return root;
    }




    public boolean contains(int value) {
        return contains(root, value);
    }

    public boolean contains(Node root, int value) {
        if(root == null)
            return false;
        else if (root.value == value)
            return true;
        else if (value < root.value)
            return contains(root.left, value);

        else
            return contains(root.right, value);
    }


    public int min() {
        if (root == null)
            return 0;
        else
            return minValue(root);
    }

    public int minValue(Node root) {
        int minValue = root.value;
        while (root.left != null) {
            root = root.left;
            minValue = root.value;
        }
        return minValue;
    }


    public int max() {
        if (root == null)
            return 0;
        else
            return maxValue(root);
    }

    public int maxValue(Node root) {
        int maxValue = root.value;
        while (root.right != null) {
            root = root.right;
            maxValue = root.value;
        }
        return maxValue;
    }




    public int size() {
        return size(root);
    }

    public int size(Node root) {
        if (root == null)
            return 0;
        else
            return size(root.left) + size(root.right) + 1;
    }


    public int height() {
        return height(root);
    }

    public int height(Node root) {
        if (root == null)
            return 0;
        else {
            int leftHeight = height(root.left);
            int rightHeight = height(root.right);
            return Math.max(leftHeight, rightHeight) + 1;
        }
    }


    public int countLeaves() {
        return countLeaves(root);
    }

    public int countLeaves(Node root) {
        if(root == null)
            return 0;

        else if(root.left == null && root.right == null)
            return 1;
        else
            return countLeaves(root.left) + countLeaves(root.right);
    }


    @Override
    public String toString() {
        StringBuilder stringbuilder = new StringBuilder();
        preOrder(root, stringbuilder);
        return stringbuilder.toString();
    }

    public void preOrder(Node root, StringBuilder sb) {
        if (root != null) {
            sb.append(root.value).append(" ");
            preOrder(root.left, sb);
            preOrder(root.right, sb);
        }
    }
}