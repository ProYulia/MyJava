package HW5;

public class BinaryNode {

    int name;
    BinaryNode left;
    BinaryNode right;

    public BinaryNode(int name) {
        this.name = name;
    }


    @Override
    public String toString() {
        return "node " + name;
    }
    public static void bypassNode(BinaryNode node) {
        BinaryNode left1 = node.left;
        BinaryNode right1 = node.right;

        if (left1 != null) bypassNode(left1);
        if (right1 != null) bypassNode(right1);

        System.out.println(node);
    }

}
