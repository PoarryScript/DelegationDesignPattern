package designpattern.nullable;

/**
 * Created by yangbo on 2017/7/14.
 */

public interface Node {
    String getName();
    int getTreeSize();
    Node getLeft();
    Node getRight();
    void walk();
}
