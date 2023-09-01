package helper

import androidx.datastore.core.DataStore
import androidx.datastore.preferences.core.Preferences
import androidx.datastore.preferences.core.edit
import androidx.datastore.preferences.core.stringPreferencesKey
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.first
import kotlinx.coroutines.flow.map

class DataStoreHelper(private val dataStore: DataStore<Preferences>) {
    private val testKey = stringPreferencesKey("test")

    fun getTestData(): Flow<String?> {
        return dataStore.data.map { it[testKey] }
    }

    suspend fun setTestData(value: String) {
        dataStore.edit {
            it[testKey] = value
        }
    }
}