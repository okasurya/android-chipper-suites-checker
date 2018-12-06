package com.oka.sandbox

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_main.*
import java.lang.StringBuilder
import javax.net.ssl.SSLSocketFactory

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val socketFactory: SSLSocketFactory = SSLSocketFactory.getDefault() as SSLSocketFactory
        val stringBuilder = StringBuilder()
        for (chiper in socketFactory.defaultCipherSuites) {
            Log.d("Chiper", chiper)
            stringBuilder.appendln(chiper)
        }
        text.text = stringBuilder.toString()
    }
}
