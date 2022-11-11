package HW5;

import java.util.ArrayList;

public class TreeNode {

    String value;
    ArrayList<TreeNode> children;
    TreeNode parent;

    public TreeNode(String value){
        this();
        setValue(value);
    }

    public TreeNode() {
        children = new ArrayList<>();
    }
    public void addChild(TreeNode child) {
        child.parent = this;
        children.add(child);
    }

    public void setValue(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "value='" + value;
    }


    public void treeSearch(TreeNode root) {

        ArrayList<TreeNode> storage = new ArrayList<>();
         storage.add(root);

        while (storage.size() > 0) {
            TreeNode node = storage.get(0);
            storage.remove(0);
            System.out.println(node);

            if (node.children.size() != 0) {
                storage.addAll(node.children);
            }
        }

    }
}
