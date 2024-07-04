package com.example.tennotrader.ui.domain

import android.content.Context
import androidx.work.Worker
import androidx.work.WorkerParameters

open class AppWorker(context: Context, workerParams: WorkerParameters) : Worker(context, workerParams) {

    override fun doWork(): Result {



        return Result.success()
    }

}