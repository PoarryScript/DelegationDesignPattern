package designpattern.singleton;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import nestviewpager.simple.com.delegationdesignpattern.R;
/**
 * Singleton pattern ensures that the class can have only one existing instance per Java classloader
 * instance and provides global access to it.
 * <p/>
 * One of the risks of this pattern is that bugs resulting from setting a singleton up in a
 * distributed environment can be tricky to debug, since it will work fine if you debug with a
 * single classloader. Additionally, these problems can crop up a while after the implementation of
 * a singleton, since they may start out synchronous and only become async with time, so you it may
 * not be clear why you are seeing certain changes in behaviour.
 * <p/>
 * There are many ways to implement the Singleton. The first one is the eagerly initialized instance
 * in {@link IvoryTower}. Eager initialization implies that the implementation is thread safe. If
 * you can afford giving up control of the instantiation moment, then this implementation will suit
 * you fine.
 * <p/>
 * The other option to implement eagerly initialized Singleton is enum based Singleton. The example
 * is found in {@link EnumIvoryTower}. At first glance the code looks short and simple. However, you
 * should be aware of the downsides including committing to implementation strategy, extending the
 * enum class, serializability and restrictions to coding. These are extensively discussed in Stack
 * Overflow:
 * http://programmers.stackexchange.com/questions/179386/what-are-the-downsides-of-implementing
 * -a-singleton-with-javas-enum
 * <p/>
 * {@link ThreadSafeLazyLoadedIvoryTower} is a Singleton implementation that is initialized on
 * demand. The downside is that it is very slow to access since the whole access method is
 * synchronized.
 * <p/>
 * Another Singleton implementation that is initialized on demand is found in
 * {@link ThreadSafeDoubleCheckLocking}. It is somewhat faster than
 * {@link ThreadSafeLazyLoadedIvoryTower} since it doesn't synchronize the whole access method but
 * only the method internals on specific conditions.
 * <p/>
 * Yet another way to implement thread safe lazily initialized Singleton can be found in
 * {@link InitializingOnDemandHolderIdiom}. However, this implementation requires at least Java 8
 * API level to work.
 */
public class SingletonActivity extends AppCompatActivity {

    private TextView contentTv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_singleton);
        contentTv = (TextView) findViewById(R.id.text);

        StringBuilder sb = new StringBuilder();

        IvoryTower ivoryTower1 = IvoryTower.getInstance();
        IvoryTower ivoryTower2 = IvoryTower.getInstance();

        sb.append("ivoryTower1=" + ivoryTower1 + "\n");
        sb.append("ivoryTower2=" + ivoryTower2 + "\n");


        ThreadSafeLazyLoadedIvoryTower threadSafeLazyLoadedIvoryTower1 = ThreadSafeLazyLoadedIvoryTower.getInstance();
        ThreadSafeLazyLoadedIvoryTower threadSafeLazyLoadedIvoryTower2 = ThreadSafeLazyLoadedIvoryTower.getInstance();

        sb.append("threadSafeLazyLoadedIvoryTower1=" + threadSafeLazyLoadedIvoryTower1 + "\n");
        sb.append("threadSafeLazyLoadedIvoryTower2=" + threadSafeLazyLoadedIvoryTower2 + "\n");

        EnumIvoryTower enumIvoryTower1 = EnumIvoryTower.INSTANCE;
        EnumIvoryTower enumIvoryTower2 = EnumIvoryTower.INSTANCE;
        sb.append("enumIvoryTower1=" + enumIvoryTower1 + "\n");
        sb.append("enumIvoryTower2=" + enumIvoryTower2 + "\n");


        ThreadSafeDoubleCheckLocking threadSafeDoubleCheckLocking1 = ThreadSafeDoubleCheckLocking.getInstance();
        ThreadSafeDoubleCheckLocking threadSafeDoubleCheckLocking2 = ThreadSafeDoubleCheckLocking.getInstance();
        sb.append("threadSafeDoubleCheckLocking1=" + threadSafeDoubleCheckLocking1 + "\n");
        sb.append("threadSafeDoubleCheckLocking2=" + threadSafeDoubleCheckLocking2 + "\n");

        InitializingOnDemandHolderIdiom initializingOnDemandHolderIdiom1 = InitializingOnDemandHolderIdiom.getInstance();
        InitializingOnDemandHolderIdiom initializingOnDemandHolderIdiom2 = InitializingOnDemandHolderIdiom.getInstance();
        sb.append("initializingOnDemandHolderIdiom1=" + initializingOnDemandHolderIdiom1 + "\n");
        sb.append("initializingOnDemandHolderIdiom2=" + initializingOnDemandHolderIdiom2 + "\n");

        contentTv.setText(sb.toString());

    }
}
