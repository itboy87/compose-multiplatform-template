package di

import androidx.datastore.core.DataStore
import androidx.datastore.preferences.core.Preferences
import createDataStore
import dataStoreFileName
import java.io.File

fun provideDataStore(): DataStore<Preferences> = createDataStore(
    producePath = { "${File(System.getProperty("java.io.tmpdir")).absolutePath}/$dataStoreFileName" }
)