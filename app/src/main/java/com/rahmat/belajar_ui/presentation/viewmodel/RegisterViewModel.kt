package com.rahmat.belajar_ui.presentation.viewmodel

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.rahmat.belajar_ui.data.model.RegisterRequest
import com.rahmat.belajar_ui.data.repository.AuthRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class RegisterViewModel @Inject constructor(
    private val authRepository: AuthRepository
) : ViewModel() {

    var name by mutableStateOf("")
        private set

    var email by mutableStateOf("")
        private set

    var password by mutableStateOf("")
        private set

    var passwordConfirmation by mutableStateOf("")
        private set

    var isLoading by mutableStateOf(false)
        private set

    var registrationSuccess by mutableStateOf(false)
        private set

    var errorMessage by mutableStateOf<String?>(null)
        private set

    fun onNameChange(newName: String) {
        TODO("Add implementation")
    }

    fun onEmailChange(newEmail: String) {
        TODO("Add implementation")
    }

    fun onPasswordChange(newPassword: String) {
        TODO("Add implementation")
    }

    fun onPasswordConfirmationChange(newPasswordConfirmation: String) {
        TODO("Add implementation")
    }

    fun register() {
        TODO("Add implementation")
    }

    fun resetState() {
        TODO("Add implementation")
    }
}
