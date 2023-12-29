class TreeNode {
    int val;
    TreeNode left, right;

    TreeNode(int val) {
        this.val = val;
    }
}

public class FlattenBinaryTree {

    // Approach 1: Recursive Pre-order Traversal
    public void flattenRecursive(TreeNode root) {
        if (root == null) {
            return;
        }

        flattenRecursive(root.left);
        flattenRecursive(root.right);

        TreeNode left = root.left;
        TreeNode right = root.right;

        root.left = null;
        root.right = left;

        TreeNode current = root;
        while (current.right != null) {
            current = current.right;
        }

        current.right = right;
    }

    // Approach 2: Morris Traversal
    public void flattenMorris(TreeNode root) {
        TreeNode current = root;

        while (current != null) {
            if (current.left != null) {
                TreeNode predecessor = current.left;

                while (predecessor.right != null) {
                    predecessor = predecessor.right;
                }

                predecessor.right = current.right;
                current.right = current.left;
                current.left = null;
            }

            current = current.right;
        }
    }

    // Helper method to print the flattened list
    private static void printFlattenedList(TreeNode head) {
        while (head != null) {
            System.out.print(head.val + " ");
            head = head.right;
        }
        System.out.println();
    }

    // Main method for example usage
    public static void main(String[] args) {
        FlattenBinaryTree flattenBinaryTree = new FlattenBinaryTree();

        // Example Binary Tree
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(5);
        root.left.left = new TreeNode(3);
        root.left.right = new TreeNode(4);
        root.right.right = new TreeNode(6);

        // Flattening using Recursive Pre-order Traversal
        flattenBinaryTree.flattenRecursive(root);
        System.out.println("Flattened Tree (Recursive):");
        printFlattenedList(root);

        // Reset the tree for Morris Traversal
        root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(5);
        root.left.left = new TreeNode(3);
        root.left.right = new TreeNode(4);
        root.right.right = new TreeNode(6);

        // Flattening using Morris Traversal
        flattenBinaryTree.flattenMorris(root);
        System.out.println("Flattened Tree (Morris):");
        printFlattenedList(root);
    }
}

