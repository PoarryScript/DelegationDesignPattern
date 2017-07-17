package designpattern.nullable;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import nestviewpager.simple.com.delegationdesignpattern.R;
/**
 *
 * Null Object pattern replaces null values with neutral objects. Many times this simplifies
 * algorithms since no extra null checks are needed.
 * <p>
 * In this example we build a binary tree where the nodes are either normal or Null Objects. No null
 * values are used in the tree making the traversal easy.
 *
 */
public class NullAbleActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_null_able);
        Node root =
                new NodeImpl("1", new NodeImpl("11", new NodeImpl("111", NullNode.getInstance(),
                        NullNode.getInstance()), NullNode.getInstance()), new NodeImpl("12",
                        NullNode.getInstance(), new NodeImpl("122", NullNode.getInstance(),
                        NullNode.getInstance())));

        root.walk();
    }
}
