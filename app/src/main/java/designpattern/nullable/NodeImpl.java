package designpattern.nullable;

/**
 * Created by yangbo on 2017/7/14.
 */


public final class NodeImpl implements Node {
    private final String name;
    private final Node left;
    private final Node right;

    public NodeImpl(String name, Node left, Node right) {
        this.name = name;
        this.left = left;
        this.right = right;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getTreeSize() {
        return 1 + left.getTreeSize() + right.getTreeSize();
    }

    @Override
    public Node getLeft() {
        return left;
    }

    @Override
    public Node getRight() {
        return right;
    }

    @Override
    public void walk() {
        System.out.println("Node:" + name);
        if (left.getTreeSize()>0){
            left.walk();
        }
        if (right.getTreeSize()>0){
            right.walk();
        }
    }
}
