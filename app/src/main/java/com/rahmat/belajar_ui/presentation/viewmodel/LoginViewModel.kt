package com.rahmat.belajar_ui.presentation.viewmodel

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.rahmat.belajar_ui.data.model.LoginRequest
import com.rahmat.belajar_ui.data.repository.AuthRepository
import com.rahmat.belajar_ui.util.SessionManager
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class LoginViewModel @Inject constructor(
    private val authRepository: AuthRepository,
    private val sessionManager: SessionManager
) : ViewModel() {

    var email by mutableStateOf("")
        private set

    var password by mutableStateOf("")
        private set

    var isLoading by mutableStateOf(false)
        private set

    var loginSuccess by mutableStateOf(false)
        private set

    var errorMessage by mutableStateOf<String?>(null)
        private set

    fun onEmailChange(newEmail: String) {
        TODO("Add implementation")
    }

    fun onPasswordChange(newPassword: String) {
        TODO("Add implementation")
    }

    fun login() {
        TODO("Add implementation")
    }

    fun resetState() {
        TODO("Add implementation")
    }
}
