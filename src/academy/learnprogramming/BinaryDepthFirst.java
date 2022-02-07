package academy.learnprogramming;

import java.util.Stack;

public class BinaryDepthFirst {

    public Stack<BinaryNode> stack = new Stack<>();
    private Stack<BinaryNode> result = new Stack<>();

    public BinaryDepthFirst(BinaryNode root) {
        if (root != null){
            stack.push(root);
        }
    }

    public Stack<BinaryNode> performSearch () {
        Stack<BinaryNode> result = new Stack<>();
        if (this.stack.empty()){
            return result;
        }

        while (stack.size() > 0) {
            BinaryNode current = stack.pop();
            result.push(current);

            if (current.right != null){
                stack.push(current.right);
            }

            if (current.left != null){
                stack.push(current.left);
            }

        }

        return result;
    }

    public Stack<BinaryNode> searchRecursive(BinaryNode root){
        if (root == null){
            return result;
        }
        result.push(root);
        searchRecursive(root.left);
        searchRecursive(root.right);
        return result;

    }

    public boolean searchValue (BinaryNode root, char target){
        if (root == null){
            return false;
        }
        if (root.value == target){
            return true;
        }
        return searchValue(root.right, target) || searchValue(root.left, target);
    }

    public Integer treeSum (BinaryNodeInt root) {
        if (root == null) {
            return 0;
        }
        return root.value + treeSum(root.left) + treeSum(root.right);
    }
}
