package com.example.p4.ui.theme

import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import com.example.p4.Data.DataForm
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update

class CobaViewModel: ViewModel {
    var namaUser : String by mutableStateOf(value="")
        private set
    var noTlp : String by mutableStateOf(value="")
        private set
    var jenisKl : String by mutableStateOf(value="")
        private set
    private  val _uiState = MutableStateFlow(DataForm())
    val uiState: StateFlow<DataForm> = _uiState.asStateFlow()

    fun BacaData(nm: String, tlp: String, jk: String){
        namaUser = nm;
        noTlp = tlp;
        jenisKl = jk;
    }

    fun setJenisK(pilihJK:String){
        _uiState.update {(sex = pilihJK)
            DataForm()
        }
    }
}