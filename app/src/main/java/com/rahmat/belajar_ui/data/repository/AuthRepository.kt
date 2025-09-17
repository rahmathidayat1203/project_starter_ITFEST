package com.rahmat.belajar_ui.data.repository

import com.rahmat.belajar_ui.data.model.LoginRequest
import com.rahmat.belajar_ui.data.model.LoginResponse
import com.rahmat.belajar_ui.data.model.RegisterRequest
import com.rahmat.belajar_ui.data.model.RegisterResponse
import com.rahmat.belajar_ui.data.model.TopUpRequest
import com.rahmat.belajar_ui.data.model.TransferRequest
import com.rahmat.belajar_ui.data.model.User
import com.rahmat.belajar_ui.data.model.Wallet
import com.rahmat.belajar_ui.data.remote.ApiService
import retrofit2.Response
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class AuthRepository @Inject constructor(
    private val apiService: ApiService
) {
    suspend fun login(request: LoginRequest): Response<LoginResponse> {
        TODO("Add implementation")
    }

    suspend fun register(request: RegisterRequest): Response<RegisterResponse> {
        TODO("Add implementation")
    }

    suspend fun logout(): Response<Unit> {
        TODO("Add implementation")
    }

    suspend fun getUser(): Response<User> {
        TODO("Add implementation")
    }

    suspend fun getWallet(): Response<Wallet> {
        TODO("Add implementation")
    }

    suspend fun topUp(request: TopUpRequest): Response<Unit> {
        TODO("Add implementation")
    }

    suspend fun transfer(request: TransferRequest): Response<Unit> {
        TODO("Add implementation")
    }
}