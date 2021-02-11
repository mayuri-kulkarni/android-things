package com.mk.androiddirectory.util.networkUtil

import android.content.Context
import android.content.Context.WIFI_SERVICE
import android.net.wifi.WifiManager


//region  context extension function getIp()
// required permissions


//endregion


fun Context.getIp():String{
    val wm = this.getSystemService(WIFI_SERVICE) as WifiManager?
    val ip: String = wm!!.connectionInfo.ipAddress.toString()
    return ip;
}