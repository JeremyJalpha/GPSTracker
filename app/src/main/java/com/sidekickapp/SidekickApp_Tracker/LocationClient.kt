package com.sidekickapp.SidekickApp_Tracker

import kotlinx.coroutines.flow.Flow
import android.location.Location

interface LocationClient {
    fun getLocationUpdates(interval: Long):Flow<Location>

    class LocationException(message:String):Exception()
}