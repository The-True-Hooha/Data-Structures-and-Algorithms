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
        if (node != null ){ // checks the parent node
            System.out.println(node.key+ "");
            preOrderTraversal(node.left);
            preOrderTraversal(node.right);
        }
    }
}
