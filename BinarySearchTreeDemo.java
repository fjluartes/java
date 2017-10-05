// BinarySearchTree: Binary search tree implementation in Java
class Node<T> {
    public int value;
    public Node left;
    public Node right;
    public Node(int value) {
        this.value = value;
    }
}

class BinarySearchTree {
    public Node root;
    public BinarySearchTree insert(int value) {
        Node node = new Node<>(value);
        if (root == null) {
            root = node;
            return this;
        }
        insertRec(root, node);
        return this;
    }

    private void insertRec(Node latestRoot, Node node) {
        if (latestRoot.value > node.value) {
            if (latestRoot.left == null) {
                latestRoot.left = node;
                return;
            } else {
                insertRec(latestRoot.left, node);
            }
        } else {
            if (latestRoot.right == null) {
                latestRoot.right = node;
                return;
            } else {
                insertRec(latestRoot.right, node);
            }
        }
    }

    public int findMinimum() {
        if (root == null) {
            return 0;
        }
        Node currNode = root;
        while (currNode.left != null) {
            currNode = currNode.left;
        }
        return currNode.value;
    }

    public int findMaximum() {
        if (root == null) {
            return 0;
        }
        Node currNode = root;
        while (currNode.right != null) {
            currNode = currNode.right;
        }
        return currNode.value;
    }

    public void printInorder() {
        printInorderRec(root);
        System.out.println("");
    }

    private void printInorderRec(Node currRoot) {
        if (currRoot == null) {
            return;
        } 
        printInorderRec(currRoot.left);
        System.out.print(currRoot.value + " ");
        printInorderRec(currRoot.right);
    }

    public void printPreorder() {
        printPreorderRec(root);
        System.out.println("");
    }

    private void printPreorderRec(Node currRoot) {
        if (currRoot == null) {
            return;
        }
        System.out.print(currRoot.value + " ");
        printPreorderRec(currRoot.left);
        printPreorderRec(currRoot.right);
    }

    public void printPostorder() {
        printPostorderRec(root);
        System.out.println("");
    }

    private void printPostorderRec(Node currRoot) {
        if (currRoot == null) {
            return;
        }
        printPostorderRec(currRoot.left);
        printPostorderRec(currRoot.right);
        System.out.print(currRoot.value + " ");
    }
}

public class BinarySearchTreeDemo {
    public static void main(String[] args) {
        BinarySearchTree bst = new BinarySearchTree();
        bst .insert(40)
            .insert(25)
            .insert(78)
            .insert(10)
            .insert(3)
            .insert(17)
            .insert(32)
            .insert(30)
            .insert(38)
            .insert(78)
            .insert(50)
            .insert(93);
        System.out.println("Inorder traversal");
        bst.printInorder();
        System.out.println("Preorder traversal");
        bst.printPreorder();
        System.out.println("Postorder traversal");
        bst.printPostorder();
        System.out.println("The minimum value in the BST: " + bst.findMinimum());
        System.out.println("The maximum value in the BST: " + bst.findMaximum());
    }
}
