package designpattern.observer

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import nestviewpager.simple.com.delegationdesignpattern.R
/**
 *
 * The Observer pattern is a software design pattern in which an object, called the subject,
 * maintains a list of its dependents, called observers, and notifies them automatically of any
 * state changes, usually by calling one of their methods. It is mainly used to implement
 * distributed event handling systems. The Observer pattern is also a key part in the familiar
 * model–view–controller (MVC) architectural pattern. The Observer pattern is implemented in
 * numerous programming libraries and systems, including almost all GUI toolkits.
 * <p>
 * In this example {@link Weather} has a state that can be observed. The {@link Orcs} and
 * {@link Hobbits} register as observers and receive notifications when the {@link Weather} changes.
 *
 */
class ObserverActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_observer)
        val weather :Weather = Weather()
        weather.addObserver {  Orcs()}

        weather.timePasses()
        weather.timePasses()
        weather.timePasses()
        weather.timePasses()

    }
}
