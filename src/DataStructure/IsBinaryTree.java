package DataStructure;

public class IsBinaryTree {

    static class Node {
        int val;
        Node left;
        Node right;

        public Node(int val, Node left, Node right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    public static void main(String[] args) {

    }

    // 判断一个二叉数是否为二叉排序树
    boolean isBinaryTree(Node root) {

        if (root == null) {
            return true;
        }

        if (root.left != null && root.val < root.left.val) return false;
        if (root.right != null && root.val > root.right.val) return false;

        return isBinaryTree(root.left) && isBinaryTree(root.right);
    }

}
