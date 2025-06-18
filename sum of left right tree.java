import java.util.*;
class TreeNode {
    int value;
    TreeNode left;
    TreeNode right;
    TreeNode(int value) {
        this.value = value;
        this.left = null;
        this.right = null;
    }
}
class BinaryTree {
    TreeNode root;
    int count = 0;
    public void inorder(TreeNode node) {
        if (node == null) return;

        inorder(node.left);
        System.out.print(node.value + " ");
        count++;
        inorder(node.right);
    }
    public int height(TreeNode node) {
        if (node == null) return -1;

        int leftHeight = height(node.left);
        int rightHeight = height(node.right);

        return Math.max(leftHeight, rightHeight) + 1;
    }
    public int LeftNodes(TreeNode node) {
        if (node == null) {
           return 0;
        }

        int leftSum = 0;
        if (node.left != null) {
            leftSum =leftSum+ node.left.value;
            leftSum =leftSum+ LeftNodes(node.left);
        }
        leftSum =leftSum+ LeftNodes(node.right);

        return leftSum;
    }
    public int RightNodes(TreeNode node) {
        if (node == null) {
           return 0;
        }

        int rightSum = 0;
        if (node.left != null) {
           rightSum =rightSum+ node.right.value;
           rightSum =rightSum+ RightNodes(node.right);
        }
        rightSum =rightSum+ RightNodes(node.left);

        return rightSum;
    }
}
public class Main {
    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        tree.root = new TreeNode(1);
        tree.root.left = new TreeNode(2);
        tree.root.right = new TreeNode(3);
        tree.root.left.left = new TreeNode(4);
        tree.root.left.right = new TreeNode(5);
        tree.root.right.left = new TreeNode(6);
        tree.root.right.right = new TreeNode(7);

        System.out.println("Inorder Traversal:");
        tree.inorder(tree.root);
        System.out.println();
        System.out.println("No. of nodes: " + tree.count);
        System.out.println("Height of Tree: "+tree.height(tree.root));
        System.out.println("Sum of left nodes: "+tree.LeftNodes(tree.root) );
        System.out.println("Sum of left nodes: "+tree.RightNodes(tree.root) );
    }
}

