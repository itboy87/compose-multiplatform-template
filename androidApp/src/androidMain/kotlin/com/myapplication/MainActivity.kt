package com.myapplication

import MainView
import android.os.Bundle
import di.initKoin
import moe.tlaster.precompose.lifecycle.PreComposeActivity
import moe.tlaster.precompose.lifecycle.setContent
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger

class MainActivity : PreComposeActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        initKoin(enableNetworkLogs = true) {
            androidLogger()
            androidContext(this@MainActivity.applicationContext)
        }

        setContent {
            MainView()
        }
    }
}