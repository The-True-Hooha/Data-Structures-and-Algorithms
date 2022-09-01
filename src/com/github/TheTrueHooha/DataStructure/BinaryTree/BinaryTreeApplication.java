package Foundation.BinaryTree;

public class BinaryTreeApplication {
    public static void main(String[] args) {
        TreeTraversal tree = new TreeTraversal();

        // sets the binary tree from A, B, C, D, E
        tree.parentNode = new ParentNode('A');
        tree.parentNode.left = new ParentNode('B');
        tree.parentNode.right = new ParentNode('C');
        tree.parentNode.left.left = new ParentNode('D');
        tree.parentNode.left.right = new ParentNode('E');

        // calls the preOrderTraversal pattern
        tree.preOrderTraversal(tree.parentNode);
        System.out.println();
        tree.inOrderTraversal(tree.parentNode);
        System.out.println();
        tree.postOrderTraversal(tree.parentNode);

    }
}

// class parent for parent node
class ParentNode {
    char key;
    ParentNode left, right;

    ParentNode(char key){
        this.key = key;
    }
}

// TreTraversal describes the Binary Tree operation
class TreeTraversal{
    ParentNode parentNode;

    // for preOrderTraversal: the order goes for left, root node, and right
    void preOrderTraversal(ParentNode node){
        if (node != null ){

            System.out.print(node.key+ ""); // checks the parent node first
            preOrderTraversal(node.left);
            preOrderTraversal(node.right);
        }
    }

    // method for in order tree traversal
    void postOrderTraversal(ParentNode node){
        if (node != null){
            postOrderTraversal(node.left);
            postOrderTraversal(node.right);
            System.out.print(node.key+ "");
        }
    }

    // method for in order tree traversal
    void inOrderTraversal(ParentNode node){
        if (node != null){
            inOrderTraversal(node.left);
            System.out.print(node.key+ "");
            inOrderTraversal(node.right);
        }
    }
}
