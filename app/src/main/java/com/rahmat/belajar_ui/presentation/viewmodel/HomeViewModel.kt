package com.rahmat.belajar_ui.presentation.viewmodel

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.rahmat.belajar_ui.data.model.TopUpRequest
import com.rahmat.belajar_ui.data.model.TransferRequest
import com.rahmat.belajar_ui.data.model.User
import com.rahmat.belajar_ui.data.model.Wallet
import com.rahmat.belajar_ui.data.repository.AuthRepository
import com.rahmat.belajar_ui.util.SessionManager
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class HomeViewModel @Inject constructor(
    private val authRepository: AuthRepository,
    private val sessionManager: SessionManager
) : ViewModel() {

    var user by mutableStateOf<User?>(null)
        private set

    var wallet by mutableStateOf<Wallet?>(null)
        private set

    var isLoading by mutableStateOf(false)
        private set

    var errorMessage by mutableStateOf<String?>(null)
        private set

    var topUpSuccess by mutableStateOf(false)
        private set

    var transferSuccess by mutableStateOf(false)
        private set

    init {
        TODO("Add implementation")
    }

    fun fetchData() {
        TODO("Add implementation")
    }

    fun logout() {
        TODO("Add implementation")
    }

    fun topUp(amount: Double) {
        TODO("Add implementation")
    }

    fun transfer(email: String, amount: Double) {
        TODO("Add implementation")
    }

    fun resetState() {
        TODO("Add implementation")
    }
}
