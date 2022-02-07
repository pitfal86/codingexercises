package academy.learnprogramming;

import java.util.LinkedList;
import java.util.Queue;

public class BinaryBreadthFirst {
    private Queue<BinaryNode> queue = new LinkedList<>();
    private Queue<BinaryNodeInt> queueInt = new LinkedList<>();

    public BinaryBreadthFirst(BinaryNode root) {
        if (root != null){
            this.queue.add(root);
        }
    }

    public BinaryBreadthFirst(BinaryNodeInt root) {
        if (root != null){
            this.queueInt.add(root);
        }
    }

    public Queue<BinaryNode> performSearch (){
        Queue<BinaryNode> result = new LinkedList<>();

        while (this.queue.size() > 0){
            BinaryNode current = queue.poll();
            result.add(current);
            if (current.left != null){
                queue.add(current.left);
            }
            if (current.right != null){
                queue.add(current.right);
            }
        }

        return result;
    }

    public boolean searchValue (char target){

        while (this.queue.size() > 0){
            BinaryNode current = queue.poll();
            if (current.value == target){
                return true;
            }

            if(current.left != null){
                queue.add(current.left);
            }
            if(current.right != null){
                queue.add(current.right);
            }
        }

        return false;
    }


    public Integer treeSum (BinaryNodeInt root) {
        if (root == null) {
            return 0;
        }
        Integer sumTotal = 0;

        while (this.queueInt.size() > 0){
            BinaryNodeInt current = queueInt.poll();
            sumTotal += current.value;
            if (current.left != null){
                queueInt.add(current.left);
            }
            if (current.right != null){
                queueInt.add(current.right);
            }

        }

        return sumTotal;
    }

}
