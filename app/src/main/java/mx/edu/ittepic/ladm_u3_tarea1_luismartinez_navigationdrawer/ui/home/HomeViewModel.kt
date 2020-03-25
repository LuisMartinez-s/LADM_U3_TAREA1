package mx.edu.ittepic.ladm_u3_tarea1_luismartinez_navigationdrawer.ui.home

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class HomeViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
            value = "Mis apps y Juegos"
    }
    val text: LiveData<String> = _text
}