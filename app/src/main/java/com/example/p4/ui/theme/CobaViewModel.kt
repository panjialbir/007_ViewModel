package com.example.p4.ui.theme

import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import com.example.p4.Data.DataForm
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update

class CobaViewModel: ViewModel() {
    var namaUser : String by mutableStateOf(value = )
        private set
    var noTlp : String by mutableStateOf(value= )
        private set
    var almEmail : String by mutableStateOf(value= )
        private set
    var jenisKl : String by mutableStateOf("")
        private set
    var sTatus : String by mutableStateOf("")
        private set
    private  val _uiState = MutableStateFlow(DataForm())
    val uiState: StateFlow<DataForm> = _uiState.asStateFlow()

    fun BacaData(nm: String, tlp: String, eml: String, jk: String, sts: String){
        namaUser = nm;
        noTlp = tlp;
        almEmail = eml;
        jenisKl = jk;
        sTatus = sts;

    }

    fun setJenisK(pilihJK:String){
        _uiState.update {(
            var sex = pilihJK)
            DataForm()
        }
    }
    fun setJenisSt(pilihSt:String){
        _uiState.update {(
            var status = pilihSt)
            DataForm()
        }
    }
}
