package designpattern.callback

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import nestviewpager.simple.com.delegationdesignpattern.R

open class CallBackActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_call_back)
        val  task :Task=  SimpleTask()
        val  callback :Callback = Callback({
            System.out.println("CallBackActivity:"+this)
        })
        task.executeWEith(callback)

    }
}
