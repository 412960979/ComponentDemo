package com.wn

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.alibaba.android.arouter.launcher.ARouter

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        ARouter.getInstance().inject(this)// 这行注入可以写在基类里面

        findViewById<TextView>(R.id.tv_route).setOnClickListener {
            ARouter.getInstance().build("/component/index").navigation()
        }
    }
}
