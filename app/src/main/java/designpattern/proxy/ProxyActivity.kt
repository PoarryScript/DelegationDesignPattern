package designpattern.proxy

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import nestviewpager.simple.com.delegationdesignpattern.R

/**
 *
 * A proxy, in its most general form, is a class functioning as an interface to something else. The
 * proxy could interface to anything: a network connection, a large object in memory, a file, or
 * some other resource that is expensive or impossible to duplicate. In short, a proxy is a wrapper
 * or agent object that is being called by the client to access the real serving object behind the
 * scenes.
 * <p>
 * The Proxy design pattern allows you to provide an interface to other objects by creating a
 * wrapper class as the proxy. The wrapper class, which is the proxy, can add additional
 * functionality to the object of interest without changing the object's code.
 * <p>
 * In this example the proxy ({@link WizardTowerProxy}) controls access to the actual object (
 * {@link WizardTower}).
 *
 */
class ProxyActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_proxy)

        val proxy: WizardTowerProxy = WizardTowerProxy()
        proxy.enter(Wizard("red Wizard"))
        proxy.enter(Wizard("Black Wizard"))
        proxy.enter(Wizard("White Wizard"))
        proxy.enter(Wizard("Brown Wizard"))
    }
}
