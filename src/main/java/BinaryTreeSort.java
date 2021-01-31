import java.util.*;


public class BinaryTreeSort {

//    public class Node {
//        public Node left;
//        public Node right;
//        public int value;
//
//        public Node(Node l, Node r, int v) {
//            left = l;
//            right = r;
//            value = v;
//        }
//    }

    public static List<Integer> treeByLevels(Node node) {
        if(node == null) return new ArrayList<>();
        List<Integer> result = new ArrayList<>();

        Queue<Node> queue=new LinkedList<>();
        queue.add(node);
        while(!queue.isEmpty())
        {
            Node tempNode=queue.poll();
            result.add(tempNode.value);
            if(tempNode.left!=null)
                queue.add(tempNode.left);
            if(tempNode.right!=null)
                queue.add(tempNode.right);
        }

        return  result;
    }


}
