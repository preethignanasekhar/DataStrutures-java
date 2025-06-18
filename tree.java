

class TreeNode{
    int value;
    TreeNode left;
    TreeNode right;
    
    TreeNode(int value){
        this.value = value;
        this.left = null;
        this.right = null;
    }
}

class BinaryTree{
    TreeNode root;
    public void inorder(TreeNode node){
        if(node==null){
            return;
        }
        inorder(node.left);
        System.out.print(node.value + " ");
        inorder(node.right);
    }
    
    public void preorder(TreeNode node){
        if(node==null){
            return;
        }
        System.out.print(node.value + " ");
        preorder(node.left);
        preorder(node.right);
    }
    
      public void postorder(TreeNode node){
        if(node==null){
            return;
        }
        
        postorder(node.left);
        postorder(node.right);
        System.out.print(node.value + " ");
    }
}


public class Main{
    public static void main(String[] args){
        BinaryTree tree = new BinaryTree();
        tree.root = new TreeNode(1);
        tree.root.left=new TreeNode(2);
        tree.root.right = new TreeNode(3);
        tree.root.left.left = new TreeNode(4);
        tree.root.left.right=new TreeNode(5);
        tree.root.right.left = new TreeNode(6);
        tree.root.right.right = new TreeNode(7);
        
        System.out.println("Inorder Travesal");
        tree.inorder(tree.root);
        
         System.out.println("preorder Travesal");
        tree.preorder(tree.root);
        
         System.out.println("postorder Travesal");
        tree.postorder(tree.root);
        
    }
}