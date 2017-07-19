package designpattern.state

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import nestviewpager.simple.com.delegationdesignpattern.R
/**
 *
 * In State pattern the container object has an internal state object that defines the current
 * behavior. The state object can be changed to alter the behavior.
 * <p>
 * This can be a cleaner way for an object to change its behavior at runtime without resorting to
 * large monolithic conditional statements and thus improves maintainability.
 * <p>
 * In this example the {@link Mammoth} changes its behavior as time passes by.
 *
 */
class StateActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_state)

        val mammoth:Mmmoth = Mmmoth()
        mammoth.observe()
        mammoth.timePasses()
        mammoth.observe()
        mammoth.timePasses()
        mammoth.observe()
    }
}
