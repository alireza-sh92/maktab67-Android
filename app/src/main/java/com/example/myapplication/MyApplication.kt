package com.example.myapplication

import android.app.Activity
import android.app.Application
import android.os.Bundle
import android.util.Log
import java.util.*

class MyApplication:Application() {
    companion object{
        const val TAG = "MyApplication"
    }
    override fun onCreate() {
        super.onCreate()
        registerActivityLifecycleCallbacks(object :ActivityLifecycleCallbacks{
            override fun onActivityCreated(p0: Activity, p1: Bundle?) {
                Log.d(TAG,"onActivityCreated")
            }

            override fun onActivityStarted(p0: Activity) {
                Log.d(TAG,"onActivityStarted")
            }

            override fun onActivityResumed(p0: Activity) {
                Log.d(TAG,"onActivityResumed")
            }

            override fun onActivityPaused(p0: Activity) {
                Log.d(TAG,"onActivityPaused")
            }

            override fun onActivityStopped(p0: Activity) {
                Log.d(TAG,"onActivityStopped")
            }

            override fun onActivitySaveInstanceState(p0: Activity, p1: Bundle) {
                Log.d(TAG,"onActivitySaveInstanceState")
            }

            override fun onActivityDestroyed(p0: Activity) {
                Log.d(TAG,"onActivityDestroyed")
            }
        })
    }
}

