package designpattern.nullable;

/**
 * Created by yangbo on 2017/7/14.
 */

public final class NullNode implements Node {
    private static NullNode nullNode = new NullNode();

    private NullNode() {
    }

    public static NullNode getInstance() {
        return nullNode;
    }

    @Override
    public String getName() {
        return null;
    }

    @Override
    public int getTreeSize() {
        return 0;
    }

    @Override
    public Node getLeft() {
        return null;
    }

    @Override
    public Node getRight() {
        return null;
    }

    @Override
    public void walk() {

    }
}
