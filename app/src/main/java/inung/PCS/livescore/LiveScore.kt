package inung.PCS.livescore

import android.app.Application
import inung.PCS.livescore.data.db.AppDatabase
import inung.PCS.livescore.data.pref.PrefManager
import org.kodein.di.Kodein
import org.kodein.di.KodeinAware
import org.kodein.di.android.x.androidXModule

class LiveScore : Application(), KodeinAware {

    override val kodein = Kodein.lazy {
        import(androidXModule(this@LiveScore))

    }

    companion object {
        @get:Synchronized
        lateinit var instance: LiveScore
        lateinit var prefManager: PrefManager
        lateinit var db: AppDatabase

    }

    override fun onCreate() {
        super.onCreate()
        instance = this
        prefManager = PrefManager(this)
        db = AppDatabase(this)
    }
}